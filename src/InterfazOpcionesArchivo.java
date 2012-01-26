import javax.swing.*;

public class InterfazOpcionesArchivo {
	JFrame frameArchivo;
	Reproductor rep;
	
	JFileChooser jfc;
	
	InterfazOpcionesArchivo(){
		frameArchivo = new JFrame("Seleccionar canción");
		frameArchivo.setSize(1024, 768);
		
		jfc = new JFileChooser();
		int op = jfc.showOpenDialog(frameArchivo);
		
		if (op == JFileChooser.APPROVE_OPTION)
			System.out.println(jfc.getSelectedFile());
		
		String ruta = jfc.getSelectedFile().getPath();
		
		rep = new Reproductor(ruta);
		
		//frameArchivo.setVisible(true);
		//frameArchivo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
