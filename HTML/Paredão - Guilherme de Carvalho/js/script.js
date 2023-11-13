const container = document.getElementById("container")
const bar = document.getElementById("bar")
const ball = document.getElementById("ball")
const scoreElement = document.getElementById("score")

let score = 0
let ballSpeedX = 2
let ballSpeedY = 3
let barWidth = 80

let ballX = 200
let ballY = 200
let barX = 160
let pointsToWin = 2 // Alteração: Dois pontos para vencer
let wonPoints = 0

function update() {
  ballX += ballSpeedX
  ballY += ballSpeedY

  if (ballX >= 380 || ballX <= 0) {
    ballSpeedX = -ballSpeedX
  }

  if (ballY <= 0) {
    ballSpeedY = -ballSpeedY
  }

  if (ballY >= 370) {
    if (ballX >= barX && ballX <= barX + barWidth) {
      ballSpeedY = -ballSpeedY
      score++
      scoreElement.innerText = `Pontuação: ${score}`
      increaseBallSpeed()
    } else {
      resetGame()
    }
  }

  ball.style.left = ballX + "px"
  ball.style.top = ballY + "px"

  if (
    barWidth >= container.clientWidth &&
    ballY >= 370 &&
    wonPoints < pointsToWin
  ) {
    wonPoints++
  }

  if (wonPoints === pointsToWin && ballY >= 370) {
    score += pointsToWin
    scoreElement.innerText = `Pontuação: ${score}`
    winGame()
  }
}

function updateBar(e) {
  const rect = container.getBoundingClientRect()
  barX = e.clientX - rect.left - barWidth / 2
  if (barX < 0) {
    barX = 0
  }
  if (barX > rect.width - barWidth) {
    barX = rect.width - barWidth
  }
  bar.style.left = barX + "px"
}

function increaseBallSpeed() {
  ballSpeedX *= 1.1
  ballSpeedY *= 1.1
  barWidth *= 1.05
  bar.style.width = barWidth + "px"
}

function resetGame() {
  ballX = 200
  ballY = 200
  score = 0
  ballSpeedX = 2
  ballSpeedY = 3
  barWidth = 80
  bar.style.width = barWidth + "px"
  scoreElement.innerText = `Pontuação: ${score}`
  wonPoints = 0
}

function winGame() {
  alert("Parabéns, você venceu o jogo!")
  resetGame()
}

setInterval(update, 16)
document.addEventListener("mousemove", updateBar)
