import java.util.ArrayList;
import java.util.List;



public class Convocados {
	int[] formacion = new int[3];
	Futbolista portero;
	Futbolista porteroReserva;
	List<Futbolista> defensas = new ArrayList<Futbolista>();
	List<Futbolista> centrocampistas = new ArrayList<Futbolista>();
	List<Futbolista> delanteros = new ArrayList<Futbolista>();
	Plantilla plantilla;
	
	public Convocados (String nombreEquipo) {
		if (nombreEquipo == "betis") {
			//Si el equipo es el betis, cargo los jugadores del betis en el arraylist
		}
		if (nombreEquipo == "at madrid")  {
			//Si el equipo es el atlético de madrid, cargo los jugadores del mismo en el arraylist
			listaFutbolistas.add(new Futbolista(1, "Asenjo", false, 0, 30, 82, 52, 75, false, 68, 84, "pt", false));
			listaFutbolistas.add(new Futbolista(2, "Courtoris", false, 0, 30, 78, 59, 90, false, 68, 84, "pt", false));
			
			
			defensas.add(new Futbolista(3, "JMiranda", false, 0, 54, 76, 67, 90, false, 74, 50, "df", false));
			defensas.add(new Futbolista(4, "ADominguez", false, 0, 58, 78, 70, 85, false, 72, 50, "df", false));
			defensas.add(new Futbolista(5, "Perea", false, 0, 59, 76, 67, 85, false, 78, 50, "df", false));
			defensas.add(new Futbolista(6, "Godin", false, 0, 57, 82, 71, 80, false, 74, 50, "df", false));
			defensas.add(new Futbolista(7, "Filipe", false, 0, 64, 76, 79, 85, false, 73, 50, "df", false));
			
			
			centrocampistas.add(new Futbolista(9, "Reyes", false, 0, 84, 48, 93, 80, false, 70, 50, "mc", false));
			centrocampistas.add(new Futbolista(10, "Gabi", false, 0, 78, 68, 80, 95, false, 78, 50, "mc", false));
			centrocampistas.add(new Futbolista(11, "Diego", false, 0, 84, 48, 93, 85, false, 70, 50, "mc", false));
			centrocampistas.add(new Futbolista(12, "Salvio", false, 0, 79, 42, 83, 95, false, 73, 50, "mc", false));
			centrocampistas.add(new Futbolista(14, "Tiago", false, 0, 74, 67, 83, 85, false, 72, 50, "mc", false));
			centrocampistas.add(new Futbolista(15, "MSuarez", false, 0, 68, 70, 77, 85, false, 75, 50, "mc", false));
			
			delanteros.add(new Futbolista(16, "Adrian", false, 0, 77, 35, 77, 90, false, 78, 50, "dl", false));
			delanteros.add(new Futbolista(17, "Pizzi", false, 0, 70, 42, 78, 80, false, 70, 50, "dl", false));
			delanteros.add(new Futbolista(18, "Falcao", false, 0, 88, 38, 82, 95, false, 77, 50, "dl", false));
		}
	}
	
	public int calcularAtaque() {
		double ataqueTotal=0;
		//Recorro la lista de delanteros desde el 0 hasta el tamaño de la lista
		int SumaAtDel = 0;
		for(int i=0;i<delanteros.size();i++) {
			//Sumo consecutivamente el ataque de cada delantero
			SumaAtDel = SumaAtDel + delanteros.get(i).ataque;
		}
		//Recorro la lista de centrocampistas desde el 0 hasta el tamaño de la lista
		int SumaAtCen = 0;
		for(int i=0;i<centrocampistas.size();i++) {
			//Sumo consecutivamente el ataque de cada centrocampista
			SumaAtCen = SumaAtCen + centrocampistas.get(i).ataque;
		}
		//Recorro la lista de defensas desde el 0 hasta el tamaño de la lista
		int SumaAtDef = 0;
		for(int i=0;i<defensas.size();i++) {
			//Sumo consecutivamente el ataque de cada defensa
			SumaAtDef = SumaAtDef + defensas.get(i).ataque;
		}
		//AtaqueTotal = [(SumaAtDel*0.5)+(SumaAtCen*0.3)+(SumaAtDef*0.2)]/10
		ataqueTotal= (SumaAtDel*0.5+SumaAtCen*0.3+SumaAtDef*0.2)/10;
		return (int)ataqueTotal;
	}
	
