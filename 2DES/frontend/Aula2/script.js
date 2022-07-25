// var text = document.getElementsByTagName("h1");
// var title = document.getElementById("title");

// var aluno = {
//     nome: "Fulano",
//     matricula: 453567,
//     status: true,
//     notas: [8,9,10.5]  
// };

// title.innerHTML = `Nome: ${aluno.nome} </br> Matrícula: ${aluno.matricula}`;
// title.style.color = "green";

// var divisao = document.getElementsByClassName("divisao");
// var title2 = document.querySelector("#title");
// var div = document.querySelectorAll(".divisao");

// console.log(title2, divisao, div);

var busca = document.querySelector("#busca");
var linhas = document.querySelectorAll("tr");

var btBusca = document.querySelector("button");

btBusca.addEventListener("click", buscarNome);

busca.addEventListener("keyup", buscarNome);

function buscarNome(){

    let encontrei = false;

    linhas.forEach(linha => {
        let temp = linha.querySelector("td");
        if(temp != null){
            //console.log(temp.innerHTML);
            // if(temp.innerHTML.toLowerCase() == busca.value.toLowerCase()){
            //     alert("Achei!");
            //     encontrei = true;
            //     linha.style.fontWeight = "bold";
            //     linha.style.color = "Green";
            // }
            if(temp.innerHTML.toLowerCase().includes(busca.value.toLowerCase())){
                linha.style.display = "table-row";
            }else {
                linha.style.display = "none";
            }
        }
    });
    // if(!encontrei) alert("Não Encontrei!");
}

// let v1 = 1, v2 = "1";

// if(v1 === v2){
//     console.log("Somos Iguais");
// }else{
//     console.log("Não somos Iguais");
// }