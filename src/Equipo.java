
public class Equipo {

	private String nombre;
	private Convocados alineacion;
	
	Equipo(String nombre){
		this.nombre = nombre;
		/* Ahora deberia buscar en la base de datos a los jugadores del equipo,
		 * crear los convocados con todos los jugadores y meterlos en la propiedad
		 */
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
