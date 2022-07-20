package com.stefanini.cursojavabasico.breakcontinue;

public class breakContinue {

	public static void main(String[] args) {
		String[] carros = new String[] {"bmw", "mercedes", "tesla", "ferrari"};
		
		for (int i = 0; i < carros.length; i++) {
			if (carros[i] == "tesla") {
				System.out.println(carros[i]);
				break;
			}
		}
		
		for (int i = 0; i < carros.length; i++) {
			if (carros[i] == "bmw") {
				System.out.println(carros[i]);
				continue;
			}
			System.out.println("quero esse carro");
			System.out.println(carros[i]);
		}
		
		
		
	}
	
}
