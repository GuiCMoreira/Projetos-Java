let bola = document.getElementById("bola")
let area = document.getElementById("area")
let paddle1 = document.getElementById("paddle1")
let paddle2 = document.getElementById("paddle2")
let bolaX = 290,
  bolaY = 190,
  velocidadeX = 3,
  velocidadeY = 3

function gameLoop() {
  bolaX += velocidadeX
  bolaY += velocidadeY

  if (bolaY >= 380 || bolaY <= 0) {
    velocidadeY = -velocidadeY
  }

  if (bolaX >= 590 || bolaX <= 0) {
    // resetar a bola
    bolaX = 290
    bolaY = 190
  }

  if (
    bolaX <= 20 &&
    bolaY + 20 >= parseInt(paddle1.style.top) &&
    bolaY <= parseInt(paddle1.style.top) + 80
  ) {
    velocidadeX = -velocidadeX
  }

  if (
    bolaX >= 570 &&
    bolaY + 20 >= parseInt(paddle2.style.top) &&
    bolaY <= parseInt(paddle2.style.top) + 80
  ) {
    velocidadeX = -velocidadeX
  }

  bola.style.top = bolaY + "px"
  bola.style.left = bolaX + "px"

  requestAnimationFrame(gameLoop)
}

document.addEventListener("keydown", function (event) {
  const key = event.key
  if (key === "w" && parseInt(paddle1.style.top) >= 10) {
    paddle1.style.top = parseInt(paddle1.style.top) - 20 + "px"
  } else if (key === "s" && parseInt(paddle1.style.top) <= 320) {
    paddle1.style.top = parseInt(paddle1.style.top) + 20 + "px"
  }

  if (key === "ArrowUp" && parseInt(paddle2.style.top) >= 10) {
    paddle2.style.top = parseInt(paddle2.style.top) - 20 + "px"
  } else if (key === "ArrowDown" && parseInt(paddle2.style.top) <= 320) {
    paddle2.style.top = parseInt(paddle2.style.top) + 20 + "px"
  }
})

gameLoop()
