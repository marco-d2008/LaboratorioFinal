package laboratoriofinal;

public class Empleado {

	    // Atributos
	    private int idEmpleado;
	    private String nombre;
	    private String cargo;
	    private String direccion;
	    private String fechaIngreso;
	    private String horarioEntrada;
	    private String horarioSalida;
		private String fecha;

	    // Constructor
	    public Empleado(int id, String nombre, String cargo) {
	        this.idEmpleado = id;
	        this.nombre = nombre;
	        this.cargo = cargo;
	    }

	    // Getters y Setters
	    public int getIdEmpleado() {
	        return idEmpleado;
	    }

	    public void setIdEmpleado(int id) {
	        this.idEmpleado = id;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public String getCargo() {
	        return cargo;
	    }

	    public void setCargo(String cargo) {
	        this.cargo = cargo;
	    }

	    public String getDireccion() {
	        return direccion;
	    }

	    public void setDireccion(String dir) {
	        this.direccion = dir;
	    }

	    public String getFechaIngreso() {
	        return fechaIngreso;
	    }

	    public void setFechaIngreso(String fecha) {
	        this.fecha = fecha;
	    }

	    public String getHorarioEntrada() {
	        return horarioEntrada;
	    }

	    public void setHorarioEntrada(String entrada) {
	        this.horarioEntrada = entrada;
	    }

	    public String getHorarioSalida() {
	        return horarioSalida;
	    }

	    public void setHorarioSalida(String salida) {
	        this.horarioSalida = salida;
	    }

	    @Override
	    public String toString() {
	        return "Empleado{" + "idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", cargo=" + cargo + '}';
	    }
	}

