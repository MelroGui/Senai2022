const nome = document.querySelector("#nome");
const cargo = document.querySelector("#cargo");
const salario = document.querySelector("#salario");
const vetor = document.querySelectorAll("tr");

nome.addEventListener("keyup",()=>{
    vetor.forEach(linha=>{
    let temp = document.querySelectorAll("td")[0];
    if(temp != null) {
        if(temp.innerHTML.toLocaleLowerCase().includes(nome.value.toLocaleLowerCase())){
            linha.style.display = "table-row";
        }else{
            linha.style.display = "none";
            }
        }
    });
});
cargo.addEventListener("keyup",()=>{
    vetor.forEach(linha=>{
    let temp = document.querySelectorAll("td")[1];
    if(temp != null) {
        if(temp.innerHTML.toLocaleLowerCase().includes(cargo.value.toLocaleLowerCase())){
            linha.style.display = "table-row";
        }else{
            linha.style.display = "none";
            }
        }
    });
});
salario.addEventListener("keyup",()=>{
    vetor.forEach(linha=>{
    let temp = document.querySelectorAll("td")[2];
    if(temp != null) {
        if(temp.innerHTML.toLocaleLowerCase().includes(salario.value.toLocaleLowerCase())){
            linha.style.display = "table-row";
        }else{
            linha.style.display = "none";
            }
        }
    });
});