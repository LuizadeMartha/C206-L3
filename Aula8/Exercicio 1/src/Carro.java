public abstract class Carro implements Controle{

    private double valor;
    private String cor;
    private int ano;

    public Carro(double valor, String cor, int ano) {
        this.valor = valor;
        this.cor = cor;
        this.ano = ano;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
