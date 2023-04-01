package descontos;

import orcamento.Orcamento;

import java.math.BigDecimal;

 public class CalculadoraDeDescontos {
    public BigDecimal calcular(Orcamento orcamento) {
        Desconto cadeiaDeDescontos =  new DescontoParaOrcamentoComMaisDeCincoItens(
                new DescontoParaOrcamentoComMaisDeCincoItens(
                        new SemDesconto()));
        return cadeiaDeDescontos.calcular(orcamento);
    }
}
