//1º Testando a leitura do arquivo:
//alert('oi');
//Criando variáveis GLOBAIS:
var valor1;
var valor2;

//Função de soma:
function somarValores() {
  //Recebendo valores do usuário:
  valor1 = window.prompt('Digite um valor: ');
  valor2 = window.prompt('Digite outro valor: ');
  //Converter o texto para número:
  valor1 = parseInt(valor1);
  valor2 = parseInt(valor2);
  //processamento:
  let soma = valor1 + valor2;
  //saída:
  alert(valor1+ ' + ' + valor2 + ' = ' +soma);
}

//Função da média:
function calcularMedia() {
  let media;
  let resultado;
  //atribuindo valores:
  valor1 = window.prompt('Digite a primeira nota:');
  valor2 = window.prompt('Digite a segunda nota:');
  //converter:
  valor1 = parseInt(valor1);
  valor2 = parseInt(valor2);
  media = (valor1 + valor2) / 2;
  if(media >=6 ) {
    resultado = 'Ap';
  } else {
    resultado = 'Rp';
  }
  alert('A média é: '+media+
        '\nAluno foi: '+resultado);
}

function multiplicar() {
  valor1 = window.prompt('Digite o primeiro valor:')
  valor2 = window.prompt('Digite o segundo valor:')

  valor1 = parseInt(valor1)
  valor2 = parseInt(valor2)

  alert(`A multiplicação é: ${valor1 * valor2}` )
}

function verParImpar() {
  valor1 = window.prompt('Digite um valor:')
  valor1 = parseInt(valor1)

  if (valor1 % 2 == 0) {
    alert('O valor é par')
  } else {
    alert('O valor é impar')
  }
}

function calcularBhaskara() {
  let a = parseInt(window.prompt('Informe o valor de A:'))
  let b = parseInt(window.prompt('Informe o valor de B:'))
  let c = parseInt(window.prompt('Informe o valor de C:'))

  let delta = b**2-4*a*c
  let x1 = (-b+Math.sqrt(delta))/(2*a)
  let x2 = (-b-Math.sqrt(delta))/(2*a)

  alert(`${delta}\n${x1}\n${x2}`)
}