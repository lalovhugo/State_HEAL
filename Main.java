package State;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.mostrarEstado();
        
        pedido.procesar();
        pedido.mostrarEstado();
        
        pedido.enviar();
        pedido.mostrarEstado();
        
        pedido.entregar();
        pedido.mostrarEstado();
        
        // Intentar operación inválida
        pedido.cancelar();
    }
}