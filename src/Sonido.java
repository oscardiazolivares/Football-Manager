public class Sonido {

	String cancion;

	public Sonido() {
	}

	public Sonido(int volumen, String cancion) {

		setCancion(cancion);
	}

	public String getCancion() {
		return cancion;
	}

	public void setCancion(String cancion) {
		this.cancion = cancion;
	}

}
