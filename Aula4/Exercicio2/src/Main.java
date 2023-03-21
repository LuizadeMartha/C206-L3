public class Main {
    public static void main(String[] args) {

        //criando objeto do tipo empresa
        Empresa e = new Empresa();
        e.cnpj = "89827";
        e.endereço = "Centro";

        //criando objeto do tipo empresa
        e.contatos[0] = new Contato("Luiza", "Luiza@gmail", "997890089", "16/08/2001");
        e.contatos[1] = new Contato("Lucas","Lucas@gmail","998765432","10/01/1995");

        //chamando metodo
        e.exibirInfos();

    }
}
