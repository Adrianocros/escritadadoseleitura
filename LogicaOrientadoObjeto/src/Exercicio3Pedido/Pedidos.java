package Exercicio3Pedido;

public class Pedidos {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();

        pedido.codigo = 1;
        pedido.subtotal = 100.0;
        pedido.desconto = 5.0;

        Pedido pedido1 = new Pedido();

        pedido1.codigo = 2;
        pedido1.subtotal = 150.0;
        pedido1.desconto = 10.0;

        System.out.println("Codigo: " + pedido.getCodigo() + ", subtotal " + pedido.getSubtotal() + ", desconto " +
                pedido.getDesconto() + ", Total do pedido R$ " + pedido.getTotal());

        System.out.println("Codigo: " + pedido1.getCodigo() + ", subtotal " + pedido1.getSubtotal() + ", desconto " +
                pedido1.getDesconto() + ", Total do pedido R$ " + pedido1.getTotal());
    }

}
