import java.util.ArrayList;

public class Carrinho {

    private ArrayList<Produto> produtos = new ArrayList();

    public void addProduto(Produto produto){
        produtos.add(produto);

    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }
}
