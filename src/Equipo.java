
public class Equipo {

	private String nombre;
	private Convocados alineacion;
	
	Equipo(String nombre){
		this.nombre = nombre;
		alineacion = new Convocados(nombre);		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Convocados getAlineacion() {
		return alineacion;
	}

	public void setAlineacion(Convocados alineacion) {
		this.alineacion = alineacion;
	}
	
	
}
