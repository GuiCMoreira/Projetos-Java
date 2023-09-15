const horas = document.getElementById("horas")
const minutos = document.getElementById("minutos")
const segundos = document.getElementById("segundos")

const relogio = setInterval(function time() {
  let dateToday = new Date()
  let hr = dateToday.getHours()
  let m = dateToday.getMinutes()
  let s = dateToday.getSeconds()

  if (hr < 10) hr = "0" + hr

  if (m < 10) m = "0" + m

  if (s < 10) s = "0" + s

  horas.textContent = hr
  minutos.textContent = m
  segundos.textContent = s
})
