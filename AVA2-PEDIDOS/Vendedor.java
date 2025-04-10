public class Vendedor {
    private String nomeCompleteVendedor;
    private String matriculaVendedor;

    public Vendedor(String nomeCompleteVendedor, String matriculaVendedor) {
        this.nomeCompleteVendedor = nomeCompleteVendedor;
        this.matriculaVendedor = matriculaVendedor;
    }

    public String getNomeCompleteVendedor() {
        return nomeCompleteVendedor;
    }

    public String getMatricula() {
        return matriculaVendedor;
    }
}