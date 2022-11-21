package tareaunidad4;

import java.util.Scanner;

import sentenciasdeiteracion.For;

public class BuscaMinas {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int numFilas = 5;
		int numColumnas = 5;
		
		//inicializamos la matriz con 5 filas y 5 columnas
		int [][] matriz = matriz(numFilas, numColumnas);
		
		System.out.println("Introduzca la fila a comprobar: ");
		
		int fila = sc.nextInt();
		
		System.out.println("Introduce la columna a comprobar: ");
		
		int columna = sc.nextInt();
		
		int nBombas = NumeroBombas(fila, columna, matriz);
		
		System.out.println("Hay " + nBombas + " bombas alrededor ");

	}

	//rellenamos el array con la condicion de que cada * es un 2 y cualquier otra cosa es un 1
	public static int [][] matriz (int numFilas, int numColumnas) {
		
		int [][] matriz = new int [numFilas][numColumnas];
		
		for (int i=0;i<matriz.length;i++) {
			
			for (int j=0;j<matriz[0].length;j++) {
				
				 System.out.print("Introduzca coordenada (" + i + "," + j + ") = ");
				 
			    String a = sc.next();
			     
			     if(a.equals("*")) {
						
			    	 matriz[i][j]=2;
					}
			     
			     else matriz[i][j]=1;
			     
				}
			}
		    	
		return matriz;
		
	}
	
	//recorremos el array 
	public static void recorreArray (int [][] matriz) {
				
		for (int i = 0; i<matriz.length; i++) {
			
	          for (int j = 0; j < matriz[i].length; j++) {
	            	
	                System.out.printf("%-5s ",matriz[i][j]);
	            }
	          System.out.println("");
		}
		
	}

	
	//contamos el numero de bombas
	
	//recorremos el array y le pasamos por argumentos la fila y la columna que el usuario quiere revisar ademas de la matriz
	//le ponemos una condicion de que la fila y la columna a revisar tiene que estar entre 0-4
	//si esta entre  0-4 por cada bomba que haya alrededor de la fila y columna que el usuario nos ha pedido suma 1 al contador
	public static int NumeroBombas (int fila, int columna, int [][] matriz) {
		
		int contBombas=0;
							
			for(int i=(columna+1);i>=columna-1;i--){
			
				if (i<=4 && i>=0){
						
					for (int j=fila+1;j>=fila-1;j--)
						
							if(j<=4 && j>=0) {
								
								if (matriz[i][j]==2) {
									contBombas++;
						}
						
				}
	
			}
				
		}
				
				return contBombas;
	}

}
	
