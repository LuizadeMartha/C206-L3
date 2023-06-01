package Controller;

import Model.Professores;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;


public class Arquivo {

    public void escrever(Professores prof){

        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;
        String linhaEscrever;

        try{
            os = new FileOutputStream("Professores.txt", true);
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);

            // escrevendo os valores usando bw:
            bw.write("Professores: ");
            bw.newLine();
            bw.write(prof.nome + "\n");
            bw.write(prof.cpf + "\n");
            bw.write(prof.materia + "\n");

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


    public ArrayList<Professores> ler(){

        ArrayList<Professores> professores = new ArrayList<>();

        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        String linhaLer;

        // bloco try catch para tentar ler um arquivo
        try{
            is = new FileInputStream("Professores.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);


            linhaLer = br.readLine();
            while(linhaLer != null){

                if(linhaLer.contains("Professores")){
                    Professores p = new Professores();
                    p.nome = br.readLine(); // le o nome que é uma string
                    p.cpf = Integer.parseInt(br.readLine()); // le a idade que é um int
                    p.materia = br.readLine(); // le um cpf que é uma string
                    professores.add(p);
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


        return professores;
    }


    public void remover(Professores prof) {
        ArrayList<Professores> professores = ler(); // Lê todos os professores do arquivo


        Iterator<Professores> iterator = professores.iterator();
        while (iterator.hasNext()) {
            Professores f = iterator.next();
            if (Objects.equals(f.cpf, prof.cpf)){ // Verifica se o CPF corresponde ao funcion&aacute;rio a ser removido
                iterator.remove(); // Remove o professores da lista
                System.out.println("Professor removido!");
                break; // Sai do loop após remover o professor
            }
        }

        // Reescreve a lista atualizada no arquivo
        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;

        try {
            os = new FileOutputStream("Professores.txt", false); // Sobrescreve o arquivo
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);

            for (Professores f : professores) {
                bw.write("Professores");
                bw.newLine();
                bw.write(f.nome + "\n");
                bw.write(f.cpf + "\n");
                bw.write(f.materia + "\n");
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

