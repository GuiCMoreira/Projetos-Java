//Validar Email
function validaemail(valor) {
  let vetor = valor.split("")
  let tamanho = valor.length
  let valido = false
  for (let i = 0; i < tamanho; i++) {
    valido = valido || vetor[i] == "@"
  }
  return valido
}

function validasenha(valor) {
  let tamanho = valor.length
  if (tamanho < 6) {
    return false
  }
  let vetor = valor.split("")

  //testar se possui numeros na senha
  let valido = false
  for (let i = 0; i < tamanho; i++) {
    valido = valido || !isNaN(vetor[i])
  }
  if (!valido) {
    return false
  }

  //testar se possui letras maiusculas na senha
  valido = false
  for (let i = 0; i < tamanho; i++) {
    valido = valido || (vetor[i] >= "A" && vetor[i] <= "Z")
  }
  if (!valido) {
    return false
  }

  //testar caracter especial
  valido = false
  for (let i = 0; i < tamanho; i++) {
    valido = valido || "!@#$%¨&*()_+".includes(vetor[i])
  }
  if (!valido) {
    return false
  }

  return true
}
