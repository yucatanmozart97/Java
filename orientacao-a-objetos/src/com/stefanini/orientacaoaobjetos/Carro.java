package com.stefanini.orientacaoaobjetos;

public class Carro {

	private String marca;
	private String modelo;
	private int velocidadeMaxima;
	private int taxaAceleracao;
	private double quilometrosPorLitro;
	
	public Carro() {
		System.out.println("Construindo um carro...");
	}
	
	void acelerar() {
		System.out.println("Acelerando.....");
	}
	
	void frear() {
		System.out.println("Freando......");
	}
	
	double calcularTaxaAceleracao(double velocidadeFinal, double velocidadeInicial, double tempoFinal, double tempoInicial) {
		return ((velocidadeFinal - velocidadeInicial) / (tempoFinal - tempoInicial)) * 3.6;
	}
	
	double calcularTaxaAceleracao(double velocidadeFinal, double tempoFinal) {
		return (velocidadeFinal / tempoFinal) * 3.6;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public void setMarca(String marca){
		this.marca = marca;
	}
	
	public String getModelo(){
		return this.modelo;
	}
	
	public void setModelo(String modelo){
		this.modelo = modelo;
	}
	
	public int getVelocidadeMaxima(){
		return this.velocidadeMaxima;
	}
	
	public void setVelocidadeMaxima(int velocidadeMaxima)throws NegocioException{
		if (velocidadeMaxima < 0) {
			throw new NegocioException("Valor invalido");
		} else {
		this.velocidadeMaxima = velocidadeMaxima;
		}
	}
	
	public int getTaxaAceleracao(){
		return this.taxaAceleracao;
	}
	
	public void setTaxaAceleracao(int taxaAceleracao){
		this.taxaAceleracao = taxaAceleracao;
	}
	
	public double getQuilometrosPorLitro(){
		return this.quilometrosPorLitro;
	}
	
	public void setQuilometrosPorLitro(double quilometrosPorLitro) {
		this.quilometrosPorLitro = quilometrosPorLitro;
	}
}
