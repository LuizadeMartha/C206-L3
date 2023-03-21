public class Carrinho {
    double total;

    //criando uma array do tipo produtos
    Produto[] produtos = new Produto[10];


    void exibirInfor(){
        for(int i=0; i<produtos.length; i++){
            if(produtos[i] != null){
                System.out.println("Nome do produto:" + produtos[i].nome);
                System.out.println("Descrição do produto:" + produtos[i].descricao);
                System.out.println("Fabricante do produto:" + produtos[i].fabricante);
                System.out.println("Preço do produto:" + produtos[i].preco);


            }
        }
    }
    double calculaTotal(){
        for(int i=0; i<produtos.length;i++){
            if(produtos[i] != null){
                total += produtos[i].preco;
            }
        }
        return total;
    }
}
