package com.stefanini.exerciciostreino.exercicios;

/*4. Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
(1SM=R$788,00)*/

public class ExecutorEx4 {
	
	static double calcularQtdSalarioMinimo(double salario){
		return salario / 788;
	}

	public static void main(String[] args){
		
		PessoasEx4 pessoa1 = new PessoasEx4("Joao", 10000);
		
		System.out.println(pessoa1.getNome()+ " " + pessoa1.getSalario());
		
		System.out.println(pessoa1.getNome() + " ganha " + calcularQtdSalarioMinimo(pessoa1.getSalario()) + " salarios minimos");
		
	}
	
}
