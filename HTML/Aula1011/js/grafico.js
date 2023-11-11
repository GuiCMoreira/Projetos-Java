let localExibicao
let origemDados
let matriz = []
function exibirGrafico(origem, destino) {
  let localExibicao = document.getElementById(destino)
  origemDados = document.getElementById(origem)
  let vetor = origemDados.innerHTML.split("\n")
  for (let i = 0; i < vetor.length; i++) {
    dado = vetor[i].split(",")
    if (i !== 0) {
      dado[1] = parseFloat(dado[1])
      dado[2] = parseFloat(dado[2])
    }
    matriz.push(dado)
  }
  google.charts.load("current", { packages: ["corechart"] })
  google.charts.setOnLoadCallback(drawChart)
}

function drawChart() {
  let data = google.visualization.arrayToDataTable(matriz)
  let options = {
    title: "Gráfico de Barras",
    legend: { position: "right" },
    colors: ["purple", "lime"],
    width: 800,
    height: 600,
  }
  let chart = new google.visualization.LineChart(
    document.getElementById("grafico")
  )
  chart.draw(data, options)
}
