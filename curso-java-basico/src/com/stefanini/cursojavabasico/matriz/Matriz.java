package com.stefanini.cursojavabasico.matriz;

public class Matriz {
 public static void main(String[] args) {
	
	 
	 int matriz[][] = new int[5][5];
	 
	 matriz[0][0] = 1;
	 matriz[1][1] = 2;
	 matriz[2][2] = 3;
	 matriz[3][3] = 4;
	 matriz[4][4] = 5;
	 
	 
	
	 
	 System.out.println(matriz[0][0]);
	 System.out.println(matriz[1][1]);
	 System.out.println(matriz[2][2]);
	 System.out.println(matriz[3][3]);
	 System.out.println(matriz[4][4]);
	 
	 for (int i = 0; i < matriz.length; i++) {
		 for (int j = 0; j < matriz.length; j++) {
			 if (j == 4) {
			 System.out.println(matriz[i][j]);
			 } else {
				 System.out.print(matriz[i][j]);
			 }
		 }
	 }
	 
 }
}
