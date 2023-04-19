public class Suv extends Carro {

    private String tracao;

    public Suv(double valor, String cor, int ano, String tracao) {
        super(valor, cor, ano);
        this.tracao = tracao;
    }

    @Override
    public void taxa() {
        System.out.println("taxa: "+ getValor());
    }

    @Override
    public void mostraInnfo() {
        System.out.println("Valor: "+getValor());
        System.out.println("Cor: "+getCor());
        System.out.println("Ano: "+getAno());
        System.out.println("tracao: "+ tracao);

    }
}
