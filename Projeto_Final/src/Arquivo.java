import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class Arquivo {

    public void escrever(Cliente cl){

        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;
        String linhaEscrever;

        try{

            os = new FileOutputStream("Reserva.txt", true);
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);

            // escrevendo os valores usando bw:
            bw.write("Reserva");
            bw.newLine();
            bw.write(cl.getNome() + "\n");
            bw.write(cl.getidade() + "\n");
            bw.write(cl.getCpfCliente() + "\n");
            bw.write(cl.getQtdPessoas() + "\n");
            bw.write(cl.getData() + "\n");

        }catch(Exception e){
            System.out.println(e);

        }finally {
            // bloco try catch para tentar fechar a entrada de dados
            try {
                bw.close();
            }catch (Exception e){
                System.out.println(e);
            }

        }

    }


    public ArrayList<Cliente> ler(){

        ArrayList<Cliente> clientes = new ArrayList<>();

        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        String linhaLer;

        // bloco try catch para tentar ler um arquivo
        try{

            is = new FileInputStream("Reserva.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);


            linhaLer = br.readLine(); //le a primeira linha do arquivo para ver se tem resera cadastrados
            while(linhaLer != null){

                if(linhaLer.contains("Reserva")){ // se conter reserva, iremos ler as informações
                    Cliente c= new Cliente();
                    c.setNome(br.readLine()); // le o nome que é uma string
                    c.setidade(Integer.parseInt(br.readLine()));// le a idade que é um int
                    c.setCpfCliente(br.readLine()); // le um cpf que é uma string
                    c.setQtdPessoas(Integer.parseInt(br.readLine()));// le a qtd que é um int
                    c.setData(br.readLine()); // le um data que é uma string
                    clientes.add(c); // armazena as informações do cliente em uma lista
                }
                linhaLer = br.readLine(); // pula pra proxima linha
            }

        }catch (Exception e){
            System.out.println(e);
        }finally {

            // bloco try catch para tentar fechar a leitura de dados
            try{
                br.close();
            }catch (Exception e){
                System.out.println(e);
            }
        }


        return clientes;
    }


    public void remover(Cliente cl) {
        ArrayList<Cliente> clientes = ler(); // Lê todos os clientes do arquivo

        Iterator<Cliente> iterator = clientes.iterator();
        while (iterator.hasNext()) {
            Cliente c = iterator.next();
            if (c.getCpfCliente().equals(cl.getCpfCliente())) { // Verifica se o CPF corresponde ao cliente a ser removido
                iterator.remove(); // Remove o cliente da lista
                System.out.println("Reserva removido!");
                break; // Sai do loop após remover o cliente
            }
        }

        // Reescreve a lista atualizada no arquivo
        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;

        try {
            os = new FileOutputStream("Reserva.txt", false); // Sobrescreve o arquivo
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);

            for (Cliente c : clientes) {
                bw.write("Reserva");
                bw.newLine();
                bw.write(c.getNome() + "\n");
                bw.write(c.getidade() + "\n");
                bw.write(c.getCpfCliente() + "\n");
                bw.write(c.getQtdPessoas() + "\n");
                bw.write(c.getData() + "\n");

            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                bw.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public void atualizar(Cliente cl) {
        ArrayList<Cliente> clientes = ler(); // Lê todos os clientes do arquivo

    // Percorre a lista de reserva e remove o cliente desejado
    Iterator<Cliente> iterator = clientes.iterator();

        while (iterator.hasNext()) {
        Cliente c = iterator.next();
            if (c.getCpfCliente().equals(cl.getCpfCliente())) { // Verifica se o CPF corresponde ao funcionário a ser removido
            iterator.remove(); // Remove o cliente da lista
            System.out.println("Reserva removido!");
            break; // Sai do loop após remover o cliente
        }
    }

    // Reescreve a lista atualizada no arquivo
    OutputStream os = null;
    OutputStreamWriter osw = null;
    BufferedWriter bw = null;

        try {
        os = new FileOutputStream("Reserva.txt", true); // Sobrescreve o arquivo
        osw = new OutputStreamWriter(os);
        bw = new BufferedWriter(osw);

        for (Cliente c : clientes) {
            bw.write("Reserva");
            bw.newLine();
            bw.write(c.getNome() + "\n");
            bw.write(c.getidade() + "\n");
            bw.write(c.getCpfCliente() + "\n");
            bw.write(c.getQtdPessoas() + "\n");
            bw.write(cl.getData() + "\n");

        }
    } catch (Exception e) {
        System.out.println(e);
    } finally {
        try {
            bw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

}