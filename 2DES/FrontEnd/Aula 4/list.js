//Ex1
var btPlaca = document.querySelector("#btPlaca");
btPlaca.addEventListener("click", validarPlaca);

function validarPlaca(placa){
    placa = document.querySelector("#placa");
    let validando = false;
    let textArea = document.querySelector("#placaRes");
    const regexPlacaAntiga = /^[a-zA-Z]{3}[0-9]{4}$/;
    const regexPlacaNova = /^[a-zA-Z]{3}[0-9]{1}[a-zA-Z]{1}[0-9]{2}$/;

    if(regexPlacaAntiga.test(placa.value)){
        textArea.innerHTML = (validando = true);
    }else if(regexPlacaNova.test(placa.value)){
        textArea.innerHTML = (validando = true);
    }else{
        textArea.innerHTML = (validando = false);
    }
}

//Ex2
var btCPF = document.querySelector("#btCPF");
btCPF.addEventListener("click", validarCPF);

function validarCPF(cpf){
    cpf = document.querySelector("#cpf");
    let textArea = document.querySelector("#cpfRes");

    cpf = cpf.value.replace(/\D/g, '');
    if(cpf.toString().length != 11 || /^(\d)\1{10}$/.test(cpf)) return false;
    var validando = true;
    [9,10].forEach(function(j){
        var soma = 0, r;
        cpf.split(/(?=)/).splice(0,j).forEach(function(e, i){
            soma += parseInt(e) * ((j+2)-(i+1));
        });
        r = soma % 11;
        r = (r <2)?0:11-r;
        if(r != cpf.substring(j, j+1)) validando = false;
    });
    if(validando == true ){
        textArea.innerHTML = true;
    }else{
        textArea.innerHTML = false;
    }
}

//Ex3

var btTel = document.querySelector("#btTel");
btTel.addEventListener("click", gerarTel);

function gerarTel(DDD, quant){
    quant = document.querySelector("#quantTel");
    let textArea = document.querySelector("#telefones");
    DDD = 19;

    let i = 0;
    while(i < quant.value){
        let tel = `(${DDD}) ${Math.floor(Math.random() * (99999 - 11111 + 1)) + 111111}-${Math.floor(Math.random() * (9999 - 1111 + 1)) + 1111}\n`;
        textArea.innerHTML += tel;
        i++
    }
}

//Ex4
var btGCPF = document.querySelector("#btGCPF");
btGCPF.addEventListener("click", gerarCPF);

function gerarCPF(){

    const cpf1 = document.querySelector("#cpfs");
    const cpf2 = document.querySelector("#quantCPF");

    for(let i = 0; i < parseInt(cpf2.value); i++){
          cpf1.value += `${CPFgera()}\n`;
    }

    function CPFgera(){
        const num1 = ("" + Math.floor(Math.random() * 999)).padStart(3,0);
        const num2 = ("" + Math.floor(Math.random() * 999)).padStart(3,0);
        const num3 = ("" + Math.floor(Math.random() * 999)).padStart(3,0);
        const dig1 = dig(num1, num2, num3);
        const dig2 = dig(num1, num2, num3, dig1);
        return `${num1}.${num2}.${num3}-${dig1}${dig2}`
    }

    function dig(n1, n2, n3, n4){
        const nums = n1.split("").concat(n2.split(""), n3.split(""));
        if(n4 !== undefined){
              nums[9] = n4;
        }
    
        let x = 0;
        for(let i = (n4 !== undefined ? 11 : 10), j = 0; i >= 2; i--, j++){
              x += parseInt(nums[j]) * i;
        }
    
        const y = x % 11;
        return y < 2 ? 0 : 11 - y;
    }
}