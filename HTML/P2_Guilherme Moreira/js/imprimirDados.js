function exibirDados() {
  let pessoas = JSON.parse(localStorage.getItem('dadosPessoa')) || [];

  let tabela = document.getElementById('tabela');

  tabela.innerHTML = '';

  let cabecalho = `
        <tr>
            <th>Nome</th>
            <th>Telefone</th>
            <th>Email</th>
            <th>Numero da Sorte</th>
        </tr>
    `;
  tabela.innerHTML = cabecalho;

  //cria nova linhas cada vez que novos dados sao adicionados
  for (let i = 0; i < pessoas.length; i++) {
    let linha = document.createElement('tr');

    let nome = document.createElement('td');
    nome.innerHTML = pessoas[i].nome;
    linha.appendChild(nome);

    let telefone = document.createElement('td');
    telefone.innerHTML = pessoas[i].telefone;
    linha.appendChild(telefone);

    let email = document.createElement('td');
    email.innerHTML = pessoas[i].email;
    linha.appendChild(email);

    let numero = document.createElement('td');
    numero.innerHTML = pessoas[i].numero;
    linha.appendChild(numero);

    tabela.appendChild(linha);
  }
}
//exibe a tabela no navegador
let body = document.getElementById('tabela');
body.innerHTML += window.localStorage.getItem('tabela');

// mantem a exibição a tabela após o carregamento da pagina
window.onload = function () {
  exibirDados();
};
