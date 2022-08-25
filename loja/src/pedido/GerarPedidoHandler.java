
package pedido;

import java.time.LocalDate;
import java.util.List;
import orcamento.Orcamento;

public class GerarPedidoHandler {
    
    private List<AcaoAposGerarPedido> acoes;

    public GerarPedidoHandler(List<AcaoAposGerarPedido> acoes) {
        this.acoes = acoes;
    }
    
    public void execute(GerarPedido dados){
 
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeDeItens());
       
        Pedido pedido = new Pedido(dados.getCliente(), LocalDate.now(), orcamento);
        
        acoes.forEach(a -> a.executarAcao(pedido));
    }
    
}