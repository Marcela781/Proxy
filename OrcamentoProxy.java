package br.edu.imepac;

import java.math.BigDecimal;


public class OrcamentoProxy extends Orcamento {

    private BigDecimal descontoOrcamento;

  private Orcamento orcamento;

    public OrcamentoProxy(BigDecimal valorOrcamento, BigDecimal descontoOrcamento, Orcamento orcamento) {
        super(valorOrcamento, descontoOrcamento);
        this.orcamento = orcamento;
    }

    @Override
    public BigDecimal getDescontoOrcamento() {
        if (descontoOrcamento == null) {
            this.descontoOrcamento = orcamento.getDescontoOrcamento();
        }
        return descontoOrcamento;
    }

    @Override
    public void setDescontoOrcamento(BigDecimal descontoOrcamento) {
        this.descontoOrcamento = descontoOrcamento;
    }
}
