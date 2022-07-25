function dataAleatoria() {
    let retorno = {};
    for (let i = 0; i < 28; i++) {
        var dataIni = new Date(1990, 0, 1);
        var dataFinal = new Date(2006, 12, 31);
        return new Date(dataIni.getTime() + Math.random() * (dataFinal.getTime() - dataIni.getTime()));
    }
}
var minhaDataAleatoria = dataAleatoria();