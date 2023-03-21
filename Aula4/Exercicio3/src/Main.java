public class Main {
    public static void main(String[] args) {

        //objeto do tipo restaurante
        Restaurante r = new Restaurante();
        r.nome = "Pedra";
        r.cnpj = "1234";
        r.endereco = "Vila maria";

        r.fornecedores[0] = new Fornecedor("Comida mineira", 2);
        r.fornecedores[1] = new Fornecedor("Refrigerante", 2);
        r.fornecedores[2] = new Fornecedor("sobremesa", 3);

        r.exibirInfos();

    }
}
