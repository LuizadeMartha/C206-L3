public class Faculdade {
    String nome;
    String cnpj;


    Faculdade (String nome, String cnpj){
        this.nome = nome;
        this.cnpj = cnpj;
    }


    void exibirInfos(){
        System.out.println("nome: "+nome);
        System.out.println("cnpj: " +cnpj);

    }
}
