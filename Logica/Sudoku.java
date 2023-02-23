package sudoku.Logica;

//import java.security.SecureRandom;
import java.util.Random;

public class Sudoku {
    
	private int sudoku[][]= new int[9][9];
	public Sudoku(){
		int[][] sudok={ {0,0,0,0,0,0,0,0,0},
						{0,0,0,0,0,0,0,0,0},
						{0,0,0,0,0,0,0,0,0},
						{0,0,0,0,0,0,0,0,0},
						{0,0,0,0,0,0,0,0,0},
						{0,0,0,0,0,0,0,0,0},
						{0,0,0,0,0,0,0,0,0},
						{0,0,0,0,0,0,0,0,0},
						{0,0,0,0,0,0,0,0,0}
						};
			sudoku= sudok;
		
	}
	public int[][] getSudoku() {
		return sudoku;
	}
	public void setSudoku(int[][] sudoku) {
		this.sudoku = sudoku;
	}
	//genero un sudoku con el nivel 
	public void generarSudoku(){
	   clearSudoku();
	    int i=0,j=0;
	 
		for( i=0;i<sudoku.length;i++) {
			for( j=0; j<sudoku[0].length;j++) {
	    		  int valor= valorRandomDos();
	    		  if(sudoku[i][j]==0) { 
	    			  if(validarGrilla(i,j,valor)) {
	    			   sudoku[i][j]= valor;
	    		   }
	    			  if(!resolverSudoku()) {
	    				  generarSudoku();
	    			  }
	    	       
	    		  }
	    	  }	    	  
	      }
	
		
		
}
	
public boolean resolverSudoku() {
		int i=0,j=0, num=0;
		
		for(i=0;i<sudoku.length;i++) {
			for(j=0;j<sudoku[0].length;j++) {
			      if(sudoku[i][j]==0) {
			    	 for(num=1; num<=9 ; num++) {
			    		 if(validarGrilla(i,j,num)) {
							sudoku[i][j]=num;
							
			    	     if (resolverSudoku()) {
			    	    	 return true;
			    	     }else {
			    	    	 sudoku[i][j]=0;
			    	     	}
			    		}
					}
			      return false;
				}
		 }
	}
	
return true;
}		    	
public boolean validarFila(int i,int valor) {
		for(int f=0;f<sudoku[i].length;f++) {
			if(sudoku[i][f]==valor) 
				return false;
		}
		return true;
}
public boolean validarColumna(int j,int valor) {
		for(int c=0;c<sudoku.length;c++) {
			if(sudoku[c][j]==valor) 
				return false;
		}

		 return true;
 }
public boolean validarGrilla(int i,int j, int valor) {
	return validarFila(i,valor) && validarColumna(j,valor) && validarCuadrado(i,j,valor);
			}
public boolean validarCuadrado(int i,int j,int valor) {
		 int iCuadrado = i-i % 3;// me da el resto
		 int jCuadrado = j-j % 3;
		  for(int m =iCuadrado; m<iCuadrado+3;m++) {
			  for(int f = jCuadrado; f<jCuadrado+3; f++) {
				  if(sudoku[m][f]==valor) {
					  return false;
				  }
			  }
		  }
		 return true;
 }
	

public void mostrarSudoku() {
		for(int f=0;f<sudoku.length;f++) {
			 System.out.print("\n");
			for(int c=0; c<sudoku[f].length;c++) {
				System.out.print(" "+sudoku[f][c]);
				
			}
		}
}
/*public int valorRandom() {
		SecureRandom numRandom= new SecureRandom();
		numRandom.setSeed(new byte[1]);
		int valor = 1+numRandom.nextInt(9);
		return valor;
}
*/
public int valorRandomDos() {
	Random numRandom = new Random();
	int num = 1+numRandom.nextInt(9);
	return num;
	}
	
public void clearSudoku() {
		int i=0, j=0;
		for(i=0; i<sudoku.length;i++) {
			for(j=0;j<sudoku[i].length;j++) {
				sudoku[i][j]=0;
			}
		}
	
}
public void nivelSudoku(int nivel) {
		
		for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[0].length; j++) {
                int aux = j;
                Random numRandom = new Random();
                int rand = numRandom.nextInt(nivel+1) ;
                j += rand;
                for (int co = aux; co < j && co < sudoku.length; co++) {
                    sudoku[i][co] = 0;
                }
            }
        }
	}
}
