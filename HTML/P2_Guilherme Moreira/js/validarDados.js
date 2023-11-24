// Função chamada ao clicar no botão de envio do formulário
function validarFormulario() {
  let nome = document.getElementById('nome').value;
  let email = document.getElementById('email').value;
  let telefone = document.getElementById('telefone').value;
  let numero = document.getElementById('numero').value;

  // Realiza as verificações
  if (!verificarNome(nome)) {
    alert(
      'Nome inválido. Certifique-se de que tem pelo menos 3 caracteres e um espaço em branco.',
    );
    return;
  }

  if (!verificarEmail(email)) {
    alert(
      "Email inválido. Certifique-se de incluir '@' e '.' em posições corretas.",
    );
    return;
  }
  if (!verificarTelefone(telefone)) {
    alert('Telefone inválido. Preencha o campo corretamente.');
    return;
  }

  if (!verificarNumeroDaSorte(numero)) {
    alert('Número da sorte inválido. Insira um número maior ou igual a zero.');
    return;
  }

  // Se todas as verificações passarem, armazena os dados
  armazenarValores();
}

// Adicione um listener para chamar validarFormulario() no clique do botão de envio
document
  .getElementById('botaoEnviar')
  .addEventListener('click', validarFormulario);

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
