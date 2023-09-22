let hor = document.getElementById("horas")
let min = document.getElementById("minutos")
let seg = document.getElementById("segundos")

let startbotao = document.getElementById("bstart")
let markbotao = document.getElementById("bmark")
let stopbotao = document.getElementById("bstop")
let resetbotao = document.getElementById("breset")
let times = document.getElementById("times")

let parado = true

startbotao.addEventListener("click", startcronometro)
markbotao.addEventListener("click", markcronometro)
stopbotao.addEventListener("click", stopcronometro)
resetbotao.addEventListener("click", resetcronometro)

function startcronometro() {
  cronometro = setInterval(function () {
    seg++
    if (seg === 60) {
      seg = 0
      min++
    }
    min.textContent = min < 10 ? "0" + min : min
    seg.textContent = seg < 10 ? "0" + seg : seg
  }, 1000)
}

function markcronometro() {}

function stopcronometro() {}

function resetcronometro() {}
