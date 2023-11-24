// armazena conteudo no navegador
function armazenarDados(chave, valor, tipoArmazenamento) {
  let valorConvertidor = JSON.stringify(valor);
  if (tipoArmazenamento) {
    tipoArmazenamento.setItem(chave, valorConvertidor);
  } else {
    alert('Navegador não suporta armazenamento local');
  }
}
// armazena valores do input
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

function ler(chave, tipoArmazenamento) {
  let valor = tipoArmazenamento.getItem(chave);
  if (valor) {
    return JSON.parse(valor);
  } else {
    return null;
  }
}
