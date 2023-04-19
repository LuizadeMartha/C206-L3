public class Notebook extends Produto{

    private double armanezamento;
    private String gpu;
    private String processador;

    public Notebook(String nome, double preco, String gpu, String processador, double armanezamento){
        super(nome, preco);
        this.gpu = gpu;
        this.processador = processador;
        this.armanezamento = armanezamento;
    }

    public double getArmanezamento() {
        return armanezamento;
    }


    public String getGpu() {
        return gpu;
    }


    public String getProcessador() {
        return processador;
    }

    @Override
    public String etiquetaPreco(){
        return super.etiquetaPreco() + "gpu: " +gpu+ "processador: "+processador+ "armazenamento: "+armanezamento;
    }
}
