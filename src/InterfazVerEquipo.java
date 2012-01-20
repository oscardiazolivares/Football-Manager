import java.awt.*;
import javax.swing.*;

public class InterfazVerEquipo {
	JFrame frameVerEquipo;
	JTable tabla;
	
	InterfazVerEquipo(){
		frameVerEquipo = new JFrame("Ver equipo");
		frameVerEquipo.setSize(1024, 768);
		frameVerEquipo.getContentPane().setLayout(new FlowLayout());
		
		//Hay que poner un parámetro de entrada que sea los datos del equipo para mostrar en la tabla
		tabla = new JTable(5,6);
		frameVerEquipo.add(tabla);
		
		frameVerEquipo.setVisible(true);
		frameVerEquipo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}
}
