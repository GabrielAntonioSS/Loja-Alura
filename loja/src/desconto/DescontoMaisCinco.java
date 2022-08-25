package desconto;

import java.math.BigDecimal;
import orcamento.Orcamento;

public class DescontoMaisCinco extends Desconto {

    public DescontoMaisCinco(Desconto proximo) {
        super(proximo);
    }

    @Override
    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));

    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getQuantidadeDeItens() > 5;
    }

}
