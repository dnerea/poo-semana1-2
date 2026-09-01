// Pedido.java — Semana 2: clase con clase anidada (para la rama feature/clases-anidadas)
public class Pedido {

    private String codigoPedido;
    private static int totalPedidos = 0;

    // Clase anidada: representa un ítem dentro de un pedido
    public class Item {
        private String descripcion;
        private double precio;

        public Item(String descripcion, double precio) {
            this.descripcion = descripcion;
            this.precio = precio;
        }

        public void mostrarItem() {
            System.out.println("  - " + descripcion + ": S/ " + precio);
        }
    }

    public Pedido(String codigoPedido) {
        this.codigoPedido = codigoPedido;
        totalPedidos++;
    }

    public static int getTotalPedidos() { return totalPedidos; }

    public void mostrarPedido() {
        System.out.println("Pedido: " + codigoPedido);
    }
}
