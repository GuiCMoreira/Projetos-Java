function validanome(valor) {
  let vetor = valor.split("")
  if (vetor.length >= 2 && vetor[0].length >= 3) {
    return true
  } else {
    return false
  }
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
