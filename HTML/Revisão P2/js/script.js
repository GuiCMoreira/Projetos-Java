let badicionar = document.getElementById("badicionar")
let bpesquisar = document.getElementById("bpesquisar")

badicionar.addEventListener("click", function () {
  let vt1 = [nome.value, telefone.value]
  let vt2 = JSON.stringify(vt1)
  window.localStorage.setItem("Dados", vt2)
})

bpesquisar.addEventListener("click", function () {})

function gravar(nomeDaChave, conteudo) {
  let serializado = JSON.stringify(conteudo)
  if (localStorage) {
    localStorage.setItem(nomeDaChave, serializado)
  } else {
    alert("Storage não disponível")
  }
}
