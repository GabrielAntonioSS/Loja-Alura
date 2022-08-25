
package situacao;

import orcamento.Orcamento;

public class Reprovado {

    public void finalizar(Orcamento orcamento){
        orcamento.setSituacao(new Finalizado());
    }
    
}
