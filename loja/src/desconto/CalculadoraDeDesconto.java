
package desconto;

import java.math.BigDecimal;
import orcamento.Orcamento;

public class CalculadoraDeDesconto {

    public BigDecimal calcular(Orcamento orcamento) {
        Desconto cadeiaDeDescontos = new DescontoMaisCinco(
                new DescontoMaisQuinhentos(
                        new SemDesconto()));
        return cadeiaDeDescontos.calcular(orcamento);
    }
}
