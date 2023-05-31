public class Conta   {

     private int numero;
     private String nome;
     private double saldo;
     private double limite;

    public Conta(int numero, String nome, double saldo, double limite) {
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
        this.limite = limite;
    }

    public  void depositar(double valor ){
          System.out.println("vc depositou " + valor);
     }

     public void sacar(double valor){
            if(valor>saldo)
                System.out.println("saldo insuficiente");
            else {
                System.out.println("vc sacou " + valor);
                saldo -= valor;
            }

    }

     public int getNumero() {
          return numero;
     }

     public void setNumero(int numero) {
          this.numero = numero;
     }

     public String getNome() {
          return nome;
     }

     public void setNome(String nome) {
          this.nome = nome;
     }

     public double getSaldo() {
          return saldo;
     }

     public void setSaldo(double saldo) {
          this.saldo = saldo;
     }

     public double getLimite() {
          return limite;
     }

     public void setLimite(double limite) {
          this.limite = limite;
     }
}
