package sudoku.entidad;

import sudoku.Logica.Sudoku;
import sudoku.ventana.VentanaSudoku;

public class Main {
 public static void main(String []args) {
	 Sudoku sudo= new Sudoku();
	
	  sudo.generarSudoku();
	  System.out.print("\n");
	  sudo.mostrarSudoku();
	  System.out.print(sudo.resolverSudoku());
	  sudo.generarSudoku();
	  System.out.print("\n");
	  sudo.mostrarSudoku();
	  System.out.print(sudo.resolverSudoku());
	  sudo.generarSudoku();
	  System.out.print("\n");
	  sudo.mostrarSudoku();
	  System.out.print(sudo.resolverSudoku());
	 VentanaSudoku ventana1= new VentanaSudoku();
	 ventana1.setVisible(true);
	 ventana1.agregarPanel();
 }
}
