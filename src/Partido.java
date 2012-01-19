
public class Partido {

	private Manager[] managers = new Manager[2];
	
	Partido(Manager[] managers){
		this.managers = managers;
	}
	
	public Managers getManager(int posicion){
		return managers[posicion];
	}
	
	public void jugarPartido(){
		Juego partido = new Juego();
		partido.jugar();
	}
	
}
