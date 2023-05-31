import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Conta c = new Conta(12,"Luiza",900,200);
        c.sacar(1000);

        System.out.println("O saldo atual é de : "+ c.getSaldo());
    }
}
