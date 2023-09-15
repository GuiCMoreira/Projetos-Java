let velocidade = 10
let bola = document.getElementById("bolinha")
let coordBola = bola.getBoundingClientRect()
let coordArea = area.getBoundingClientRect()
let mc = 0
let mb = 0
let md = 0
let me = 0
let documento = document
documento.addEventListener("keydown", (event) => teclado(event))
documento.addEventListener("keydown", mover)

function teclado(tecla) {
  switch (tecla.code) {
    case "ArrowUp":
      mc = -velocidade
      break
    case "ArrowDown":
      mb = +velocidade
      break
    case "ArrowLeft":
      me = -velocidade
      break
    case "ArrowRight":
      md = +velocidade
      break
    case "KeyW":
      velocidade++
      break
    case "KeyS":
      velocidade--
      break

    default:
      mc = 0
      mb = 0
      me = 0
      md = 0
      break
  }
}

function mover() {
  bola.style.top = Math.trunc(coordBola.top - coordArea.top) + (mc + mb) + "px"
  bola.style.left =
    Math.trunc(coordBola.left - coordArea.left) + (md + me) + "px"
  coordBola = bola.getBoundingClientRect()

  mc = 0
  mb = 0
  me = 0
  md = 0
}
