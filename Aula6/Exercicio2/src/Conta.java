public class Conta {

    private int qtdCliente;
    private double saldo;
    Cliente cliente;

    public void addCliente(Cliente cliente) {
        this.cliente = cliente;
        qtdCliente++;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor){
        saldo += valor;
    }
    public void sacar(double valor){
        if(valor<=saldo) {
            saldo -= valor;
        } else
            System.out.println("Saldo insuficiente");

    }
    public void extrato(){
        System.out.println("Saldo: " +saldo);
    }
}
