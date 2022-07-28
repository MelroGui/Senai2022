//ex1

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

//ex2

var infoCPF = document.querySelector("#cpf");
var btCPF = document.querySelector("#btCPF");
var textarea1 = document.querySelector("#CPFRes");
btCPF.addEventListener("click", validaCPF);

function validaCPF(){
    var cpf = infoCPF.value;
    cpf = cpf.replace(/\D/g, '');
    if(cpf.toString().length != 11 || /^(\d)\1{10}$/.test(cpf)) return false;
    var result = true;
    [9,10].forEach(function(j){
        var soma = 0, r;
        cpf.split(/(?=)/).splice(0,j).forEach(function(e, i){
            soma += parseInt(e) * ((j+2)-(i+1));
        });
        r = soma % 11;
        r = (r <2)?0:11-r;
        if(r != cpf.substring(j, j+1)) result = false;
    });
    if(result == true ){
        textarea1.innerHTML = "CPF válido"
        return console.log(result);
    }else{
        textarea1.innerHTML = "CPF inválido"
        return console.log(result);
    }
}

//ex3

var btTel = document.querySelector("#btTel");
var textarea2 = document.querySelector("#telRes");
var infoTel = document.querySelector("#Tel")
btTel.addEventListener("click", getRandom);

function getRandom() {

    let qnt = infoTel.value;
    let i = 0;
    while(i < qnt){
        let phone = `${"(19)"}${Math.floor(Math.random() * (99999 - 11111 + 1)) + 111111}-${Math.floor(Math.random() * (9999 - 1111 + 1)) + 1111}                  `;
        textarea2.innerHTML += phone;
        console.log(phone);
        i++;
    }
}