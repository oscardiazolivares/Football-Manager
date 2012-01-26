public class Manager {

	Equipo equipo;
	Boolean humano;

	public Manager(String equipo, Boolean humano) {
		setHumano(humano);
		this.equipo = new Equipo(equipo);
	}

	public Boolean getHumano() {
		return humano;
	}

	public void setHumano(Boolean humano) {
		this.humano = humano;
	}
	
	public Equipo getEquipo(){
		return equipo;
	}

}
