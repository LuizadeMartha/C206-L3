public class Restaurante {

    String cnpj;
    String endereco;
    String nome;
    Fornecedor fornecedores [] = new Fornecedor[3];

    void exibirInfos(){
        System.out.println("cnpj:"+cnpj);
        System.out.println("endereço:"+endereco);
        System.out.println("nome:"+nome);
        for(int i =0; i<fornecedores.length; i++){
            if(fornecedores[1] != null){
                System.out.println("tipo: " +fornecedores[i].tipo);
                System.out.println("quantidade: " +fornecedores[i].quantidade);
            }
        }

    }


}
