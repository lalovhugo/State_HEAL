public class EstadoPendiente implements EstadoPedido {
    @Override
    public void procesar(Pedido pedido) {
        System.out.println("Procesando pedido...");
        pedido.setEstado(new EstadoProcesado());
    }
    
    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("Cancelando pedido...");
        pedido.setEstado(new EstadoCancelado());
    }
    
    @Override
    public void enviar(Pedido pedido) {
        System.out.println("ERROR: No se puede enviar un pedido pendiente");
    }
    
    @Override
    public void entregar(Pedido pedido) {
        System.out.println("ERROR: No se puede entregar un pedido pendiente");
    }
}