public class Main {

    public static void main(String[] args) {

        Conta conta = new Conta();
        Cliente c1 = new Cliente();

        conta.setSaldo(1500);
        System.out.println(conta.getSaldo());

        conta.depositar(200);
        System.out.println(conta.getSaldo());


        conta.sacar(1000);
        System.out.println(conta.getSaldo());

        c1.setNome("Isabela");
        c1.setCpf(12345679);

        conta.addCliente(c1);

        conta.extrato();

    }

}
