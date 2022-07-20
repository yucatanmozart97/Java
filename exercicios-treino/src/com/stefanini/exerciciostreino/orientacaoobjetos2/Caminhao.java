package com.stefanini.exerciciostreino.orientacaoobjetos2;

public class Caminhao extends Veiculo{

	private int eixos;
	
	public Caminhao() {
		
	}
	
public Caminhao(String placa, int ano, int eixos) {
		super(placa, ano);
		this.eixos = eixos;
	}

public int getEixos() {
	return eixos;
}

public void setEixos(int eixos) {
	this.eixos = eixos;
}

@Override
public void exibirDados() {
	System.out.println("Placa do veiculo: " + super.getPlaca() + " ,e foi fabricado em: " + super.getAno() + " , e tem " + this.eixos + " eixos");
}
	
}
