public class EstadoCancelado implements EstadoPedido {
    @Override
    public void procesar(Pedido pedido) {
        System.out.println("ERROR: No se puede procesar un pedido cancelado");
    }
    
    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("ERROR: El pedido ya está cancelado");
    }
    
    @Override
    public void enviar(Pedido pedido) {
        System.out.println("ERROR: No se puede enviar un pedido cancelado");
    }
    
    @Override
    public void entregar(Pedido pedido) {
        System.out.println("ERROR: No se puede entregar un pedido cancelado");
    }
}