public class Usuario {

	Opciones opciones;

	public Usuario(Opciones opciones) {
		setOpciones(opciones);
	}

	public Opciones getOpciones() {
		return opciones;
	}

	public void setOpciones(Opciones opciones) {
		this.opciones = opciones;
	}

	// FUNCIONES DE LA CLASE USUARIO
	
	/*void definirOpciones() {
		
	} No se sabe por el momento si se incluir� */

	void salir() {
		System.exit(0);
	}

	public void crearAmistoso(boolean humano) {
		Manager[] mana = new Manager[2];
		mana[0]= new Manager("betis", Boolean.TRUE);
		mana[1]= new Manager("at madrid",  Boolean.TRUE);
	}

	
	
}
