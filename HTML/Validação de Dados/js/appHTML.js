let botao = document.getElementById("btEntrar")
let formulario = document.getElementsByTagName("form")
botao.addEventListener("click", validacao)

function validacao() {
  let ok = true

  if (validaemail(document.getElementById("idnome").value)) {
    alert("Email válido")
  } else {
    alert("Email inválido")
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
