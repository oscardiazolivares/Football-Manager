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
