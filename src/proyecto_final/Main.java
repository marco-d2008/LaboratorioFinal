package proyecto_final;

public class Main {
    public static void main(String[] args) {
        // Crear categorías
        Categoria cat1 = new Categoria(1, "Medicamentos");
        Categoria cat2 = new Categoria(2, "Vitaminas");

        // Crear productos
        Producto prod1 = new Producto(101, "Paracetamol", 0.10, 0.25, cat1);
        prod1.setCantidadMax(500);
        prod1.setCantidadMin(50);

        Producto prod2 = new Producto(102, "Vitamina C", 0.20, 0.50, cat2);
        prod2.setCantidadMax(300);
        prod2.setCantidadMin(30);

        // Crear cliente
        Cliente cliente1 = new Cliente(1, "Juan Pérez", "7777-8888");
        cliente1.setDireccion("San Salvador");

        // Crear empleado (puedes definir la clase Empleado similar a Cliente)
        Empleado emp1 = new Empleado(1, "María López", "9999-0000");

        // Crear venta
        Venta<Cliente, Empleado> venta1 = new Venta<>(1, "12/06/2026", cliente1, emp1);

        // Crear detalles de venta
        DetalleVenta<Producto> det1 = new DetalleVenta<>(1, 5, prod1);
        DetalleVenta<Producto> det2 = new DetalleVenta<>(2, 3, prod2);

        // Agregar detalles a la venta
        venta1.agregarDetalle(det1);
        venta1.agregarDetalle(det2);

        // Mostrar resultados
        System.out.println("Cliente: " + venta1.getCliente());
        System.out.println("Empleado: " + venta1.getEmpleado());
        System.out.println("Detalles de la venta:");
        for (DetalleVenta d : venta1.getDetalles()) {
            System.out.println(d);
        }
        System.out.println("Total de la venta: $" + venta1.getTotal());
    }}