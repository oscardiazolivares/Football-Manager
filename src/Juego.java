public class Juego {

	private Equipo local, visitante;
	private int[] resultado = new int[2];

	Juego(Equipo local, Equipo visitante) {
		this.local = local;
		this.visitante = visitante;
		resultado[0] = 0;
		resultado[1] = 0;
	}

	public int[] jugar() {
		int jugadasLocal = 0, jugadasVisitante = 0, cons = 5;
		int ataqueLocal, ataqueVisitante, defensaLocal, defensaVisitante, tecnicaLocal, tecnicaVisitante, porteroLocal, porteroVisitante;
		ataqueLocal = local.getAlineacion().calcularAtaque();
		defensaLocal = local.getAlineacion().calcularDefensa();
		tecnicaLocal = local.getAlineacion().calcularTecnica();
		porteroLocal = local.getAlineacion().calcularPortero();
		ataqueVisitante = visitante.getAlineacion().calcularAtaque();
		defensaVisitante = visitante.getAlineacion().calcularDefensa();
		tecnicaVisitante = visitante.getAlineacion().calcularTecnica();
		porteroVisitante = visitante.getAlineacion().calcularPortero();
		jugadasLocal = Math.round(tecnicaLocal / 14);
		jugadasVisitante = Math.round(tecnicaVisitante / 14);

		for (int i = 0; i < jugadasLocal; i++) {
			if (ataqueLocal * Math.random() > defensaVisitante * Math.random()
					+ cons)
				if (ataqueLocal * Math.random() > porteroVisitante
						* Math.random() + cons)
					resultado[0]++;
		}

		Futbolista jugador2 = local.getAlineacion().portero;
		double lesion = (1 - jugador2.getResistenciaLesiones()) / 100
				+ Math.random();
		lesion += (1 - jugador2.getResistenciaLesiones()) / 100 + Math.random();
		if (lesion >= 2.0) {
			jugador2.setLesion(true);
			System.out.println(jugador2.getNombre() + " lesionado!!!");
		}

		double tarjeta = jugador2.getAgresividad() / 100 + Math.random();
		tarjeta += jugador2.getAgresividad() / 100 + Math.random();
		if (tarjeta >= 3.5) {
			jugador2.setSancion(true);
			System.out.println("!!!Roja directa " + jugador2.getNombre()
					+ " expulsado!!!");
		} else if (tarjeta >= 3.0) {
			jugador2.setTarjetas(jugador2.getTarjetas() + 1);
			System.out.println("Amarilla para " + jugador2.getNombre());
			if(jugador2.getTarjetas()>=2){
				jugador2.setSancion(true);
				System.out.println("Doble amarilla"+ jugador2.getNombre()+" expulsado!!");
			}
		}

		for (Futbolista jugador : local.getAlineacion().defensas) {
			lesion = (1 - jugador.getResistenciaLesiones()) / 100
					+ Math.random();
			lesion += (1 - jugador.getResistenciaLesiones()) / 100
					+ Math.random();
			if (lesion >= 2.0) {
				jugador.setLesion(true);
				System.out.println(jugador.getNombre() + " lesionado!!!");
			}

			tarjeta = jugador.getAgresividad() / 100 + Math.random();
			tarjeta += jugador.getAgresividad() / 100 + Math.random();
			if (tarjeta >= 3.5) {
				jugador.setSancion(true);
				System.out.println("!!!Roja directa " + jugador.getNombre()
						+ " expulsado!!!");
			} else if (tarjeta >= 3.0) {
				jugador.setTarjetas(jugador.getTarjetas() + 1);
				System.out.println("Amarilla para " + jugador.getNombre());
				if(jugador.getTarjetas()>=2){
					jugador.setSancion(true);
					System.out.println("Doble amarilla"+ jugador.getNombre()+" expulsado!!");
				}
			}
		}

		for (Futbolista jugador : local.getAlineacion().centrocampistas) {
			lesion = (1 - jugador.getResistenciaLesiones()) / 100
					+ Math.random();
			lesion += (1 - jugador.getResistenciaLesiones()) / 100
					+ Math.random();
			if (lesion >= 2.0) {
				jugador.setLesion(true);
				System.out.println(jugador.getNombre() + " lesionado!!!");
			}

			tarjeta = jugador.getAgresividad() / 100 + Math.random();
			tarjeta += jugador.getAgresividad() / 100 + Math.random();
			if (tarjeta >= 3.5) {
				jugador.setSancion(true);
				System.out.println("!!!Roja directa " + jugador.getNombre()
						+ " expulsado!!!");
			} else if (tarjeta >= 3.0) {
				jugador.setTarjetas(jugador.getTarjetas() + 1);
				System.out.println("Amarilla para " + jugador.getNombre());
				if(jugador.getTarjetas()>=2){
					jugador.setSancion(true);
					System.out.println("Doble amarilla"+ jugador.getNombre()+" expulsado!!");
				}
			}
		}

		for (Futbolista jugador : local.getAlineacion().delanteros) {
			lesion = (1 - jugador.getResistenciaLesiones()) / 100
					+ Math.random();
			lesion += (1 - jugador.getResistenciaLesiones()) / 100
					+ Math.random();
			if (lesion >= 2.0) {
				jugador.setLesion(true);
				System.out.println(jugador.getNombre() + " lesionado!!!");
			}

			tarjeta = jugador.getAgresividad() / 100 + Math.random();
			tarjeta += jugador.getAgresividad() / 100 + Math.random();
			if (tarjeta >= 3.5) {
				jugador.setSancion(true);
				System.out.println("!!!Roja directa " + jugador.getNombre()
						+ " expulsado!!!");
			} else if (tarjeta >= 3.0) {
				jugador.setTarjetas(jugador.getTarjetas() + 1);
				System.out.println("Amarilla para " + jugador.getNombre());
				if (jugador.getTarjetas() >= 2) {
					jugador.setSancion(true);
					System.out.println("Doble amarilla" + jugador.getNombre()
							+ " expulsado!!");
				}
			}
		}

		for (int i = 0; i < jugadasVisitante; i++) {
			if (ataqueVisitante * Math.random() > defensaLocal * Math.random()
					+ cons)
				if (ataqueVisitante * Math.random() > porteroLocal
						* Math.random() + cons)
					resultado[1]++;
		}
		jugador2 = visitante.getAlineacion().portero;
		lesion = (1 - jugador2.getResistenciaLesiones()) / 100 + Math.random();
		lesion += (1 - jugador2.getResistenciaLesiones()) / 100 + Math.random();
		if (lesion >= 2.0) {
			jugador2.setLesion(true);
			System.out.println(jugador2.getNombre() + " lesionado!!!");
		}

		tarjeta = jugador2.getAgresividad() / 100 + Math.random();
		tarjeta += jugador2.getAgresividad() / 100 + Math.random();
		if (tarjeta >= 3.5) {
			jugador2.setSancion(true);
			System.out.println("!!!Roja directa " + jugador2.getNombre()
					+ " expulsado!!!");
		} else if (tarjeta >= 3.0) {
			jugador2.setTarjetas(jugador2.getTarjetas() + 1);
			System.out.println("Amarilla para " + jugador2.getNombre());
			if (jugador2.getTarjetas() >= 2) {
				jugador2.setSancion(true);
				System.out.println("Doble amarilla" + jugador2.getNombre()
						+ " expulsado!!");
			}
		}

		for (Futbolista jugador : visitante.getAlineacion().defensas) {
			lesion = (1 - jugador.getResistenciaLesiones()) / 100
					+ Math.random();
			lesion += (1 - jugador.getResistenciaLesiones()) / 100
					+ Math.random();
			if (lesion >= 2.0) {
				jugador.setLesion(true);
				System.out.println(jugador.getNombre() + " lesionado!!!");
			}

			tarjeta = jugador.getAgresividad() / 100 + Math.random();
			tarjeta += jugador.getAgresividad() / 100 + Math.random();
			if (tarjeta >= 3.5) {
				jugador.setSancion(true);
				System.out.println("!!!Roja directa " + jugador.getNombre()
						+ " expulsado!!!");
			} else if (tarjeta >= 3.0) {
				jugador.setTarjetas(jugador.getTarjetas() + 1);
				System.out.println("Amarilla para " + jugador.getNombre());
				if (jugador.getTarjetas() >= 2) {
					jugador.setSancion(true);
					System.out.println("Doble amarilla" + jugador.getNombre()
							+ " expulsado!!");
				}
			}
		}

		for (Futbolista jugador : visitante.getAlineacion().centrocampistas) {
			lesion = (1 - jugador.getResistenciaLesiones()) / 100
					+ Math.random();
			lesion += (1 - jugador.getResistenciaLesiones()) / 100
					+ Math.random();
			if (lesion >= 2.0) {
				jugador.setLesion(true);
				System.out.println(jugador.getNombre() + " lesionado!!!");
			}

			tarjeta = jugador.getAgresividad() / 100 + Math.random();
			tarjeta += jugador.getAgresividad() / 100 + Math.random();
			if (tarjeta >= 3.5) {
				jugador.setSancion(true);
				System.out.println("!!!Roja directa " + jugador.getNombre()
						+ " expulsado!!!");
			} else if (tarjeta >= 3.0) {
				jugador.setTarjetas(jugador.getTarjetas() + 1);
				System.out.println("Amarilla para " + jugador.getNombre());
				if (jugador.getTarjetas() >= 2) {
					jugador.setSancion(true);
					System.out.println("Doble amarilla" + jugador.getNombre()
							+ " expulsado!!");
				}
			}
		}

		for (Futbolista jugador : visitante.getAlineacion().delanteros) {
			lesion = (1 - jugador.getResistenciaLesiones()) / 100
					+ Math.random();
			lesion += (1 - jugador.getResistenciaLesiones()) / 100
					+ Math.random();
			if (lesion >= 2.0) {
				jugador.setLesion(true);
				System.out.println(jugador.getNombre() + " lesionado!!!");
			}

			tarjeta = jugador.getAgresividad() / 100 + Math.random();
			tarjeta += jugador.getAgresividad() / 100 + Math.random();
			if (tarjeta >= 3.5) {
				jugador.setSancion(true);
				System.out.println("!!!Roja directa " + jugador.getNombre()
						+ " expulsado!!!");
			} else if (tarjeta >= 3.0) {
				jugador.setTarjetas(jugador.getTarjetas() + 1);
				System.out.println("Amarilla para " + jugador.getNombre());
				if (jugador.getTarjetas() >= 2) {
					jugador.setSancion(true);
					System.out.println("Doble amarilla" + jugador.getNombre()
							+ " expulsado!!");
				}
			}
		}
		System.out.println("Resultado: "+resultado[0]+"-"+resultado[1]);
		return resultado;
	}

}
