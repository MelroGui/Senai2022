//Ex1
var btPlaca = document.querySelector("#btPlaca");
btPlaca.addEventListener("click", validarPlaca);

function validarPlaca(placa){
    placa = document.querySelector("#placa");
    let regexPlaca = /^[a-zA-Z]{3}[0-9]{4}$/;
    let regexPlaca2 = /^[a-zA-Z]{3}[0-9]{1}[a-zA-Z]{1}[0-9]{2}$/;
    let textA = document .querySelector("#placaRes");
    let valida = false;

    if(regexPlaca.test(placa.value)){
        textA.innerHTML = (valida = true,"Valido no Padrão antigo");
    } else if(regexPlaca2.test(placa.value)){
        textA.innerHTML = (valida = true,"Valido no padrão novo");
    } else {
        textA.innerHTML = (valida = false,"Invalido");
    }
}
//Ex2
var btCPF = document.querySelector("#btCPF");
btCPF.addEventListener("click", validarCPF);
let textA = document .querySelector("#cpfRes");

function validarCPF(cpf) {	
	cpf = cpf.replace(/[^\d]+/g,'');	
	if(cpf == '') return false;	
	// Elimina CPFs invalidos conhecidos	
	if (cpf.length != 11 || 
		cpf == "00000000000" || 
		cpf == "11111111111" || 
		cpf == "22222222222" || 
		cpf == "33333333333" || 
		cpf == "44444444444" || 
		cpf == "55555555555" || 
		cpf == "66666666666" || 
		cpf == "77777777777" || 
		cpf == "88888888888" || 
		cpf == "99999999999")
			return false;		
	// Valida 1o digito	
	add = 0;	
	for (i=0; i < 9; i ++)		
		add += parseInt(cpf.charAt(i)) * (10 - i);	
		rev = 11 - (add % 11);	
		if (rev == 10 || rev == 11)		
			rev = 0;	
		if (rev != parseInt(cpf.charAt(9)))		
			return false;		
	// Valida 2o digito	
	add = 0;	
	for (i = 0; i < 10; i ++)		
		add += parseInt(cpf.charAt(i)) * (11 - i);	
	rev = 11 - (add % 11);	
	if (rev == 10 || rev == 11)	
		rev = 0;	
	if (rev != parseInt(cpf.charAt(10)))
		return false;		
	return true;   
}