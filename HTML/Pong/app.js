let velocidade = 10
let bola = document.getElementById("bolinha")
let area = document.getElementById("area")
let documento = document
documento.addEventListener("keydown", (event) => teclado(event))
documento.addEventListener("keydown", mover)

function teclado(tecla) {
  switch (tecla.code) {
    case "ArrowUp":
      if (bola.offsetTop - velocidade >= 0) {
        bola.style.top = bola.offsetTop - velocidade + "px"
      }
      break
    case "ArrowDown":
      if (
        bola.offsetTop + bola.clientHeight + velocidade <=
        area.clientHeight
      ) {
        bola.style.top = bola.offsetTop + velocidade + "px"
      }
      break
    case "ArrowLeft":
      if (bola.offsetLeft - velocidade >= 0) {
        bola.style.left = bola.offsetLeft - velocidade + "px"
      }
      break
    case "ArrowRight":
      if (bola.offsetLeft + bola.clientWidth + velocidade <= area.clientWidth) {
        bola.style.left = bola.offsetLeft + velocidade + "px"
      }
      break
    case "KeyW":
      velocidade++
      break
    case "KeyS":
      velocidade--
      break
  }
}