//Exercício 1

let a = prompt("Digite o valor do 1° lado do Triângulo");
let b = prompt("Digite o valor do 2° lado do Triângulo");
let c = prompt("Digite o valor do 3° lado do Triângulo");

if(a == b && b == c){
    alert(`Triângulo Equilátero`);
}else if(a == b && b != c || a != b && b == c || a != b && a == c){
    alert(`Triângulo Isósceles`);
}else{
    alert(`Triângulo Escaleno`);
}

//Exercício 2

let salario = prompt("Digite o seu salário")
let desconto, percen;

if (salario > 4664.68) {
    percen = 27.5;
    desconto = salario * (percen/100);
} else if (salario > 3751.06) {
    percen = 22.5;
    desconto = salario * (percen/100);
}else if (salario > 2826.66) {
    percen = 15;
    desconto = salario * (percen/100);
} else if (salario > 1903.99) {
    percen = 7.5;
    desconto = salario * (percen/100);
} else {
    percen = 0;
    desconto = 0;
}

alert(`Foi descontado R$${desconto.toFixed(2)}, salário final R$${salario-desconto}300`)
