public class Main {
    public static void main(String[] args) {

        Produto p1 = new Produto();
        Produto p2 = new Produto();

        p1.nome = "Iphone";
        p1.quantidade = 2;
        p1.categoria = "Eletrônico";
        p1.codigoProduto = "OB14";
        p1.codigoSerie = 1234;

        p2.nome = "Televisão";
        p2.quantidade = 10;
        p2.categoria = "Eletrônico";
        p2.codigoProduto = "AA56";
        p2.codigoSerie = 4567;

        p1.mostraInfo();
        p2.mostraInfo();


    }
}
