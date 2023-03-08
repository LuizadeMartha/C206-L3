import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double numero1;
        double numero2;

        Scanner entrada = new Scanner(System.in);
        System.out.println("entrando com o primeiro numero: ");
        numero1 = entrada.nextDouble();

        System.out.println("entrando com o segundo numero numero: ");
        numero2 = entrada.nextDouble();

        //fazendo operações
        double soma = numero1 + numero2;
        double subtracao = numero1 - numero2;
        double multiplicacao = numero1 * numero2;
        double divisao = numero1/numero2;
        double exponencial = Math.pow(numero1,numero2);

        //mostrando resultados
        System.out.println("soma:" + soma);
        System.out.println("subtração:" + subtracao);
        System.out.println("multiplicação:" + multiplicacao);
        System.out.println("divisão:" + divisao);
        System.out.println("exponencial:" + exponencial);


    }
}