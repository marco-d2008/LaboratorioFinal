package laboratoriofinal;

public class Cliente {
	
	    // Atributos
	    private int idCliente;
	    private String nombre;
	    private String direccion;
	    private String telefono;

	    // Constructor
	    public Cliente(int id, String nombre, String tel) {
	        this.idCliente = id;
	        this.nombre = nombre;
	        this.telefono = tel;
	    }

	    // Getters y Setters
	    public int getIdCliente() {
	        return idCliente;
	    }

	    public void setIdCliente(int id) {
	        this.idCliente = id;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public String getDireccion() {
	        return direccion;
	    }

	    public void setDireccion(String dir) {
	        this.direccion = dir;
	    }

	    public String getTelefono() {
	        return telefono;
	    }

	    public void setTelefono(String tel) {
	        this.telefono = tel;
	    }

	    @Override
	    public String toString() {
	        return "Cliente{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + '}';
	    }
	}

