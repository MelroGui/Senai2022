

function gerarDataN(){
    let retorno = [];
    for(i = 0; i < 27; i++){
        let dataI = new Date(1990, 0, 1);
        let dataF= new Date(2006, 11, 30);
        retorno[i] = new Date(dataI.getTime()+Math.random()*(dataF.getTime() - dataI.getTime()));
    }
    return retorno;
}