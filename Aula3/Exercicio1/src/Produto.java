public class Produto {
    int codigoSerie;
    String codigoProduto;
    String nome;
    String categoria;
    int quantidade;

    void mostraInfo(){
        System.out.println("Codigo Serie: "+this.codigoSerie +
                " Codigo do Produto: " +this.codigoProduto +
                " Nome: " +this.nome +
                " Categoria: " +this.categoria +
                " Quantidade: " +this.quantidade);

    }
}
