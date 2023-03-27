package impostos;

import orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {
    public BigDecimal calcular(Orcamento orcamento, TipoImposto tipoImposto) {
        switch (tipoImposto) {
            case ICMS:
                return orcamento.getValor().multiply(new BigDecimal("0.1"));
            case ISS:
                return orcamento.getValor().multiply(new BigDecimal("0.6"));
            default:
                return BigDecimal.ZERO;
        }

    }
}
