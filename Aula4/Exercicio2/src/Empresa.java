public class Empresa {

    String cnpj;
    String endereço;
    //criando uma array de contatos:
    Contato contatos [] = new Contato[10];


    void exibirInfos(){
        System.out.println("CNOJ: "+cnpj);
        System.out.println("Endereço: " +endereço);

        for(int i = 0; i<contatos.length; i++){
            if(contatos[i] != null){
                System.out.println("Nome:" +contatos[i].nome);
                System.out.println("Nome:" +contatos[i].email);
                System.out.println("Nome:" +contatos[i].telefone);
                System.out.println("Nome:" +contatos[i].dataNascimento);
            }
        }
    }
}
