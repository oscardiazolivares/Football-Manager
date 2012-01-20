public class Juego {

	private Equipo local, visitante;
	private int[] resultado = new int[2];

	Juego(Equipo local, Equipo visitante) {
		this.local = local;
		this.visitante = visitante;
		resultado[0] = 0;
		resultado[1] = 0;
	}

	public void jugar() {
		int jugadasLocal = 0, jugadasVisitante = 0, cons = 15;
		int ataqueLocal, ataqueVisitante, defensaLocal, defensaVisitante, tecnicaLocal, tecnicaVisitante, porteroLocal, porteroVisitante;
		ataqueLocal = local.getAlineacion().calcularAtaque();
		defensaLocal = local.getAlineacion().calcularDefensa();
		tecnicaLocal = local.getAlineacion().calcularTecnica();
		porteroLocal = local.getAlineacion().calcularPortero();
		ataqueVisitante = visitante.getAlineacion().calcularAtaque();
		defensaVisitante = visitante.getAlineacion().calcularDefensa();
		tecnicaVisitante = visitante.getAlineacion().calcularTecnica();
		porteroVisitante = visitante.getAlineacion().calcularPortero();
		jugadasLocal = Math.round(tecnicaLocal/10);
		jugadasVisitante = Math.round(tecnicaVisitante/10);
		
		for(int i = 0; i<jugadasLocal; i++){
			if(ataqueLocal*Math.random()>defensaVisitante*Math.random()+cons)
				if(ataqueLocal*Math.random()>porteroVisitante*Math.random()+cons)
					resultado[0]++;
		}
		
		for(int i = 0; i<jugadasVisitante; i++){
			if(ataqueVisitante*Math.random()>defensaLocal*Math.random()+cons)
				if(ataqueVisitante*Math.random()>porteroLocal*Math.random()+cons)
					resultado[1]++;
		}
	}

}
