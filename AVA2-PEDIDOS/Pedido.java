import java.util.Date;

public class Pedido {
    private String identificadorPedido;
    private Date dataHoraPedido;
    private String statusPedido;
    private String vendedorPedido;
    private String clientePedido;
    private String idProduto;
    private String nomeProduto;
    private int qtdProduto;
    private double precoProduto;
    private String descricaoProduto;

    public Pedido(String identificadorPedido, Date dataHoraPedido, String statusPedido, String vendedorPedido,
                  String clientePedido, String idProduto, String nomeProduto, int qtdProduto, double precoProduto,
                  String descricaoProduto) {
        this.identificadorPedido = identificadorPedido;
        this.dataHoraPedido = dataHoraPedido;
        this.statusPedido = statusPedido;
        this.vendedorPedido = vendedorPedido;
        this.clientePedido = clientePedido;
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.qtdProduto = qtdProduto;
        this.precoProduto = precoProduto;
        this.descricaoProduto = descricaoProduto;
    }

    public double valorUnitario() {
        return precoProduto;
    }

    public double valorTotalPedido() {
        return qtdProduto * precoProduto;
    }


    public String getIdentificadorPedido() {
        return identificadorPedido;
    }

    public Date getDataHoraPedido() {
        return dataHoraPedido;
    }

    public String getStatusPedido() {
        return statusPedido;
    }

    public String getVendedorPedido() {
        return vendedorPedido;
    }

    public String getClientePedido() {
        return clientePedido;
    }

    public String getIdProduto() {
        return idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public int getQtdProduto() {
        return qtdProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }
}