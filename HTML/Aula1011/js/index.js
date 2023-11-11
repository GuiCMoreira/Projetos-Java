let arquivo = document.getElementById("arquivo")
arquivo.addEventListener("change", function () {
  lerArquivo("arquivo", "info")
})

let executar = document.getElementById("exibir")
executar.addEventListener("click", function () {
  exibirGrafico("info", "grafico")
})
