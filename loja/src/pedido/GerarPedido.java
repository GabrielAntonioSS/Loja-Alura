package pedido;

import java.math.BigDecimal;

public class GerarPedido {

    private String cliente;
    private BigDecimal valorOrcamento;
    private int quantidadeDeItens;

    // injecao de dependencias: PedidoRespository, EmailService...
    public GerarPedido(String cliente, BigDecimal valorOrcamento, int quantidadeDeItens) {
        this.cliente = cliente;
        this.valorOrcamento = valorOrcamento;
        this.quantidadeDeItens = quantidadeDeItens;
    }

    public String getCliente() {
        return cliente;
    }

    public BigDecimal getValorOrcamento() {
        return valorOrcamento;
    }

    public int getQuantidadeDeItens() {
        return quantidadeDeItens;
    }

}
