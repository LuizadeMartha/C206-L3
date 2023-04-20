public class Zoo {
    private String nome;
    private String endereco;
    private long cnpj;

     Animal [] bixo = new Animal[100];


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public Animal[] getBixo() {
        return bixo;
    }

    public void setBixo(Animal[] bixo) {
        this.bixo = bixo;
    }
    public void mostraInfo() {
        System.out.println("nome: "+nome);
        System.out.println("endereço: "+endereco);
        System.out.println("CNPJ: "+cnpj);

    }
}


