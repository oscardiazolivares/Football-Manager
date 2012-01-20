import java.awt.*;
import javax.swing.*;

public class InterfazConvocados {
	JFrame frameConvocados;
	JLabel lbJugadores,
		   lbFormacion,
		   lbPortero,
		   lbDefensas,
		   lbCentrocampistas,
		   lbDelanteros,
		   lbBanquillo;
	JPanel panel,
		   panel1;
	JComboBox comboFormacion;
	JList listaJugadores,
		  listaPortero,
		  listaDefensas,
		  listaCentrocampistas,
		  listaDelanteros,
		  listaBanquillo;
	JButton[] bt;
	
	InterfazConvocados(){
		frameConvocados = new JFrame("Convocados");
		frameConvocados.setSize(1024, 768);
		frameConvocados.getContentPane().setLayout(new GridLayout(1, 2));
		
		panel = new JPanel();
		panel.setLayout(new GridLayout(2 ,2));
		
		panel1 = new JPanel();
		panel1.setLayout(new GridLayout(5, 4));
		
		lbJugadores = new JLabel("Jugadores");
		lbFormacion = new JLabel("Formación");
		lbPortero = new JLabel("Portero");
		lbDefensas = new JLabel("Defensas");
		lbCentrocampistas = new JLabel("Centrocampistas");
		lbDelanteros = new JLabel("Delanteros");
		lbBanquillo = new JLabel("Banquillo");
		
		comboFormacion = new JComboBox();
		
		bt = new JButton[10];
		
		for (int i = 0; i < 10; i++){
			if (i%2 == 0){
				bt[i] = new JButton("<--");
			}
			else {
				bt[i] = new JButton("-->");
			}
		}
		
		listaJugadores = new JList();
		listaPortero = new JList();
		listaDefensas = new JList();
		listaCentrocampistas = new JList();
		listaDelanteros = new JList();
		listaBanquillo = new JList();
		
		panel.add(lbFormacion);
		panel.add(comboFormacion);
		
		panel1.add(bt[0]);
		panel1.add(bt[1]);
		panel1.add(listaPortero);
		panel1.add(lbPortero);
		panel1.add(bt[2]);
		panel1.add(bt[3]);
		panel1.add(listaDefensas);
		panel1.add(lbDefensas);
		panel1.add(bt[4]);
		panel1.add(bt[5]);
		panel1.add(listaCentrocampistas);
		panel1.add(lbCentrocampistas);
		panel1.add(bt[6]);
		panel1.add(bt[7]);
		panel1.add(listaDelanteros);
		panel1.add(lbDelanteros);
		panel1.add(bt[8]);
		panel1.add(bt[9]);
		panel1.add(listaBanquillo);
		panel1.add(lbBanquillo);
		
		frameConvocados.getContentPane().add(lbJugadores);
		frameConvocados.getContentPane().add(panel);
		frameConvocados.getContentPane().add(listaJugadores);
		frameConvocados.getContentPane().add(panel1);
		
		frameConvocados.setVisible(true);
		frameConvocados.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}
	
	public static void main(String args[]){
		InterfazConvocados ic = new InterfazConvocados();
	}
}
