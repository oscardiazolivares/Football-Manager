import java.awt.*;
import javax.swing.*;

public class InterfazOpciones {
	JFrame frameOpciones;
	JPanel panel1,
		   panel2,
		   panel3,
		   panel4;
	JLabel lbIdioma,
		   lbCancion,
		   lbVolumen;
	JComboBox comboIdioma;
	JTextField txtCancion;
	JSlider sldVolumen;
	JButton btAceptar,
			btCancelar;
	
	InterfazOpciones(){
		frameOpciones = new JFrame();
		frameOpciones.setSize(1024, 768);
		
		panel1 = new JPanel();
		panel1.setLayout(new FlowLayout());
		
		panel2 = new JPanel();
		panel2.setLayout(new FlowLayout());
		
		panel3 = new JPanel();
		panel3.setLayout(new FlowLayout());
		
		panel4 = new JPanel();
		panel4.setLayout(new FlowLayout());
		
		lbIdioma = new JLabel("Idioma");
		lbCancion = new JLabel("Cancion");
		lbVolumen = new JLabel("Volumen");
		
		comboIdioma = new JComboBox();
		
		txtCancion = new JTextField();
		
		sldVolumen = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
		
		btAceptar = new JButton("Aceptar");
		btCancelar = new JButton("Cancelar");
		
		panel1.add(lbIdioma);
		panel1.add(comboIdioma);
		
		panel2.add(lbCancion);
		panel2.add(txtCancion);
		
		panel3.add(lbVolumen);
		panel3.add(sldVolumen);
		
		panel4.add(btAceptar);
		panel4.add(btCancelar);
		
		frameOpciones.getContentPane().setLayout(new GridLayout(4, 1));
		frameOpciones.getContentPane().add(panel1);
		frameOpciones.getContentPane().add(panel2);
		frameOpciones.getContentPane().add(panel3);
		frameOpciones.getContentPane().add(panel4);
		
		frameOpciones.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameOpciones.setVisible(true);	
	}
}
