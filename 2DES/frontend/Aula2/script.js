// //tagname, id, class
// var texto = document.getElementByTagName("h1")

// // console.log(texto)

// var titulo = document.getElementById("titulo")

// var aluno = {
//     nome: "Fulano",
//     matricula: 234578
// }

// // console.log(titulo)

// titulo.innerHTML = `Nome : ${aluno.nome} Matricula : ${aluno.Matricula}`

// titulo.style.color ="green"
// // titulo.style.margin ="80px"

// var mensagem = document.getElementById("mensagem")

// mensagem.style.display = "block"

// var divisao = document.getElementByClass("divisao")

// console.log(divisao)

// // document.querySelector()
// // document.querySelectorAll()

// var titulo2 = document.querySelector("#titulo")
// var div = document.querySelectorAll(".divisao")
// var msg = document.querySelector("h1")

// console.log(div)

var linhas = document.querySelectorAll("tr")

linhas.forEach(linha => {
    let temp = linha.querySelector("td")
    if(temp != null) {
        console.log(temp.innerHTML == "Fulano da Siva")
        alert("Encontrei")
    }  
})

let v1 = 1
let v2 = "1"

if(v1 !== v2) {
    console.log("Não Somos Iguais")
}