import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        Carrinho c = new Carrinho();
        Produto p1 = new Produto("Armario", 89);
        Produto p2 = new Produto("Geladeira", 1700);
        Produto p3 = new Produto("Carro", 20000);

        c.addProduto(p1);
        c.addProduto(p2);
        c.addProduto(p3);

        //exer 1
        //infos do produto em ordem crescente
        Collections.sort(c.getProdutos());

        for (Produto p : c.getProdutos()){
            System.out.println(p.getNome());
            System.out.println(p.getPreco());
        }
        System.out.println();

        //exer 2
        //infos do produto em ordem crescente
        Collections.sort(c.getProdutos());

        for (Produto p : c.getProdutos()){
            System.out.println(p.getNome());
            System.out.println(p.getPreco());
        }

        System.out.println();

        //exer 3
        //infos do produto em ordem decrescente

        Collections.sort(c.getProdutos());
        Collections.reverse(c.getProdutos());

        for (Produto p : c.getProdutos()){
            System.out.println(p.getNome());
            System.out.println(p.getPreco());
        }



    }
}
