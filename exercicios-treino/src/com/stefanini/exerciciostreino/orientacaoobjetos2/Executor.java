package com.stefanini.exerciciostreino.orientacaoobjetos2;

import java.util.ArrayList;

public class Executor {

	public static void main(String[] args){
		
		Veiculo veiculo = new Veiculo("AAA9999", 2001);
		Onibus onibus = new Onibus("bbb9999", 2010, 100);
		Caminhao caminhao = new Caminhao("CCC9999", 2012, 5);
		
		veiculo.exibirDados();
		onibus.exibirDados();
		caminhao.exibirDados();
	}
	
}
