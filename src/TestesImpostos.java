import impostos.CalculadoraDeImpostos;
import impostos.ICMS;
import impostos.ISS;
import orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {
    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento( new BigDecimal("100"),1);
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        System.out.println(calculadora.calcular(orcamento, new ICMS()));
    }
}