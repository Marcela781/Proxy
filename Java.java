package br.edu.imepac.Main;

import br.edu.imepac.Orcamento;

import java.math.BigDecimal;

public class Java {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"),new BigDecimal("10"));
        System.out.println("valor orcamento ="+ orcamento.getValorOrcamento() );
        System.out.println("Tempo para ver o desconto ="+ orcamento.getDescontoOrcamento() );
    }
}
