package com.stefanini.cursojavabasico.estruturacontrole;

public class Loop {

	public static void main(String[] args){
		int count = 101;
		
		while(count < 100){
			System.out.println("Count: " + count);
			count++;
		}
		
		int countDois = 101;
		
		do {
			System.out.println(countDois);
			countDois++;
		} while (countDois < 100);
		
		//for normal
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
		
		//for com areas ausentes
		int i = 0;
				for (;i < 100;) {
					System.out.println(i);
					i++;
				}
				
				//for com todas areas ausentes
				
				for(;;) {
					System.out.println("for");
				}
		
	}
	
}
