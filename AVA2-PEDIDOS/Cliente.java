public class Cliente {
    private String nomeCompleteCliente;
    private String cpt;
    private String enderecoCliente;
    private String bairroCliente;
    private String cidadeCliente;
    private String estadoCliente;
    private String cepCliente;
    private String telefoneCliente;

    public Cliente(String nomeCompleteCliente, String cpt, String enderecoCliente, String bairroCliente,
                   String cidadeCliente, String estadoCliente, String cepCliente, String telefoneCliente) {
        this.nomeCompleteCliente = nomeCompleteCliente;
        this.cpt = cpt;
        this.enderecoCliente = enderecoCliente;
        this.bairroCliente = bairroCliente;
        this.cidadeCliente = cidadeCliente;
        this.estadoCliente = estadoCliente;
        this.cepCliente = cepCliente;
        this.telefoneCliente = telefoneCliente;
    }

    public String getNomeCompleteCliente() {
        return nomeCompleteCliente;
    }

    public String getCpt() {
        return cpt;
    }

    public String getTelefone() {
        return telefoneCliente;
    }

    public String getEndereco() {
        return enderecoCliente;
    }

    public String getBairro() {
        return bairroCliente;
    }

    public String getCidade() {
        return cidadeCliente;
    }

    public String getEstado() {
        return estadoCliente;
    }

    public String getCep() {
        return cepCliente;
    }
}