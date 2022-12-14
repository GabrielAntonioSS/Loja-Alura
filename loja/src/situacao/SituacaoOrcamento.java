package situacao;

import java.math.BigDecimal;
import loja.DomainException;
import orcamento.Orcamento;

public abstract class SituacaoOrcamento {

    public BigDecimal calcularValorExtra(Orcamento orcamento){
        return BigDecimal.ZERO;
    }
    
    public void aprovar(Orcamento orcamento) {
        throw new DomainException("Orcamento nao pode ser aprovado");
    }

    public void reprovar(Orcamento orcamento) {
        throw new DomainException("Orcamento nao pode ser reprovado");
    }

    public void finalizar(Orcamento orcamento) {
        throw new DomainException("Orcamento nao pode ser finalizado");
    }
}
