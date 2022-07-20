package com.stefanini.orientacaoaobjetos;

public class Principal {

	public static void main(String[] args){
		Carro bmw = new Carro();
		bmw.setMarca("bmw");
		bmw.setModelo("m3");
		bmw.setQuilometrosPorLitro(7.5);
		//bmw.taxaAceleracao = 50;
		try {
			bmw.setVelocidadeMaxima(280);
			} catch(NegocioException e) {
				System.out.println(e);
			} finally {
				System.out.println("bmw Velocidade");
			}
		
		BMW bmwDois = new BMW();
		Tesla tesla = new Tesla();
		tesla.isDirigeSozinho();
		
		try {
		bmwDois.setVelocidadeMaxima(10);
		} catch(NegocioException e) {
			System.out.println(e);
		} finally {
			System.out.println("bmwDois velocidade");
		}
		
		Carro teslaDois = new Tesla();
		((Tesla) teslaDois).setDirigeSozinho(true);
		System.out.println(((Tesla) teslaDois).isDirigeSozinho());
		
		Carro[] carros = new Carro[] {bmwDois, tesla, teslaDois};
		
		for (Carro carro : carros) {
			if (Constantes.MARCA_FAMOSA.equals(carro.getMarca())) {
				System.out.println("Carro de marca famosa");
			}
			if (carro instanceof Tesla){
				System.out.println(((Tesla)teslaDois).isDirigeSozinho());
			}
		}
		
		Calcular.soma(3, 6);
		
		bmwDois.calcularTaxaAceleracao(10, 2);
		tesla.calcularTaxaAceleracao(10, 2);
		
		
		//System.out.println(bmwDois.calcularTaxaAceleracao(10, 1));	
		//bmw.acelerar();
		//bmw.frear();		
		//System.out.println(bmw.calcularTaxaAceleracao(bmw.getVelocidadeMaxima(), 0, 10, 0));
		//System.out.println(bmw.getMarca());
		//System.out.println(bmw.getModelo());
		//System.out.println(bmw.getQuilometrosPorLitro());
		//System.out.println(bmw.getVelocidadeMaxima());
		//System.out.println(bmw.calcularTaxaAceleracao(bmw.getVelocidadeMaxima(), 10));
	}
	
	
}
