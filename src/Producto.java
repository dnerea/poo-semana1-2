// Producto.java — simula el aporte de un colaborador (Pull Request)
public class Producto {

    private String nombre;
    private double precio;
    private static int totalProductos = 0;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        totalProductos++;
    }

    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }

    // Sobrecarga de método: aplicar descuento
    public double aplicarDescuento(double porcentaje) {
        return precio - (precio * porcentaje / 100);
    }

    public double aplicarDescuento(double porcentaje, double montoFijo) {
        return aplicarDescuento(porcentaje) - montoFijo;
    }

    public static int getTotalProductos() { return totalProductos; }

    public void mostrarProducto() {
        System.out.println(nombre + " - S/ " + precio);
    }
}
