package pedido;

public class EnviarEmail implements AcaoAposGerarPedido{

    public void executarAcao(Pedido pedido) {
        System.err.println("Enviando email com dados do pedido");
    }
}
