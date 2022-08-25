package desconto;

import java.math.BigDecimal;
import orcamento.Orcamento;

public class DescontoMaisQuinhentos extends Desconto {

    public DescontoMaisQuinhentos(Desconto proximo) {
        super(proximo);
    }

    @Override
    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.05"));

    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
        
    }
}
