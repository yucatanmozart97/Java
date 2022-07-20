package com.stefanini.exerciciostreino.exercicios;

public class PessoasEx4 {

	private String nome;
	private double salario;
	
	public PessoasEx4() {
		
	}
	
	public PessoasEx4(String nome, double salario){
		this.nome = nome;
		this.salario = salario;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public void setSalario(double salario){
		this.salario = salario;
	}
	
}
