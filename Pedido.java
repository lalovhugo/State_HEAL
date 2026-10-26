public class Pedido {
    private EstadoPedido estadoActual;
    
    public Pedido() {
        this.estadoActual = new EstadoPendiente();
    }
    
    public void setEstado(EstadoPedido estado) {
        this.estadoActual = estado;
    }
    
    public void procesar() {
        estadoActual.procesar(this);
    }
    
    public void cancelar() {
        estadoActual.cancelar(this);
    }
    
    public void enviar() {
        estadoActual.enviar(this);
    }
    
    public void entregar() {
        estadoActual.entregar(this);
    }
    
    public void mostrarEstado() {
        System.out.println("Estado actual: " + estadoActual.getClass().getSimpleName());
    }
}