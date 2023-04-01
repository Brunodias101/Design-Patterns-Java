import pedido.GeraPedido;
import pedido.GeraPedidoHandler;

import java.math.BigDecimal;

public class TestesPedidos {
    public static void main(String[] args) {
        String cliente =  args[0];
        BigDecimal valorOrcamento = new BigDecimal(args[1]);
        int quantidadesItens = Integer.parseInt(args[2]);

        GeraPedido gerador = new GeraPedido(cliente,valorOrcamento,quantidadesItens);
        GeraPedidoHandler handler = new GeraPedidoHandler(/*dependencia*/);
        handler.execute(gerador);
    }
}
