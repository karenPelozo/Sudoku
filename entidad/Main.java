package sudoku.entidad;

import sudoku.Logica.Sudoku;

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
 }
}
