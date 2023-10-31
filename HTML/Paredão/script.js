const bar = document.getElementById("bar")
const ball = document.getElementById("ball")
const scoreDisplay = document.getElementById("score")

let score = 0

document.addEventListener("mousemove", (e) => {
  const gameContainer = document.getElementById("game-container")
  const containerWidth = gameContainer.offsetWidth
  const barWidth = bar.offsetWidth
  const mouseX = e.clientX - gameContainer.getBoundingClientRect().left

  if (mouseX > 0 && mouseX < containerWidth - barWidth) {
    bar.style.left = mouseX - barWidth / 2 + "px"
  }
})

let ballX = 200
let ballY = 50
let ballSpeedX = 3
let ballSpeedY = 3

function updateBallPosition() {
  ballX += ballSpeedX
  ballY += ballSpeedY

  if (ballX <= 0 || ballX >= 380) {
    ballSpeedX = -ballSpeedX
  }

  if (ballY <= 0) {
    ballSpeedY = -ballSpeedY
  } else if (ballY >= 380) {
    if (
      ballX >= parseInt(bar.style.left) &&
      ballX <= parseInt(bar.style.left) + bar.offsetWidth
    ) {
      ballSpeedY = -ballSpeedY
      score++
      scoreDisplay.textContent = `Score: ${score}`
    } else {
      score = 0
      scoreDisplay.textContent = `Score: ${score}`
      ballX = 200
      ballY = 50
    }
  }

  ball.style.left = ballX + "px"
  ball.style.top = ballY + "px"
}

function updateGame() {
  updateBallPosition()
  requestAnimationFrame(updateGame)
}

updateGame()
