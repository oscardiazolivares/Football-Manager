import java.util.ArrayList;
import java.util.List;


public class Plantilla {
	List<Futbolista> listaFutbolistas = new ArrayList<Futbolista>();
	
	public Plantilla (String nombreEquipo) {
		if (nombreEquipo == "betis") {
			//Si el equipo es el betis, cargo los jugadores del betis en el arraylist
		}
		
	}

	private List<Futbolista> getListaFutbolistas() {
		return listaFutbolistas;
	}
	
	private Futbolista getListaFutbolistas(int posicion) {
		//Método "get" para devolver el jugador que ocupe cierta posicion en la lista
		List<Futbolista> futbolistasAux = new ArrayList<Futbolista>();
		return futbolistasAux.get(posicion);
	}
}
