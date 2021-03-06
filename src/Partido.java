
public class Partido {

	private Manager[] managers = new Manager[2];
	
	Partido(Manager[] managers){
		this.managers = managers;
	}
	
	public Manager getManager(int posicion){
		return managers[posicion];
	}
	
	public int[] jugarPartido(){
		Juego partido = new Juego(getManager(0).getEquipo(),getManager(1).getEquipo());
		return(partido.jugar());
	}
	
}
