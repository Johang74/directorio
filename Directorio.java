package directorioTelefonico;

public class Directorio {
	
	Nodo puntero = null;
	
	public class Nodo {
		Object item;
		boolean tipo;
		Nodo siguiente;
		
		public Nodo(Object dato) {
			this.item = dato;
			this.siguiente = null;
		}
		public Nodo() {
			this.item = null;
			this.siguiente = null;
		}
		
		
	}
	
	public void insertar(Object d, boolean tipo) {
		Nodo y = this.puntero;
		Nodo x = new Nodo(d);
		x.item = d;
		x.tipo = tipo;
		if( y == null) {
			x.siguiente = puntero;
			puntero = x;
			
		}else {
			x.siguiente = y.siguiente;
			y.siguiente = x;
		}
		
				
	
	
			
		
	}
	
	
	public void verEmpresas() {
		Nodo x = puntero;
		while(x != null) {
			if(x.tipo == true) {
			System.out.println(x.item.toString());
			}
			x = x.siguiente;
		}
		
		
	}
	public void verPersonas() {
		Nodo x = puntero;
		while(x != null) {
			if(x.tipo == false) {
			System.out.println(x.item.toString());
			}
			x = x.siguiente;
		}
		
		
	}
	
	public void buscarPersona(String nombre) {
		Nodo y = puntero;
		int sw = 0;
		 while(y != null && sw == 0) {
			 if(((Persona)y.item).nombre == nombre) {
				 sw = 1;
			 }else {
				 y = y.siguiente;
			 }
		 }
		 if(sw == 1) {
			 System.out.println("\n Dato encontrado! \n");
			 System.out.println(((Persona)y.item).toString());
		 }else {
			 System.out.println("\n Dato no encontrado! \n");
		 }
	}

	
	
}
