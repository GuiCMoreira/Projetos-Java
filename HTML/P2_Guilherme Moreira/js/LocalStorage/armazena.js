function armazenarDados(chave, valor, tipoArmazenamento) {
  let valorConvertidor = JSON.stringify(valor);
  if (tipoArmazenamento) {
    tipoArmazenamento.setItem(chave, valorConvertidor);
  } else {
    alert('Navegador não suporta armazenamento local');
  }
}

function armazenarValores() {
  let nome = document.getElementById('nome').value;
  let telefone = document.getElementById('telefone').value;
  let email = document.getElementById('email').value;
  let numero = document.getElementById('numero').value;

  let novaPessoa = {
    nome: nome,
    telefone: telefone,
    email: email,
    numero: numero,
  };

  let pessoas = JSON.parse(localStorage.getItem('dadosPessoa'));
  if (!pessoas || !Array.isArray(pessoas)) {
    pessoas = [];
  }

  pessoas.push(novaPessoa);
  localStorage.setItem('dadosPessoa', JSON.stringify(pessoas));
  exibirDados();
}

