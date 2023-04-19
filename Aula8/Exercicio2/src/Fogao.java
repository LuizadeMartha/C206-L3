public class Fogao extends Mercadoria{

    private int qtddeBocas;
    private String tipoAcendimento;

    public Fogao(int codigo, String fabricante, String descricao, double valor, int qtddeBocas, String tipoAcendimento) {
        super(codigo, fabricante, descricao, valor);
        this.qtddeBocas = qtddeBocas;
        this.tipoAcendimento = tipoAcendimento;
    }

    public int getQtddeBocas() {
        return qtddeBocas;
    }

    public void setQtddeBocas(int qtddeBocas) {
        this.qtddeBocas = qtddeBocas;
    }

    public String getTipoAcendimento() {
        return tipoAcendimento;
    }

    public void setTipoAcendimento(String tipoAcendimento) {
        this.tipoAcendimento = tipoAcendimento;
    }
}
