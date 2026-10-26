public class EstadoEntregado implements EstadoPedido {
    @Override
    public void procesar(Pedido pedido) {
        System.out.println("ERROR: El pedido ya fue entregado");
    }
    
    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("ERROR: No se puede cancelar un pedido entregado");
    }
    
    @Override
    public void enviar(Pedido pedido) {
        System.out.println("ERROR: El pedido ya fue entregado");
    }
    
    @Override
    public void entregar(Pedido pedido) {
        System.out.println("ERROR: El pedido ya está entregado");
    }
}