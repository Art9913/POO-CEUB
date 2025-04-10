import java.util.Date;

public class Main {
    public static void main(String[] args) {
        
        Vendedor vendedor = new Vendedor("João Silva", "12345");

        
        Cliente cliente = new Cliente("Maria Oliveira", "987654321", "Rua A, 123", "Centro", "São Paulo", "SP", "01234-567", "11987654321");

        
        Pedido pedido = new Pedido("PED001", new Date(), "Em andamento", vendedor.getMatricula(), cliente.getCpt(),
                "PROD001", "Produto Exemplo", 2, 50.0, "Descrição do produto exemplo");

        
        System.out.println("Identificador do Pedido: " + pedido.getIdentificadorPedido());
        System.out.println("Valor Unitário do Produto: " + pedido.valorUnitario());
        System.out.println("Valor Total do Pedido: " + pedido.valorTotalPedido());
        System.out.println("Status do Pedido: " + pedido.getStatusPedido());
    }
}