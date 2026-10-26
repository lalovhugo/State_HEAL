public class EstadoProcesado implements EstadoPedido {
    @Override
    public void procesar(Pedido pedido) {
        System.out.println("ERROR: El pedido ya está procesado");
    }
    
    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("ERROR: No se puede cancelar un pedido ya procesado");
    }
    
    @Override
    public void enviar(Pedido pedido) {
        System.out.println("Enviando pedido...");
        pedido.setEstado(new EstadoEnviado());
    }
    
    @Override
    public void entregar(Pedido pedido) {
        System.out.println("ERROR: No se puede entregar un pedido no enviado");
    }
}