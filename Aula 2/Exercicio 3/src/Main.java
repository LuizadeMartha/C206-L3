import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int senha;
        int x = 1;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Entrar com a senha: ");

        while( x != 0){
            senha = entrada.nextInt();

            if (senha == 2022) {
                System.out.println("Acesso permitido");
                x = 0;
            }
            else
                System.out.println("Senha invalida");
        }

    }
}