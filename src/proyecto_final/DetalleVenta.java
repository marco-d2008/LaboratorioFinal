package proyecto_final;

public class DetalleVenta<Producto> {
	
	    // Atributos
	    private int idDetalle;
	    private int cantidad;
	    private double subtotal;
	    private Producto producto;

	    // Constructor
	    public DetalleVenta(int id, int cant, Producto proc) {
	        this.idDetalle = id;
	        this.cantidad = cant;
	        this.producto = proc;
	        this.subtotal = calcularSubtotal(); // Se calcula automáticamente al crearse
	    }

	    // Métodos de negocio
	    public double calcularSubtotal() {
	        if (this.producto != null) {
	            return this.cantidad * this.cantidad;
	        }
	        return 0.0;
	    }

	    public double getSubtotal() {
	        return subtotal;
	    }

	    // Getters y Setters estándar
	    public int getIdDetalle() {
	        return idDetalle;
	    }

	    public int getCantidad() {
	        return cantidad;
	    }

	    public void setCantidad(int cant) {
	        this.cantidad = cant;
	        this.subtotal = calcularSubtotal(); // Recalcular si cambia la cantidad
	    }

	    public Producto getProducto() {
	        return producto;
	    }

	    public void setProducto(Producto proc) {
	        this.producto = proc;
	        this.subtotal = calcularSubtotal(); // Recalcular si cambia el producto
	    }

	    @Override
	    public String toString() {
	        return "DetalleVenta{" + "idDetalle=" + idDetalle + ", cantidad=" + cantidad + ", subtotal=" + subtotal + '}';
	    }
	}
