package sudoku.ventana;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
//import javax.swing.JTable;
import javax.swing.JTextField;
//import javax.swing.table.AbstractTableModel;
//import javax.swing.table.DefaultTableModel;
//import javax.swing.table.TableModel;

//import sudoku.Logica.Sudoku;

public class VentanaSudoku extends JFrame {

    
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
   public VentanaSudoku(){
	   	this.setLayout(null);
	    this.setSize(700, 700);
	    this.setBackground(Color.darkGray);
	    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	    
   }
   
   public void agregarPanel() {
	    JPanel panelPrinc= new JPanel();
	    panelPrinc.setSize(700,700);
	    JTextField campo = new JTextField();
	    
	   
	    campo.setBounds(100, 100,90,60);
	    campo.setBackground(Color.cyan);
	    campo.setText("hola pe");
	    panelPrinc.add(campo);
	    
	    this.getContentPane().add(panelPrinc);
	    campo.setVisible(true);
	    panelPrinc.setVisible(true);
   }
}
