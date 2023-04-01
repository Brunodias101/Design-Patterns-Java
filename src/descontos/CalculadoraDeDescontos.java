package descontos;

import orcamento.Orcamento;

import java.math.BigDecimal;

 public class CalculadoraDeDescontos {
    public BigDecimal calcular(Orcamento orcamento) {
        Desconto desconto =  new DescontoParaOrcamentoComMaisDeCincoItens(
                new DescontoParaOrcamentoComMaisDeCincoItens(
                        new SemDesconto()));
        return desconto.calcular(orcamento);
    }
}
