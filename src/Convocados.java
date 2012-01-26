import java.util.ArrayList;
import java.util.List;



public class Convocados {
	int[] formacion = new int[3];
	Futbolista portero;
	List<Futbolista> defensas = new ArrayList<Futbolista>();
	List<Futbolista> centrocampistas = new ArrayList<Futbolista>();
	List<Futbolista> delanteros = new ArrayList<Futbolista>();
	List<Futbolista> banquillo = new ArrayList<Futbolista>();
	Plantilla plantilla;
	
	public Convocados (String nombreEquipo) {
		if (nombreEquipo == "betis") {
			//Si el equipo es el betis, cargo los jugadores del betis en el arraylist
			banquillo.add(new Futbolista(19, "Goitia", false, 0, 30, 79, 45, 85, false, 73, 79, "pt", false));
			 portero = new Futbolista(19, "Casto", false, 0, 30, 78, 53, 80, false, 71, 77, "pt", false);
			
			defensas.add(new Futbolista(19, "Dorado", false, 0, 55, 75, 68, 75, false, 73, 50, "df", false));
			defensas.add(new Futbolista(19, "Ustariz", false, 0, 54, 77, 69, 90, false, 72, 50, "df", false));
			defensas.add(new Futbolista(19, "A.Amaya", false, 0, 55, 75, 68, 80, false, 70, 50, "df", false));
			defensas.add(new Futbolista(19, "Mario", false, 0, 55, 75, 67, 85, false, 75, 50, "df", false));
			banquillo.add(new Futbolista(19, "Tosic", false, 0, 71, 72, 75, 80, false, 67, 50, "df", false));
			banquillo.add(new Futbolista(19, "Chica", false, 0, 67, 68, 71, 75, false, 74, 50, "df", false));
			
			banquillo.add(new Futbolista(19, "J.Cañas", false, 0, 62, 61, 72, 80, false, 67, 50, "mc", false));
			banquillo.add(new Futbolista(19, "S.Sevilla", false, 0, 68, 55, 78, 85, false, 72, 50, "mc", false));
			centrocampistas.add(new Futbolista(19, "Beñat", false, 0, 66, 60, 79, 90, false, 73, 50, "mc", false));
			banquillo.add(new Futbolista(19, "J.Cañas", false, 0, 62, 61, 72, 80, false, 67, 50, "mc", false));
			centrocampistas.add(new Futbolista(19, "Iriney", false, 0, 67, 70, 77, 75, false, 71, 50, "mc", false));
			centrocampistas.add(new Futbolista(19, "Matilla", false, 0, 70, 56, 80, 85, false, 66, 50, "mc", false));
			banquillo.add(new Futbolista(19, "Juanma", false, 0, 73, 43, 77, 90, false, 70, 50, "mc", false));
			banquillo.add(new Futbolista(19, "Momo", false, 0, 75, 45, 77, 80, false, 70, 50, "mc", false));
			
			delanteros.add(new Futbolista(19, "Santacruz", false, 0, 82, 46, 82, 85, false, 66, 50, "dl", false));
			delanteros.add(new Futbolista(19, "J.Molina", false, 0, 77, 34, 77, 95, false, 70, 50, "dl", false));
			delanteros.add(new Futbolista(19, "Ruben Castro", false, 0, 80, 35, 80, 90, false, 68, 50, "dl", false));
			banquillo.add(new Futbolista(19, "J.Pereira", false, 0, 75, 32, 77, 80, false, 67, 50, "dl", false));
		}
		if (nombreEquipo == "at madrid")  {
			//Si el equipo es el atlético de madrid, cargo los jugadores del mismo en el arraylist
			banquillo.add(new Futbolista(1, "Asenjo", false, 0, 30, 82, 52, 75, false, 68, 84, "pt", false));
			portero = new Futbolista(2, "Courtoris", false, 0, 30, 78, 59, 90, false, 68, 84, "pt", false);
			
			
			banquillo.add(new Futbolista(3, "JMiranda", false, 0, 54, 76, 67, 90, false, 74, 50, "df", false));
			defensas.add(new Futbolista(4, "ADominguez", false, 0, 58, 78, 70, 85, false, 72, 50, "df", false));
			defensas.add(new Futbolista(5, "Perea", false, 0, 59, 76, 67, 85, false, 78, 50, "df", false));
			defensas.add(new Futbolista(6, "Godin", false, 0, 57, 82, 71, 80, false, 74, 50, "df", false));
			defensas.add(new Futbolista(7, "Filipe", false, 0, 64, 76, 79, 85, false, 73, 50, "df", false));
			
			
			banquillo.add(new Futbolista(9, "Reyes", false, 0, 84, 48, 93, 80, false, 70, 50, "mc", false));
			centrocampistas.add(new Futbolista(10, "Gabi", false, 0, 78, 68, 80, 95, false, 78, 50, "mc", false));
			centrocampistas.add(new Futbolista(11, "Diego", false, 0, 84, 48, 93, 85, false, 70, 50, "mc", false));
			centrocampistas.add(new Futbolista(12, "Salvio", false, 0, 79, 42, 83, 95, false, 73, 50, "mc", false));
			centrocampistas.add(new Futbolista(14, "Tiago", false, 0, 74, 67, 83, 85, false, 72, 50, "mc", false));
			banquillo.add(new Futbolista(15, "MSuarez", false, 0, 68, 70, 77, 85, false, 75, 50, "mc", false));
			
			delanteros.add(new Futbolista(16, "Adrian", false, 0, 77, 35, 77, 90, false, 78, 50, "dl", false));
			banquillo.add(new Futbolista(17, "Pizzi", false, 0, 70, 42, 78, 80, false, 70, 50, "dl", false));
			delanteros.add(new Futbolista(18, "Falcao", false, 0, 88, 38, 82, 95, false, 77, 50, "dl", false));
		}
	}
	
