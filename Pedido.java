package State;

public class Pedido {
    private boolean pendiente = true;
    private boolean procesado = false;
    private boolean enviado = false;
    private boolean entregado = false;
    private boolean cancelado = false;
    
    public void procesar() {
        if (pendiente && !cancelado) {
            System.out.println("Procesando pedido...");
            pendiente = false;
            procesado = true;
        } else {
            System.out.println("ERROR: No se puede procesar el pedido en estado actual");
        }
    }
    
    public void cancelar() {
        if (pendiente && !procesado) {
            System.out.println("Cancelando pedido...");
            pendiente = false;
            cancelado = true;
        } else {
            System.out.println("ERROR: No se puede cancelar el pedido en estado actual");
        }
    }
    
    public void enviar() {
        if (procesado && !enviado) {
            System.out.println("Enviando pedido...");
            procesado = false;
            enviado = true;
        } else {
            System.out.println("ERROR: No se puede enviar el pedido en estado actual");
        }
    }
    
    public void entregar() {
        if (enviado && !entregado) {
            System.out.println("Entregando pedido...");
            enviado = false;
            entregado = true;
        } else {
            System.out.println("ERROR: No se puede entregar el pedido en estado actual");
        }
    }
    
    public void mostrarEstado() {
        System.out.println("Pendiente: " + pendiente + 
                          ", Procesado: " + procesado + 
                          ", Enviado: " + enviado + 
                          ", Entregado: " + entregado + 
                          ", Cancelado: " + cancelado);
    }
}