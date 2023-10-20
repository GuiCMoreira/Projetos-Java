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

let umObjeto2 = { professor: "Paulo", disciplina: "Paint" }
let listaProf = { umObjeto, umObjeto2 }
let listaSerializada = JSON.stringify(listaProf)
window.localStorage.setItem("Lista", listaSerializada)

//Processos para leitura do localStorage
let corpo = document.getElementById("exibe")
corpo.innerHTML += window.localStorage.getItem("Uma Data")
corpo.innerHTML += "<br>"
corpo.innerHTML += window.localStorage.getItem("Meu Vetor")
corpo.innerHTML += "<br>"
corpo.innerHTML += window.localStorage.getItem("Meu Vetor 2")
corpo.innerHTML += "<br>"
corpo.innerHTML += window.localStorage.getItem("Meu Objeto")
corpo.innerHTML += "<br>"
corpo.innerHTML += JSON.parse(window.localStorage.getItem("Lista"))

//Recuperando para variaveis
let novoVetor = JSON.parse(window.localStorage.getItem("Meu Vetor 2"))
let novoObjeto = JSON.parse(window.localStorage.getItem("Meu Objeto"))
let novaLista = JSON.parse(window.localStorage.getItem("Lista"))

corpo.innerHTML += novoVetor[0]
corpo.innerHTML += "<br>"
corpo.innerHTML += novoVetor[1]
corpo.innerHTML += "<br>"

corpo.innerHTML += novoObjeto.professor + "<--->"
corpo.innerHTML += novoObjeto.disciplina + "<br>"

let erro = window.localStorage.getItem("Meu Objeto")
corpo.innerHTML += erro.professor

function gravar(nomeDaChave, conteudo) {
  let serializado = JSON.stringify(conteudo)
  if (localStorage) {
    localStorage.setItem(nomeDaChave, serializado)
  } else {
    alert("Storage não disponível")
  }
}

function ler(nomeDaChave) {
  if (Storage) {
    let conteudo = JSON.parse(localStorage.getItem(nomeDaChave))
    return conteudo
  } else {
    alert("Storage não disponível")
  }
}
