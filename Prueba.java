package directorioTelefonico;

public class Prueba {
	
	public void test01() {
		System.out.println("Creando directorio...");
		Directorio directorio1 = new Directorio();
		Persona p1 = new Persona("Johan","8664281","Cra 31");
		Persona p2 = new Persona("David","1423654", "Cra 56");
		Persona p3 = new Persona("Estefania");
		Empresa e1 = new Empresa();
		Empresa e2 = new Empresa();
		Empresa e3 = new Empresa("201548","Prointex","4219875","Cra 25 41-13","Lavanderia");
		// "false" si es una persona y "true" si es una empresa.
		directorio1.insertar(p1, false);
		directorio1.insertar(e1, true);
		directorio1.insertar(e2, true);
		directorio1.insertar(e3, true);
		directorio1.insertar(p2, false);
		directorio1.insertar(p3, false);
		System.out.println("Empresas.......\n");
		
		directorio1.verEmpresas();
		
		System.out.println("\nPersonas.......\n");
		
		directorio1.verPersonas();
		
		directorio1.buscarPersona("Johan");
	}
	
	public void test02() {
		System.out.println("Creando directorio...");
		Directorio directorio1 = new Directorio();
		Persona p1 = new Persona("Johan","8664281","Cra 31");
		Persona p2 = new Persona("David","1423654", "Cra 56");
		Persona p3 = new Persona("Estefania");
		Empresa e1 = new Empresa();
		Empresa e2 = new Empresa();
		Empresa e3 = new Empresa("201548","Prointex","4219875","Cra 25 41-13","Lavanderia");
		// "false" si es una persona y "true" si es una empresa.
		directorio1.insertar(p1, false);
		directorio1.insertar(e1, true);
		directorio1.insertar(e2, true);
		directorio1.insertar(e3, true);
		directorio1.insertar(p2, false);
		directorio1.insertar(p3, false);
		System.out.println("Empresas y personas.....\n");
		
		directorio1.verEmpresas();
		
		directorio1.verPersonas();
		
	}

}
