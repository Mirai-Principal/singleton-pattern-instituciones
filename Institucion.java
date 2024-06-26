package mi_singleton.singleton_pj;

public class Institucion {
	private static Institucion instancia;
	private String nombre;
	
	private Institucion() {}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public static Institucion getInstance() {
		if (instancia == null)
			instancia = new Institucion();
		
		return instancia;
	}
}
