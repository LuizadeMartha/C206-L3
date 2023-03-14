import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        float peso = 63;
        float altura = 1.63f;

        float imc = (float) (peso/(altura*altura));
        System.out.println(imc);

        if(imc < 18.5)
        System.out.println("Abaixo do peso");
        if(imc >= 18.6 && imc <= 24.9)
            System.out.println("Peso ideal (Parabéns)");
        if(imc >= 25 && imc <= 29)
            System.out.println("Levemente acima do peso");
        if(imc >= 30 && imc <= 34.9)
            System.out.println("Obesidade grau 1");
        if(imc >= 35 && imc <= 39.9)
            System.out.println("Obesidade grau 2 (severa");
        if(imc > 40)
            System.out.println("besidade 3 (mórbita");


    }
}