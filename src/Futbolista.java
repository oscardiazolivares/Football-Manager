
public class Futbolista {
	int id;
	String nombre;
	boolean lesion;
	int tarjetas;
	int ataque;
	int defensa;
	int tecnica;
	int resistenciaLesiones;
	boolean sancion;
	int agresividad;
	int habilidadPortero;
	String posicion;
	boolean expulsion;
	
	public Futbolista(int id, String nombre, boolean lesion, int tarjetas,
			int ataque, int defensa, int tecnica, int resistenciaLesiones,
			boolean sancion, int agresividad, int habilidadPortero,
			String posicion, boolean expulsion) {
		this.id = id;
		this.nombre = nombre;
		this.lesion = lesion;
		this.tarjetas = tarjetas;
		this.ataque = ataque;
		this.defensa = defensa;
		this.tecnica = tecnica;
		this.resistenciaLesiones = resistenciaLesiones;
		this.sancion = sancion;
		this.agresividad = agresividad;
		this.habilidadPortero = habilidadPortero;
		this.posicion = posicion;
		this.expulsion = expulsion;
	}

	public int getId() {
		return id;
	}

	private void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isLesion() {
		return lesion;
	}

	public void setLesion(boolean lesion) {
		this.lesion = lesion;
	}

	public int getTarjetas() {
		return tarjetas;
	}

	public void setTarjetas(int tarjetas) {
		this.tarjetas = tarjetas;
	}

	public int getAtaque() {
		return ataque;
	}

	private void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getDefensa() {
		return defensa;
	}

	private void setDefensa(int defensa) {
		this.defensa = defensa;
	}

	public int getTecnica() {
		return tecnica;
	}

	private void setTecnica(int tecnica) {
		this.tecnica = tecnica;
	}

	public int getResistenciaLesiones() {
		return resistenciaLesiones;
	}

	private void setResistenciaLesiones(int resistenciaLesiones) {
		this.resistenciaLesiones = resistenciaLesiones;
	}

	public boolean isSancion() {
		return sancion;
	}

	public void setSancion(boolean sancion) {
		this.sancion = sancion;
	}

	public int getAgresividad() {
		return agresividad;
	}

	private void setAgresividad(int agresividad) {
		this.agresividad = agresividad;
	}

	public int getHabilidadPortero() {
		return habilidadPortero;
	}

	private void setHabilidadPortero(int habilidadPortero) {
		this.habilidadPortero = habilidadPortero;
	}

	public String getPosicion() {
		return posicion;
	}

	private void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public boolean isExpulsion() {
		return expulsion;
	}

	private void setExpulsion(boolean expulsion) {
		this.expulsion = expulsion;
	}
	
	


}
