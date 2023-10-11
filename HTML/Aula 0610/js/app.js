//definindo variaveis gloabais

let local = document.getElementById("localTabela")
let dados = [
  {nome:"Sapato", descricao:"Sapato Preto em Couro", qtd:10},
  {nome:"Chinelo", descricao:"Chinelo de alças", qtd:100},
  {nome:"Paletó", descricao:"Azul Marinho", qtd:5}
]

function createElement() {
  let table = document.createElement("table") //palavra reservada html
  let linha = document.createElement("tr") // table row
  let cab01 = document.createElement("th") // table header (cabeçalho)
  let cab02 = document.createElement("th")
  let cab03 = document.createElement("th")

  cab01.innerHTML = "Coluna 01"
  cab02.innerHTML = "Coluna 02"
  cab03.innerHTML = "Coluna 03"

  linha.appendChild(cab01) // inserir um elemento dentro de outro
  linha.appendChild(cab02)
  linha.appendChild(cab03)
  table.appendChild(linha)

  let conta = 1

  for (let item in dados) {
    let novalinha = document.createElement("tr")
    let col01 = document.createElement("td") //table data
    let col02 = document.createElement("td")
    let col03 = document.createElement("td")

    col01.innerHTML = dados[item].nome
    col02.innerHTML = dados[item].descricao
    col03.innerHTML = dados[item].qtd

    conta++

    novalinha.appendChild(col01)
    novalinha.appendChild(col02)
    novalinha.appendChild(col03)
    table.appendChild(novalinha)
  }

  local.appendChild(table)
  let bot1 = document.createElement("input")
  bot1.type = "submit"
  let bot2 = document.createElement("input")
  bot2.type = "submit"
  bot2.value = "Mostrar Mensagem"
  bot2.addEventListener("click", function() {
    alert("OI")
  })
  local.appendChild(bot1)
  local.appendChild(bot2)
}

createElement()
