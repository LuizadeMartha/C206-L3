public class SemsaldoException extends Exception{

    public SemsaldoException(double valor) {
        System.out.println("vc tntou sacar " + valor + ", mas seu saldo é insuficiente");
    }
}
