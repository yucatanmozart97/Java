package com.stefanini.exerciciostreino.exercicios;

/*2. Fazer um programa que imprima a m�dia aritm�tica dos n�meros 8,9 e 7. A m�dia dos 
n�meros 4, 5 e 6. A soma das duas m�dias. A m�dia das m�dias*/

public class Ex2 {

	static double mediaAritmetica (double qtd8, double qtd9, double qtd7){
	return ((qtd8 * 8) + (qtd9 * 9) + (qtd7 * 7))/ (qtd8 + qtd9 + qtd7);
}
	
	public static void main(String[] args) {
    double media = (4 + 5 + 6) / 3;
    
    System.out.println(mediaAritmetica(3, 6, 9) + media + " Soma das medias");
    System.out.println((mediaAritmetica(3, 6, 9) + media) / 2 + " Media das medias");
		
		
	}
}
