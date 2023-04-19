import com.sun.source.doctree.SeeTree;

public class Camiseta extends Produto{

    private String cor;
    private String tamanho;

    public Camiseta(String nome, double preco, String cor, String tamanho){
        super(nome, preco);
        this.cor = cor;
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public String getTamanho() {
        return tamanho;
    }
     @Override
    public String etiquetaPreco(){
       return super.etiquetaPreco() + "cor: " +cor+ "tamanho: " +tamanho;
    }

}
