package laboratoriofinal;

public class Categoria {
	 
	    // Atributos
	    private int idCategoria;
	    private String nombre;

	    // Constructor
	    public Categoria(int id, String nombre) {
	        this.idCategoria = id;
	        this.nombre = nombre;
	    }

	    // Getters y Setters
	    public int getIdCategoria() {
	        return idCategoria;
	    }

	    public void setIdCategoria(int id) {
	        this.idCategoria = id;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    @Override
	    public String toString() {
	        return "Categoria{" + "idCategoria=" + idCategoria + ", nombre=" + nombre + '}';
	    }
	}

