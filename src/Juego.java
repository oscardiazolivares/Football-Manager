public class Juego {

	private Equipo local, visitante;
	private int[] resultado = new int[2];

	Juego(Equipo local, Equipo visitante) {
		this.local = local;
		this.visitante = visitante;
	}

	public void jugar() {
		int jugadasLocal = 0, jugadasVisitante = 0;
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
		
	}

}
