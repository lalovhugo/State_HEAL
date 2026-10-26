public interface EstadoPedido {
    void procesar(Pedido pedido);
    void cancelar(Pedido pedido);
    void enviar(Pedido pedido);
    void entregar(Pedido pedido);
}