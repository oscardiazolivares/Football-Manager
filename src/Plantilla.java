import java.util.ArrayList;
import java.util.List;


public class Plantilla {
	List<Futbolista> listaFutbolistas = new ArrayList<Futbolista>();
	
	public Plantilla (String nombreEquipo) {
		if (nombreEquipo == "betis") {
			//Si el equipo es el betis, cargo los jugadores del betis en el arraylist
			/* 1, NOMBRE, FALSE, 0, ATAQUE, DEFENSA, TECNICA, RESLESIONES, false, AGRESIVIDAD, HP, FALSE) */
			listaFutbolistas.add(new Futbolista(1, "Asenjo", false, 0, 30, 82, 52, 75, false, 68, 84, "pt", false));
			listaFutbolistas.add(new Futbolista(2, "Courtoris", false, 0, 30, 78, 59, 90, false, 68, 84, "pt", false));
			
			listaFutbolistas.add(new Futbolista(3, "JMiranda", false, 0, 54, 76, 67, 90, false, 74, 50, "df", false));
			listaFutbolistas.add(new Futbolista(4, "ADominguez", false, 0, 58, 78, 70, 85, false, 72, 50, "df", false));
			listaFutbolistas.add(new Futbolista(5, "Perea", false, 0, 59, 76, 67, 85, false, 78, 50, "df", false));
			listaFutbolistas.add(new Futbolista(6, "Godin", false, 0, 57, 82, 71, 80, false, 74, 50, "df", false));
			listaFutbolistas.add(new Futbolista(7, "Filipe", false, 0, 64, 76, 79, 85, false, 73, 50, "df", false));
			listaFutbolistas.add(new Futbolista(8, "Pulido", false, 0, 53, 69, 70, 90, false, 68, 50, "df", false));
			
			listaFutbolistas.add(new Futbolista(9, "Reyes", false, 0, 84, 48, 93, 80, false, 70, 50, "mc", false));
			listaFutbolistas.add(new Futbolista(10, "Gabi", false, 0, 78, 68, 80, 95, false, 78, 50, "mc", false));
			listaFutbolistas.add(new Futbolista(11, "Diego", false, 0, 84, 48, 93, 85, false, 70, 50, "mc", false));
			listaFutbolistas.add(new Futbolista(12, "Salvio", false, 0, 79, 42, 83, 95, false, 73, 50, "mc", false));
			listaFutbolistas.add(new Futbolista(13, "Koke", false, 0, 67, 61, 80, 95, false, 71, 50, "mc", false));
			listaFutbolistas.add(new Futbolista(14, "Tiago", false, 0, 74, 67, 83, 85, false, 72, 50, "mc", false));
			listaFutbolistas.add(new Futbolista(15, "MSuarez", false, 0, 68, 70, 77, 85, false, 75, 50, "mc", false));
			
			listaFutbolistas.add(new Futbolista(16, "Adrian", false, 0, 77, 35, 77, 90, false, 78, 50, "dl", false));
			listaFutbolistas.add(new Futbolista(17, "Pizzi", false, 0, 70, 42, 78, 80, false, 70, 50, "dl", false));
			listaFutbolistas.add(new Futbolista(18, "Falcao", false, 0, 88, 38, 82, 95, false, 77, 50, "dl", false));
			
		}
		if (nombreEquipo == "at madrid") {
			//Si el equipo es el at de madrid, cargo los jugadores del atletico en el arraylist
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
