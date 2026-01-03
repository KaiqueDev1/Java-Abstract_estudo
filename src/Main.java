//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Jetta jetta = new Jetta();
        Carro carro = new Jetta();
        CoisasDeCarro coisas = jetta;

        carro.Acelerar();
        coisas.Cambio();
        jetta.CambioE();

    }
}