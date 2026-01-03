public abstract class Carro {
    protected boolean automatico; // atributo da classe - inicia com falso
    public abstract void Acelerar();

    public void alternarCambio(){ // só altera o estado se for chamado
        automatico = !automatico; // Altera o estado para true
    };

}
