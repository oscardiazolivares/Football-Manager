import java.awt.*;
import javax.swing.*;

public class InterfazAmistoso {
	JFrame frameAmistoso;	
	JLabel lbHumano,
		   lbEquipo;	
	JCheckBox chkHumano1,
			  chkHumano2;	
	JComboBox comboEquipo1,
			  comboEquipo2;	
	JButton btVer1,
			btVer2;	
	JPanel panelEquipo1,
		   panelEquipo2;

	InterfazAmistoso(){
		frameAmistoso = new JFrame("Amistoso");		
		
		lbHumano = new JLabel("¿Jugador humano?");		
		lbEquipo = new JLabel("Equipo");
		
		chkHumano1 = new JCheckBox();
		chkHumano2 = new JCheckBox();
		
		comboEquipo1 = new JComboBox();
		comboEquipo2 = new JComboBox();
		
		btVer1 = new JButton("Ver");
		btVer2 = new JButton("Ver");
		
		panelEquipo1 = new JPanel();
		panelEquipo2 = new JPanel();
		
		panelEquipo1.setLayout(new GridLayout(2, 1));
		panelEquipo2.setLayout(new GridLayout(2, 1));

		panelEquipo1.add(comboEquipo1);
		panelEquipo1.add(btVer1);
		
		panelEquipo2.add(comboEquipo2);
		panelEquipo2.add(btVer2);
		
		frameAmistoso.getContentPane().setLayout(new GridLayout(3, 2, 50, 50));
		frameAmistoso.getContentPane().add(lbHumano);
		frameAmistoso.getContentPane().add(lbEquipo);
		frameAmistoso.getContentPane().add(chkHumano1);
		frameAmistoso.getContentPane().add(panelEquipo1);
		frameAmistoso.getContentPane().add(chkHumano2);
		frameAmistoso.getContentPane().add(panelEquipo2);
	
		frameAmistoso.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameAmistoso.setVisible(true);
	}
}
