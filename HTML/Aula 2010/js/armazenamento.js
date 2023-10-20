//Comando para gravar no LocalStorage
window.localStorage.setItem("Uma Data", "20 de Outubro")

let vetor = ["abacaxi", 8.5]
window.localStorage.setItem("Meu Vetor", vetor)

//Usando stringfy
let vetorSerializado = JSON.stringify(vetor)
window.localStorage.setItem("Meu Vetor 2", vetorSerializado)

//Usar Stringfy com objeto
let umObjeto = { professor: "Luciano", disciplina: "Javascript" }
let objetoSerializado = JSON.stringify(umObjeto)
window.localStorage.setItem("Meu Objeto", objetoSerializado)
