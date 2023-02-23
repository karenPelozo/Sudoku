package sudoku.Logica;

import java.security.SecureRandom;
import java.util.Random;

public class Sudoku {
    
	private int sudoku[][]= new int[9][9];
	public Sudoku(){
		int[][] sudok={ {1,1,0,0,0,0,0,0,0},
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
	public void generarSudoku(int nivel){
	   clearSudoku(); 
	    int loop=0;
	    int i=0,j=0;
	    
	    do {
			for( i=0;i<sudoku.length;i++) {
	    	  for( j=0; j<sudoku[0].length;j++) {
	    		  int valor= valorRandom();
	    		   if(validarFila(i,valor) && validarColumna(j,valor) && validarCuadrado(i,j,valor)) {
	    			   sudoku[i][j]= valor;
	    		   }
	    	  }	    	  
	      }
			nivelSudoku(nivel);
		loop++;
		}while(loop!=9);
		
	
		
}
	// TERMINAR NO FUNCIONA SIGUE LANZANDO CEROS BESOS Y ABRAZOS PERRA
public void resolverSudoku() {
		int i=0,j=0;
		int [] numeros= {1,2,3,4,5,6,7,8,9};
		int num=0;
		int loop=0;
	do{
		for(i=0;i<sudoku.length;i++) {
			for(j=0;j<sudoku[0].length;j++) {
			     for(int c=0;c<numeros.length;c++) {
			    	 num = numeros[c]; 
			    	 if(sudoku[i][j]==0)
			    	 	{	
						if(validarFila(i,num) && validarColumna(j,num) && validarCuadrado(i,j,num)) {
							sudoku[i][j]=num;
							}
						}
			    	 }
				}
			
		}
	   loop++;
		
	}while(loop!=9);
	
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
public boolean validarCuadrado(int i,int j,int valor) {
		  int posI= cuadradoActual(i);
		  int posJ= cuadradoActual(j);
		  for(int m = posI-3; m< posI;m++) {
			  for(int f = posJ-3; f<posJ; f++) {
				  if(sudoku[m][f]==valor) {
					  return false;
				  }
			  }
		  }
		 return true;
 }
	//verifico la posicion de mi valor en el cuadrante 
public int cuadradoActual(int p) {
		if(p<=2)
			return 3;
		else if (p<=5)
			return 6;
		return 9;
}
public void mostrarSudoku() {
		for(int f=0;f<sudoku.length;f++) {
			 System.out.print("\n");
			for(int c=0; c<sudoku[f].length;c++) {
				System.out.print(" "+sudoku[f][c]);
				
			}
		}
}
public int valorRandom() {
		SecureRandom numRandom= new SecureRandom();
		numRandom.setSeed(new byte[1]);
		int valor = 1+numRandom.nextInt(9);
		return valor;
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
