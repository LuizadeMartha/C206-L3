package View;

import Controller.Arquivo;
import Model.Professores;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        Arquivo arq = new Arquivo();
        Professores p = new Professores();
        boolean flag =  true;



        while (flag)
        {
            System.out.println("Digite sua opção: ");
            System.out.println("1 - Adicionar um Professor");
            System.out.println("2 - Ler um Arquivo");
            System.out.println("3 - Remover um professor");
            System.out.println("4 - Sair do menu");
            int op = entrada.nextInt();
            entrada.nextLine();

            switch (op)
            {
                case 1:
                    System.out.println("Digite o nome do Professor");
                    p.nome = entrada.nextLine();
                    System.out.println("Digite o CPF do Professor: ");
                    p.cpf = entrada.nextInt();
                    entrada.nextLine();
                    System.out.println("Digite a materia do Professor: ");
                    p.materia = entrada.nextLine();
                    arq.escrever(p);
                    System.out.println("model.Professor adicionado!");
                    break;

                case 2:
                    ArrayList<Professores> prof = arq.ler();
                    for (int i=0; i< prof.size(); i++)
                    {
                        System.out.println("Nome: " + prof.get(i).nome);
                        System.out.println("CPF: " + prof.get(i).cpf);
                        System.out.println("materia: " + prof.get(i).materia);
                    }
                    break;

                case 3:
                    System.out.println("Digite o nome do Professor que deseja remover");
                    p.nome = entrada.nextLine();
                    System.out.println("Digite o CPF do Professor que deseja remover: ");
                    p.cpf= entrada.nextInt();
                    entrada.nextLine();
                    System.out.println("Digite a materia do Professor que deseja remover: ");
                    p.materia = entrada.nextLine();
                    arq.remover(p);
                    break;

                case 4:
                    flag = false;
                    System.out.println("Você saiu do menu !!");
                    break;


                default:
                    System.out.println("opção inválida!");
                    break;
            }
        }


    }

}
