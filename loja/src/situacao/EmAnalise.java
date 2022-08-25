
package situacao;

import orcamento.Orcamento;

public class EmAnalise extends SituacaoOrcamento{

    @Override
    public void finalizar(Orcamento orcamento){
        orcamento.setSituacao(new Finalizado());
    }
    
}
