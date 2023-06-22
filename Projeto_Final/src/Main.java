
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws InfoInvalidaException {
        Scanner sc = new Scanner(System.in);
        Arquivo arq = new Arquivo();
        Cliente c = new Cliente();
        boolean flag =  true;

        System.out.println("---------------Bem-vindo ao HOTEL LM--------------");
        System.out.println("__________________________________________");
        while (flag)
        {
            System.out.println("Menu: ");
            System.out.println("1 - Fazer cadastro e reserva");
            System.out.println("2 - Ver minha reserva");
            System.out.println("3 - Cancelar reserva");
            System.out.println("4 - Alterar data da minha reserva");
            System.out.println("5 - Sair");
            int op = sc.nextInt();
            sc.nextLine();

            switch (op)
            {
                case 1:
                    System.out.println("---------------CADASTRO-RESERVA -----------------");
                    System.out.println("Digite seu nome: ");
                    c.setNome(sc.nextLine());
                    System.out.println("Digite sua idade: ");
                    c.setidade(Integer.parseInt(sc.nextLine()));
                    System.out.println("Digite seu CPF: ");
                    c.setCpfCliente(sc.nextLine());
                    int qtdPessoas = 0;

                    do {
                        System.out.println("Digite a quantidade de pessoas (permitido até 2 pessoas por quarto): ");
                        qtdPessoas = sc.nextInt();
                        sc.nextLine();

                        try {
                            if (qtdPessoas < 1 || qtdPessoas > 2) {
                                throw new InfoInvalidaException("Não é permitido o numero de pessoas digitados");
                            }
                        } catch (InfoInvalidaException e) {
                            System.out.println("Erro: " + e.getMessage());
                        }
                    } while (qtdPessoas < 1 || qtdPessoas > 2);

                    c.setQtdPessoas(qtdPessoas);

                    System.out.println("Digite a data que deseja reservar (dd/mm/aaaa): ");
                    c.setData(sc.nextLine());
                    arq.escrever(c);
                    System.out.println("Reservado!!!");
                    break;


                case 2:
                    System.out.println("---------------Infos da reserva -----------------");
                    ArrayList<Cliente> cl = arq.ler();

                    for (int i=0; i< cl.size(); i++)
                    {
                        System.out.println("Nome: " + cl.get(i).getNome());
                        System.out.println("Idade: " + cl.get(i).getidade());
                        System.out.println("CPF: " + cl.get(i).getCpfCliente());
                        System.out.println("QTD de pessoas: " + cl.get(i).getQtdPessoas());
                        System.out.println("Data da reserva: " + cl.get(i).getData());

                    }
                    break;

                case 3:
                    System.out.println("---------------Remover reserva -----------------");
                    System.out.println("Digite o CPF para remover sua reserva: ");
                    c.setCpfCliente(sc.nextLine());
                    arq.remover(c);
                    break;

                case 4:
                    System.out.println("---------------Atualizar reserva -----------------");
                    System.out.println("Digite o CPF para atualizar a sua reserva: ");
                    c.setCpfCliente(sc.nextLine());
                    arq.remover(c);

                    System.out.println("confirme seus dados novamente");
                    System.out.println("Digite seu nome novamente: ");
                    c.setNome(sc.nextLine());
                    System.out.println("Digite sua idade novamene: ");
                    c.setidade(Integer.parseInt(sc.nextLine()));
                    System.out.println("Digite seu CPF novamente: ");
                    c.setCpfCliente(sc.nextLine());

                    int qtdPessoas1 = 0;

                    do {
                        System.out.println("Digite a quantidade de pessoas (permitido até 2 pessoas por quarto): ");
                        qtdPessoas1 = sc.nextInt();
                        sc.nextLine();

                        try {
                            if (qtdPessoas1 < 1 || qtdPessoas1 > 2) {
                                throw new InfoInvalidaException("Não é permitido o numero de pessoas digitados");
                            }
                        } catch (InfoInvalidaException e) {
                            System.out.println("Erro: " + e.getMessage());
                        }
                    } while (qtdPessoas1 < 1 || qtdPessoas1 > 2);

                    c.setQtdPessoas(qtdPessoas1);

                    System.out.println("Digite a nova data que deseja reservar (dd/mm/aaaa): ");
                    c.setData(sc.nextLine());
                    arq.escrever(c);
                    System.out.println("Reserva atualizada!!!");
                    break;

                case 5:
                    flag = false;
                    System.out.println("Volte Sempre!");
                    break;


                default:
                    System.out.println("opção inválida!");
                    break;
            }
        }


    }

}
