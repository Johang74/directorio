package directorioTelefonico;

public class Empresa {
	String nit;
	String razonSocial;
	String telefono;
	String direccion;
	String servicio;

	public Empresa(String nit, String razonSocial, String telefono, String direccion, String servicio) {
		this.nit = nit;
		this.razonSocial = razonSocial;
		this.telefono = telefono;
		this.direccion = direccion;
		this.servicio = servicio;
	}
	public Empresa() {
		this.nit = " ----- ";
		this.razonSocial = "N.N";
		this.telefono = " ----- ";
		this.direccion = " ----- ";
		this.servicio = " ----- ";
	}
	
	
	
	
	public void cambiarRazonSocial(String rs) {
		this.razonSocial = rs;
	}
	
	public void cambiarTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public void cambiarDireccion(String direccion) {
		this.direccion = direccion;
	}
	public void cambiarNit(String n) {
		this.nit = n;
	}
	public void cambiarServicio(String ser) {
		this.servicio = ser;
	}
	
	public void verNit() {
		String x;
		x = this.nit;
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
	
	public void verServicio() {
		String x;
		x = this.servicio;
		System.out.println(x);
	}
	
	public void verRazon() {
		String x;
		x = this.razonSocial;
		System.out.println(x);
	}
	
	public String toString() {
		String x;
		x = "[Nit: " + nit +"]"+ " [Razon social: " + razonSocial +"]"+ " [Servicio: " + servicio +"]"+ " [Telefono: " + telefono +"]"+ " [Direccion: " + direccion +"]";
		return x;
	}

}
