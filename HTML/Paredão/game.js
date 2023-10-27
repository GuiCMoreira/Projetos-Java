const ball = document.getElementById("ball")
const paddle = document.getElementById("paddle")
const scoreValue = document.getElementById("score-value")
const container = document.getElementById("game-container")

let score = 0
let ballX = 0 // Posição inicial da bola
let ballY = 0
let ballSpeedX = 2 // Velocidade horizontal da bola
let ballSpeedY = 2 // Velocidade vertical inicial da bola (mudada para positiva)
let gameIsOver = false

const containerWidth = container.clientWidth
const containerHeight = container.clientHeight
const ballWidth = ball.offsetWidth

ball.addEventListener("animationiteration", () => {
  // Atualiza a pontuação quando a bola retorna
  scoreValue.textContent = ++score
})

function updateBallPosition() {
  ballX += ballSpeedX
  ballY += ballSpeedY

  // Verifica se a bola colide com a barra do jogador
  if (
    ballX + ballWidth >= paddle.offsetLeft &&
    ballX <= paddle.offsetLeft + paddle.offsetWidth &&
    ballY + ball.offsetHeight >= paddle.offsetTop
  ) {
    const paddleCenter = paddle.offsetLeft + paddle.offsetWidth / 2
    const ballCenter = ballX + ballWidth / 2

    // Calcula a direção da bola com base na colisão com o centro da barra
    if (ballCenter < paddleCenter) {
      ballSpeedX = -Math.abs(ballSpeedX) // Vai para a esquerda
    } else {
      ballSpeedX = Math.abs(ballSpeedX) // Vai para a direita
    }

    ballSpeedY = -Math.abs(ballSpeedY) // Faz a bola voltar para cima
  }

  // Verifica se a bola atingiu a extremidade inferior do contêiner
  if (ballY + ball.offsetHeight >= containerHeight) {
    // O jogador perdeu, reinicia o jogo
    gameIsOver = true
    alert("Você perdeu! Sua pontuação final: " + score)
    restartGame()
  }

  // Verifica colisão com as laterais do contêiner
  if (ballX <= 0 || ballX + ballWidth >= containerWidth) {
    ballSpeedX *= -1 // Inverte a direção horizontal
  }

  // Limita a posição da bola dentro do contêiner
  ballX = Math.max(0, Math.min(ballX, containerWidth - ballWidth))
  ballY = Math.max(0, Math.min(ballY, containerHeight - ball.offsetHeight))

  // Atualiza a posição da bola
  ball.style.left = ballX + "px"
  ball.style.top = ballY + "px"

  // Continua atualizando a posição da bola enquanto o jogo não estiver encerrado
  if (!gameIsOver) {
    requestAnimationFrame(updateBallPosition)
  }
}

function restartGame() {
  score = 0
  scoreValue.textContent = score
  ballX = 0
  ballY = 0
  ballSpeedX = 2
  ballSpeedY = 2 // Velocidade vertical é positiva
  gameIsOver = false
  updateBallPosition()
}

// Inicie o jogo
updateBallPosition()

document.addEventListener("mousemove", (event) => {
  // Move a barra do jogador horizontalmente com o movimento do mouse
  const containerRect = container.getBoundingClientRect()
  const paddleWidth = paddle.offsetWidth
  const mouseX = event.clientX - containerRect.left

  // Define a posição da barra de acordo com a posição do mouse
  let newPaddleLeft = mouseX - paddleWidth / 2

  // Garante que a barra não saia dos limites do contêiner
  if (newPaddleLeft < 0) {
    newPaddleLeft = 0
  } else if (newPaddleLeft + paddleWidth > containerRect.width) {
    newPaddleLeft = containerRect.width - paddleWidth
  }

  paddle.style.left = newPaddleLeft + "px"
})
