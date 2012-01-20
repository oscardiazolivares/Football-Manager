import java.awt.*;
import javax.swing.*;

public class InterfazPrincipal {
	JFrame framePrincipal;
	JButton btNuevoAmistoso,
		    btOpciones;
	JPanel panel1 = new JPanel(),
		   panel2 = new JPanel(),
		   panel3 = new JPanel();
	
	InterfazPrincipal(){
		framePrincipal = new JFrame("Football-Manager");
		framePrincipal.setSize(1024, 768);
		
		FlowLayout fl = new FlowLayout();
		GridLayout gl = new GridLayout(3,1);
		gl.setVgap(50);
		
		framePrincipal.getContentPane().setLayout(gl);
		framePrincipal.getContentPane().add(panel1);
		framePrincipal.getContentPane().add(panel2);
		framePrincipal.getContentPane().add(panel3);


		panel1.setLayout(fl);
		btNuevoAmistoso = new JButton("Nuevo amistoso");
		panel2.add(btNuevoAmistoso);
		
		btOpciones = new JButton("Opciones");
		panel2.add(btOpciones);
		
		framePrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		framePrincipal.setVisible(true);
	}
}
