let botao = document.getElementById("btEntrar")
let formulario = document.getElementsByTagName("form")
botao.addEventListener("click", validacao)

function validacao() {
  let ok = true

  if (validanome(document.getElementById("idnome").value)) {
    alert("Nome válido")
  } else {
    alert("Nome inválido")
  }
  if (validasenha(document.getElementById("idsenha").value)) {
    alert("Senha válida")
  } else {
    alert("Senha inválida")
  }
  if (ok == true) {
    formulario[0].submit(this)
  }
}
