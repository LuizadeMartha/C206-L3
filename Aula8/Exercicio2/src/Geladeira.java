public class Geladeira extends Mercadoria{

    private int quantidadePortas;
    private int tamanho;
    private String tipo;

    public Geladeira(int codigo, String fabricante, String descricao, double valor, int quantidadePortas, int tamanho, String tipo) {
        super(codigo, fabricante, descricao, valor);
        this.quantidadePortas = quantidadePortas;
        this.tamanho = tamanho;
        this.tipo = tipo;
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}