package pedido;

import orcamento.Orcamento;

import java.time.LocalDateTime;

public class GeraPedidoHandler {
    // construtor com injenccao de dependenciar: repository, service, etc ...

    public void execute(GeraPedido dados) {
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());

        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now() , orcamento);

        System.out.println("Salvar pedido no banco");
        System.out.println("Enviar email com os dados do novo pedido");

    }
}
