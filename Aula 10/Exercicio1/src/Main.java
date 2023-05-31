import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        int n3 =0,n4 =0,n5 =0 ,n6 = 0;

        try{
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            n3 = n1/n2;
            n4 = n1+n2;
            n5 = n1*n2;
            n6 = n1-n2;

        }catch (ArithmeticException e){
            System.out.println("Divisão por zero");
        }catch (InputMismatchException e){
            System.out.println("Entrada de dedados erradas");
        }


        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);
        System.out.println(n6);


    }
}
