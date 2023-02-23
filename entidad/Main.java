package sudoku.entidad;

import sudoku.Logica.Sudoku;

public class Main {
 public static void main(String []args) {
	 Sudoku sudo= new Sudoku();
	  sudo.generarSudoku(1);
	 
	  sudo.mostrarSudoku();
	  System.out.print("\n");
	  sudo.resolverSudoku();
	  sudo.mostrarSudoku();
 }
}
