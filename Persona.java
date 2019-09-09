package directorioTelefonico;

public class Persona {
	String nombre;
	String telefono;
	String direccion;
	
	public Persona(String nombre, String telefono, String direccion) {
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
	}
	
	public Persona(String nombre, String telefono) {
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = " ------ ";
	}
	
	public Persona(String nombre) {
		this.nombre = nombre;
		this.telefono = " ------ ";
		this.direccion = " ------ ";
	}
	public Persona() {
		this.nombre = " N.N ";
		this.telefono = " ------ ";
		this.direccion = " ------ ";
	}
	
	
	public void cambiarNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void cambiarTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public void cambiarDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public void verNombre() {
		String x;
		x = this.nombre;
		System.out.println(x);
	}
	
	public void verTelefono() {
		String x;
		x = this.telefono;
		System.out.println(x);
	}
	
	public void verDireccion() {
		String x;
		x = this.direccion;
		System.out.println(x);
	}
	
	public String toString() {
		String x;
		x = "[Nombre: " + nombre +"]"+ " [Telefono: " + telefono +"]"+ " [Direccion: " + direccion+"]";
		return x;
	}
}
