
import java.math.BigDecimal;
import java.util.Arrays;
import pedido.EnviarEmail;
import pedido.GerarPedido;
import pedido.GerarPedidoHandler;
import pedido.SalvarPedidoNoBancoDeDados;



public class TestesPedidos {

    public static void main(String[] args) {
        String cliente = "ROdrigo";
        BigDecimal valorOrcamento = new BigDecimal("300");
        int quantidadeDeItens = Integer.parseInt("2");
        
        GerarPedido gerador = new GerarPedido(cliente, valorOrcamento, quantidadeDeItens);
        GerarPedidoHandler handler = new GerarPedidoHandler(
                Arrays.asList(new SalvarPedidoNoBancoDeDados(),
                    new EnviarEmail()
        ));
        handler.execute(gerador);
    }  
}
