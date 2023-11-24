let botaoAdicionar = document.getElementById('botaoEnviar');

botaoAdicionar.addEventListener('click', function () {
  limparErro();
  validarFormulario();
});

function validarFormulario() {
  let nome = document.getElementById('nome').value;
  let email = document.getElementById('email').value;
  let telefone = document.getElementById('telefone').value;
  let numero = document.getElementById('numero').value;

  if (!verificarNome(nome)) {
    exibirErro(
      'Nome inválido. Certifique-se de que tem pelo menos 3 caracteres e um espaço em branco.',
    );
    document.getElementById('nome').value = '';
    return;
  }

  if (!verificarEmail(email)) {
    exibirErro(
      "Email inválido. Certifique-se de incluir '@' e '.' em posições corretas.",
    );
    document.getElementById('email').value = '';
    return;
  }
  if (!verificarTelefone(telefone)) {
    exibirErro('Telefone inválido. Preencha o campo corretamente.');
    document.getElementById('telefone').value = '';
    return;
  }

  if (!verificarNumeroDaSorte(numero)) {
    exibirErro(
      'Número da sorte inválido. Insira um número maior ou igual a zero.',
    );
    document.getElementById('numero').value = '';
    return;
  }

  limparErro();
  armazenarValores();
  limparCampos();
}

function verificarNome(nome) {
  if (nome.length >= 3 && nome.includes(' ')) {
    return true;
  } else {
    return false;
  }
}

function verificarEmail(email) {
  if (email.includes('@') && email.indexOf('.') > email.indexOf('@') + 1) {
    return true;
  } else {
    return false;
  }
}

function verificarTelefone(telefone) {
  if (telefone.trim() !== '') {
    return true;
  } else {
    return false;
  }
}

function verificarNumeroDaSorte(numero) {
  if (numero >= 0) {
    return true;
  } else {
    return false;
  }
}

function exibirErro(mensagem) {
  let erroParagrafo = document.createElement('p');
  erroParagrafo.style.color = 'red';

  erroParagrafo.innerHTML = mensagem;

  let campos = document.getElementById('campos');
  campos.insertBefore(erroParagrafo, campos.firstChild);
}

function limparErro() {
  let campos = document.getElementById('campos');
  if (campos.firstChild.tagName === 'P') {
    campos.removeChild(campos.firstChild);
  }
}

function limparCampos() {
  document.getElementById('nome').value = '';
  document.getElementById('email').value = '';
  document.getElementById('telefone').value = '';
  document.getElementById('numero').value = '';
}