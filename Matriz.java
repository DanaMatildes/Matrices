package matrices;

public class Matriz {
	
	/*Pruebas
	public int[][] rellenaMatriz1() {
		int[][]matriz1= new int[3][2];
		matriz1[0][0]= 3;
		matriz1[0][1]= 2;
		matriz1[1][0]= 65;
		matriz1[1][1]= 6;
		matriz1[2][0]= 9;
		matriz1[2][1]= 7;
		return(matriz1);
	}
	
	public int[][] rellenaMatriz2() {
		int[][]matriz2= new int[2][2];
		matriz2[0][0]= 5;
		matriz2[0][1]= 9;
		matriz2[1][0]= 2;
		matriz2[1][1]= 8;
		return(matriz2);
	}
	
	public int[][] matrizCuad(){
		int[][]matrizC= new int[3][3];
		matrizC[0][0]= 5;
		matrizC[0][1]= 9;
		matrizC[0][2]= 16;
		matrizC[1][0]= 9;
		matrizC[1][1]= 8;
		matrizC[1][2]= 14;
		matrizC[2][0]= 1;
		matrizC[2][1]= 3;
		matrizC[2][2]= 9;
		return(matrizC);
	}*/
	
	//IMPRIMIR MATRIZ
	public void imprime(int[][] matriz) {
		int filas= matriz.length;
		int columnas = matriz[0].length;
		System.out.println("Filas: " + filas + "Columnas: " + columnas);
		for(int j=0; j<columnas; j++) {
			System.out.print("\t*" + j);
		}
		System.out.println("\n");
		for(int i=0; i<filas; i++) {
			System.out.print("*" + i);
			for(int j=0; j<columnas; j++) {
				System.out.print("\t" + matriz[i][j]);
			}
			System.out.println("\n");
		}
	}
	
	
	//MULTIPLICA MATRICES
	public int[][] matMultiplicadas(int[][]matrizA, int[][]matrizB){
		int filas1 = matrizA.length;
		int columnas1 = matrizA[0].length;
		
		int filas2 = matrizB.length;
		int columnas2 = matrizB[0].length;
			
		int[][] nueva= new int[filas1][columnas2];
			
		if(columnas1!=filas2) {
			System.out.println("No es posible multiplicar estas matrices");
			
		}else {
				
			for(int i=0; i<filas1; i++) {
				for(int j=0; j<columnas2; j++) {
					int temp=0;
					for(int k=0; k<columnas2; k++) {
						temp= temp + (matrizA[i][k] * matrizB[k][j]);
					}
					nueva[i][j]= temp;
				}
			}
		}
		return nueva;			
	}
	
		
	//TRANSPONER MATRIZ
	public int[][] transpuesta(int[][]matriz){
		
		int[][]transpuesta = new int[matriz[0].length][matriz.length];
		
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[0].length; j++) {
				transpuesta[j][i]= matriz[i][j];
			}
		}
		return transpuesta;
	}
	
	
	//SUMA DE LA DIAGONAL PRINCIPAL
		public int diagonalPrincipal(int[][]matriz) {
			int filas = matriz.length;
			int columnas = matriz[0].length;
			int suma=0;
			
			if(filas!=columnas) {
				System.out.println("La matriz no es cuadrada. Saliendo");
				return(0);
			}else {
				for(int i=0; i<filas; i++) {
					for(int j=0; j<columnas; j++) {
						if(i==j) {
							suma = suma + matriz[i][j]; 
						}else {
							continue;
						}
					}
				}
				return(suma);
			}
		}
		
		
	//BUSCA MAYOR VALOR EN MATRIZ
	public int mayorValor(int[][]matriz) {
		int filas = matriz.length;
		int columnas = matriz[0].length;
			
		int MAX=0;
			
		for(int i=0; i<filas; i++) {
			for(int j=0; j<columnas; j++) {
				if(matriz[i][j]>MAX) {
					MAX = matriz[i][j];
				}
			}
		}
		return(MAX);
	}
	
	
	//SUMAR DOS MATRICES
	public int[][] sumarMatrices(int[][]matriz1, int[][]matriz2){
		
		int filas1 = matriz1.length;
		int columnas1 = matriz1[0].length;
		
		int filas2 = matriz2.length;
		int columnas2 = matriz2[0].length;
		
		int[][]matrizSuma = new int[filas1][columnas1];
		
		if(filas1!= filas2) {
			System.out.println("Las matrices no son del mismo tamaño. Saliendo");
			System.exit(0);
		}else if(columnas1!= columnas2) {
			System.out.println("Las matrices no son del mismo tamaño. Saliendo");
			System.exit(0);
		}else {
			
			for(int i=0; i<filas1; i++) {
				for(int j=0; j<columnas1; j++) {
					matrizSuma[i][j] = matriz1[i][j] + matriz2[i][j];
				}
			}
		}
		return(matrizSuma);
	}
	
	
	//MULTIPLICA MATRIZ POR ESCALAR
	public int[][] matrizPorEscalar(int[][]matriz, int escalar){
		int filas = matriz.length;
		int columnas = matriz[0].length;
		int [][] resultado = new int[filas][columnas];
		
		for(int i=0; i<filas; i++) {
			for(int j=0; j<columnas; j++) {
				resultado[i][j] = matriz[i][j] * escalar;
			}
		}
		return(resultado);
	}
		

}
