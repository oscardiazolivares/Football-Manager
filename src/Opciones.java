public class Opciones {

	String idioma;
	Sonido sonido;

	public Opciones() {
	}

	public Opciones(String idioma, Sonido sonido) {
		setIdioma(idioma);
		setSonido(sonido);
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public Sonido getSonido() {
		return sonido;
	}

	public void setSonido(Sonido sonido) {
		this.sonido = sonido;
	}

}
