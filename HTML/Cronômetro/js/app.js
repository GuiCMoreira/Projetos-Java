// Variáveis para controle do cronômetro
let startTime
let interval
let running = false
const maxMarks = 5
const markTimes = []

// Elementos HTML
const tempoElement = document.getElementById("tempo")
const bstartElement = document.getElementById("bstart")
const bmarkElement = document.getElementById("bmark")
const bstopElement = document.getElementById("bstop")
const bresetElement = document.getElementById("breset")
const marcacoesElement = document.querySelector(".marcacoes")

// Função para formatar o tempo no cronômetro
function formatTime(ms) {
  const minutes = Math.floor(ms / 60000)
  const seconds = Math.floor((ms % 60000) / 1000)
  const milliseconds = ms % 1000
  return `${minutes.toString().padStart(2, "0")}:${seconds
    .toString()
    .padStart(2, "0")}:${milliseconds.toString().padStart(3, "0")}`
}

// Função para adicionar uma marcação
function addMark() {
  const currentTime = tempoElement.textContent
  markTimes.unshift(currentTime) // Adicionar no início do array

  // Remover a marcação mais antiga se houver mais do que o máximo
  if (markTimes.length > maxMarks) {
    markTimes.pop() // Remover do final do array
  }

  // Atualizar a lista de marcações na interface
  updateMarkList()
}

// Função para atualizar a lista de marcações na interface
function updateMarkList() {
  marcacoesElement.innerHTML = ""
  for (let i = 0; i < markTimes.length; i++) {
    const markElement = document.createElement("span")
    markElement.textContent = markTimes[i]
    marcacoesElement.appendChild(markElement)
  }
}

// Função para atualizar o cronômetro
function updateTimer() {
  const currentTime = Date.now()
  const elapsedTime = currentTime - startTime
  tempoElement.textContent = formatTime(elapsedTime)
}

// Evento de clique no botão "START"
bstartElement.addEventListener("click", () => {
  if (!running) {
    startTime = Date.now() - (markTimes.length > 0 ? parseInt(markTimes[0]) : 0)
    interval = setInterval(updateTimer, 10)
    running = true
    bstartElement.value = "PAUSE"
  } else {
    clearInterval(interval)
    running = false
    bstartElement.value = "RESUME"
  }
})

// Evento de clique no botão "MARK"
bmarkElement.addEventListener("click", () => {
  if (running) {
    addMark()
  }
})

// Evento de clique no botão "STOP"
bstopElement.addEventListener("click", () => {
  clearInterval(interval)
  running = false
  bstartElement.value = "START"
})

// Evento de clique no botão "RESET"
bresetElement.addEventListener("click", () => {
  clearInterval(interval)
  running = false
  bstartElement.value = "START"
  tempoElement.textContent = "00:00:000"
  markTimes.length = 0 // Limpa todas as marcações
  marcacoesElement.innerHTML = ""
})