	public int calcularDefensa() {
		double defensaTotal=0;
		//Recorro la lista de delanteros desde el 0 hasta el tamaño de la lista
		int SumaDefDel = 0;
		for(int i=0;i<delanteros.size();i++) {
			//Sumo consecutivamente la defensa de cada delantero
			SumaDefDel = SumaDefDel + delanteros.get(i).defensa;
		}
		//Recorro la lista de centrocampistas desde el 0 hasta el tamaño de la lista
		int SumaDefCen = 0;
		for(int i=0;i<centrocampistas.size();i++) {
			//Sumo consecutivamente la defensa de cada centrocampista
			SumaDefCen = SumaDefCen + centrocampistas.get(i).defensa;
		}
		//Recorro la lista de defensas desde el 0 hasta el tamaño de la lista
		int SumaDefDef = 0;
		for(int i=0;i<defensas.size();i++) {
			//Sumo consecutivamente la defensa de cada defensa
			SumaDefDef = SumaDefDef + defensas.get(i).defensa;
		}

		//DefensaTotal = [(SumaDefDel*0.5)+(SumaDefCen*0.3)+(SumaDefDef*0.2)]/10
		defensaTotal= (SumaDefDel*0.5+SumaDefCen*0.3+SumaDefDef*0.2)/10;
		return (int)defensaTotal;
	}
	
	public int calcularTecnica() {
		double tecnicaTotal=0;
		//Recorro la lista de delanteros desde el 0 hasta el tamaño de la lista
		int SumaTecDel = 0;
		for(int i=0;i<delanteros.size();i++) {
			//Sumo consecutivamente la tecnica de cada delantero
			SumaTecDel = SumaTecDel + delanteros.get(i).tecnica;
		}
		//Recorro la lista de centrocampistas desde el 0 hasta el tamaño de la lista
		int SumaTecCen = 0;
		for(int i=0;i<centrocampistas.size();i++) {
			//Sumo consecutivamente la tecnica de cada centrocampista
			SumaTecCen = SumaTecCen + centrocampistas.get(i).tecnica;
		}
		//Recorro la lista de defensas desde el 0 hasta el tamaño de la lista
		int SumaTecDef = 0;
		for(int i=0;i<defensas.size();i++) {
			//Sumo consecutivamente la tecnica de cada defensa
			SumaTecDef = SumaTecDef + defensas.get(i).tecnica;
		}
		//TecnicaTotal = [(SumaTecDel*0.5)+(SumaTecCen*0.3)+(SumaTecDef*0.2)]/10
		tecnicaTotal= (SumaTecDel*0.5+SumaTecCen*0.3+SumaTecDef*0.2)/10;
		return (int)tecnicaTotal;
	}
	
	public int calcularPortero () {
		return portero.getHabilidadPortero();
	}

	private int[] getFormacion() {
		return formacion;
	}

	private void setFormacion(int[] formacion) {
		this.formacion = formacion;
	}

	private Futbolista getPortero() {
		return portero;
	}

	private void setPortero(Futbolista portero) {
		this.portero = portero;
	}

	private List<Futbolista> getDefensas() {
		return defensas;
	}

	private void setDefensas(List<Futbolista> defensas) {
		this.defensas = defensas;
	}

	private List<Futbolista> getCentrocampistas() {
		return centrocampistas;
	}

	private void setCentrocampistas(List<Futbolista> centrocampistas) {
		this.centrocampistas = centrocampistas;
	}

	private List<Futbolista> getDelanteros() {
		return delanteros;
	}

	private void setDelanteros(List<Futbolista> delanteros) {
		this.delanteros = delanteros;
	}

	private Plantilla getPlantilla() {
		return plantilla;
	}
	
}
