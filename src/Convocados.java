import java.util.ArrayList;
import java.util.List;


public class Convocados {
	int[] formacion = new int[3];
	Futbolista portero;
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
		}
	}
	
	public int calcularAtaque() {
		double ataqueTotal=0;
		//Recorro la lista de delanteros desde el 0 hasta el tamaño de la lista
		int atDel = 0;
		for(int i=0;i<delanteros.size();i++) {
			//Sumo consecutivamente el ataque de cada delantero
			atDel = atDel + delanteros.get(i).ataque;
			//Ahora se calcula la media de ataque de los delanteros
			atDel = atDel / delanteros.size();
		}
		//Recorro la lista de centrocampistas desde el 0 hasta el tamaño de la lista
		int atCen = 0;
		for(int i=0;i<centrocampistas.size();i++) {
			//Sumo consecutivamente el ataque de cada centrocampista
			atCen = atCen + centrocampistas.get(i).ataque;
			//Ahora se calcula la media de ataque de los centrocampistas
			atCen = atCen / centrocampistas.size();
		}
		//Recorro la lista de defensas desde el 0 hasta el tamaño de la lista
		int atDef = 0;
		for(int i=0;i<defensas.size();i++) {
			//Sumo consecutivamente el ataque de cada defensa
			atDef = atDef + defensas.get(i).ataque;
			//Ahora se calcula la media de ataque de los defensas
			atDef = atDef / defensas.size();
		}
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
			//Ahora se calcula la media de defensa de los delanteros
			defDel = defDel / delanteros.size();
		}
		//Recorro la lista de centrocampistas desde el 0 hasta el tamaño de la lista
		int defCen = 0;
		for(int i=0;i<centrocampistas.size();i++) {
			//Sumo consecutivamente la defensa de cada centrocampista
			defCen = defCen + centrocampistas.get(i).defensa;
			//Ahora se calcula la media de defensa de los centrocampistas
			defCen = defCen / centrocampistas.size();
		}
		//Recorro la lista de defensas desde el 0 hasta el tamaño de la lista
		int defDef = 0;
		for(int i=0;i<defensas.size();i++) {
			//Sumo consecutivamente la defensa de cada defensa
			defDef = defDef + defensas.get(i).defensa;
			//Ahora se calcula la media de defensa de los defensas
			defDef = defDef / defensas.size();
		}

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
			//Ahora se calcula la media de tecnica de los delanteros
			tecDel = tecDel / delanteros.size();
		}
		//Recorro la lista de centrocampistas desde el 0 hasta el tamaño de la lista
		int tecCen = 0;
		for(int i=0;i<centrocampistas.size();i++) {
			//Sumo consecutivamente la tecnica de cada centrocampista
			tecCen = tecCen + centrocampistas.get(i).tecnica;
			//Ahora se calcula la media de tecnica de los centrocampistas
			tecCen = tecCen / centrocampistas.size();
		}
		//Recorro la lista de defensas desde el 0 hasta el tamaño de la lista
		int tecDef = 0;
		for(int i=0;i<defensas.size();i++) {
			//Sumo consecutivamente la tecnica de cada defensa
			tecDef = tecDef + defensas.get(i).tecnica;
			//Ahora se calcula la media de tecnica de los defensas
			tecDef = tecDef / defensas.size();
		}
		//TecnicaTotal = [(SumaTecDel*0.5)+(SumaTecCen*0.3)+(SumaTecDef*0.2)]/10
		tecnicaTotal= (tecDel*0.3+tecCen*0.5+tecDef*0.2)/10;
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
