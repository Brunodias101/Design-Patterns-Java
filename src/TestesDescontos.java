import descontos.CalculadoraDeDescontos;
import impostos.CalculadoraDeImpostos;
import impostos.ICMS;
import orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesDescontos {
    public static void main(String[] args) {

        Orcamento primeiro = new Orcamento( new BigDecimal("200"),4);
        Orcamento segundo = new Orcamento( new BigDecimal("200"),1);

        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
        System.out.println(calculadora.calcular(primeiro));
        System.out.println(calculadora.calcular(segundo));
    }
}