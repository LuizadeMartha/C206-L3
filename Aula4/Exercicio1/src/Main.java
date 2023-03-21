public class Main {
    public static void main(String[] args) {

        //criando um objeto do tipo carrinho e um do tipo produto
        Carrinho c1 = new Carrinho();
        Produto p1 = new Produto();

        //criando o objeto do produto[0] do meu carrinho c1:
        c1.produtos[0] = new Produto();
        c1.produtos[0].nome = "Short";
        c1.produtos[0].descricao = "Short jeans";
        c1.produtos[0].fabricante = "Hering";
        c1.produtos[0].preco= 110;

        p1.nome = "Blusa";
        p1.descricao = "Blusa de frio";
        p1.fabricante = "Hering";
        p1.preco = 75;

        //pontando o produto[1] do meu carrinho c para ele:

        c1.produtos[1] = p1;

        //chamando o metodo
        c1.exibirInfor();
        c1.calculaTotal();

    }
}
