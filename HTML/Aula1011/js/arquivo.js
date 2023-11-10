function lerArquivo(nomeArquivo, localExibicao) {
  let arq = document.getElementById(nomeArquivo)
  let exibe = document.getElementById(localExibicao)

  if (window.File && window.FileReader && window.Blob) {
    let carregarArquivo = arq.files[0]
    let leitorArquivo = new FileReader()

    leitorArquivo.onload = function () {
      exibe.innerHTML = leitorArquivo.result.replaceAll(";", ",")
    }
    leitorArquivo.readAsText(carregarArquivo)
  } else {
    alert("O navegador não suporta a leitura de arquivos")
  }
}
