public class Jetta extends Carro implements CoisasDeCarro{
    public boolean acelera = true;

    @Override
    public void Acelerar() {
        acelera = acelera;
        System.out.println("O Jetta  " + (acelera ? "está acelerando" : "não esta acelerando"));
    }

    // método publico a ser chamado
    public void CambioE(){
        alternarCambio();
        Cambio(); // chama método da interface
    }

    // método da interface
    @Override
    public void Cambio() {

        System.out.println("Cambio " + (automatico ? "automático" : "manual"));
    }
}