	public int calcularAtaque() {
		double ataqueTotal=0;
		//Recorro la lista de delanteros desde el 0 hasta el tamaño de la lista
		int atDel = 0;
		for(int i=0;i<delanteros.size();i++) {
			//Sumo consecutivamente el ataque de cada delantero
			atDel = atDel + delanteros.get(i).ataque;
		}
		//Ahora se calcula la media de ataque de los delanteros
		atDel = atDel / delanteros.size();
		//Recorro la lista de centrocampistas desde el 0 hasta el tamaño de la lista
		int atCen = 0;
		for(int i=0;i<centrocampistas.size();i++) {
			//Sumo consecutivamente el ataque de cada centrocampista
			atCen = atCen + centrocampistas.get(i).ataque;
		}
		//Ahora se calcula la media de ataque de los centrocampistas
		atCen = atCen / centrocampistas.size();
		//Recorro la lista de defensas desde el 0 hasta el tamaño de la lista
		int atDef = 0;
		for(int i=0;i<defensas.size();i++) {
			//Sumo consecutivamente el ataque de cada defensa
			atDef = atDef + defensas.get(i).ataque;
		}
		//Ahora se calcula la media de ataque de los defensas		
		atDef = atDef / defensas.size();
		//AtaqueTotal = [(SumaAtDel*0.5)+(SumaAtCen*0.3)+(SumaAtDef*0.2)]/10
		ataqueTotal= atDel*0.5+atCen*0.3+atDef*0.2;
		return (int)ataqueTotal;
	}
	
	public int calcularDefensa() {
		double defensaTotal=0;
		//Recorro la lista de delanteros desde el 0 hasta el tamaño de la lista
		int defDel = 0;
		for(int i=0;i<delanteros.size();i++) {
			//Sumo consecutivamente la defensa de cada delantero
			defDel = defDel + delanteros.get(i).defensa;
		}
		//Ahora se calcula la media de defensa de los delanteros
		defDel = defDel / delanteros.size();
		//Recorro la lista de centrocampistas desde el 0 hasta el tamaño de la lista
		int defCen = 0;
		for(int i=0;i<centrocampistas.size();i++) {
			//Sumo consecutivamente la defensa de cada centrocampista
			defCen = defCen + centrocampistas.get(i).defensa;			
		}
		//Ahora se calcula la media de defensa de los centrocampistas
		defCen = defCen / centrocampistas.size();
		//Recorro la lista de defensas desde el 0 hasta el tamaño de la lista
		int defDef = 0;
		for(int i=0;i<defensas.size();i++) {
			//Sumo consecutivamente la defensa de cada defensa
			defDef = defDef + defensas.get(i).defensa;			
		}
		//Ahora se calcula la media de defensa de los defensas
		defDef = defDef / defensas.size();

		//DefensaTotal = [(SumaDefDel*0.5)+(SumaDefCen*0.3)+(SumaDefDef*0.2)]/10
		defensaTotal= defDel*0.2+defCen*0.3+defDef*0.5;
		return (int)defensaTotal;
	}
	
	public int calcularTecnica() {
		double tecnicaTotal=0;
		//Recorro la lista de delanteros desde el 0 hasta el tamaño de la lista
		int tecDel = 0;
		for(int i=0;i<delanteros.size();i++) {
			//Sumo consecutivamente la tecnica de cada delantero
			tecDel = tecDel + delanteros.get(i).tecnica;			
		}
		//Ahora se calcula la media de tecnica de los delanteros
		tecDel = tecDel / delanteros.size();
		//Recorro la lista de centrocampistas desde el 0 hasta el tamaño de la lista
		int tecCen = 0;
		for(int i=0;i<centrocampistas.size();i++) {
			//Sumo consecutivamente la tecnica de cada centrocampista
			tecCen = tecCen + centrocampistas.get(i).tecnica;			
		}
		//Ahora se calcula la media de tecnica de los centrocampistas
		tecCen = tecCen / centrocampistas.size();
		//Recorro la lista de defensas desde el 0 hasta el tamaño de la lista
		int tecDef = 0;
		for(int i=0;i<defensas.size();i++) {
			//Sumo consecutivamente la tecnica de cada defensa
			tecDef = tecDef + defensas.get(i).tecnica;			
		}
		//Ahora se calcula la media de tecnica de los defensas
		tecDef = tecDef / defensas.size();
		//TecnicaTotal = [(SumaTecDel*0.5)+(SumaTecCen*0.3)+(SumaTecDef*0.2)]/10
		tecnicaTotal= tecDel*0.3+tecCen*0.5+tecDef*0.2;
		return (int)tecnicaTotal;
	}
	
	public int calcularPortero () {
		return portero.getHabilidadPortero();
	}

	public int[] getFormacion() {
		return formacion;
	}

	public void setFormacion(int[] formacion) {
		this.formacion = formacion;
	}

	public Futbolista getPortero() {
		return portero;
	}

	public void setPortero(Futbolista portero) {
		this.portero = portero;
	}

	public List<Futbolista> getDefensas() {
		return defensas;
	}

	public void setDefensas(List<Futbolista> defensas) {
		this.defensas = defensas;
	}

	public List<Futbolista> getCentrocampistas() {
		return centrocampistas;
	}

	public void setCentrocampistas(List<Futbolista> centrocampistas) {
		this.centrocampistas = centrocampistas;
	}

	public List<Futbolista> getDelanteros() {
		return delanteros;
	}

	public void setDelanteros(List<Futbolista> delanteros) {
		this.delanteros = delanteros;
	}

	public Plantilla getPlantilla() {
		return plantilla;
	}
	
}
