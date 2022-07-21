package com.stefanini.exerciciostreino.exercicios;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class PessoaEx11 {

	private String nome;
	private double idade;
	private int diaNascimento;
	private int mesNascimento;
	private int anoNascimento;
	
	public PessoaEx11() {
		
	}
	
	public PessoaEx11(String nome, int dia, int mes, int ano){
		this.nome = nome;
		this.diaNascimento = dia;
		this.mesNascimento = mes;
		this.anoNascimento = ano;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getDiaNascimento() {
		return diaNascimento;
	}
	public void setDiaNascimento(int diaNascimento) {
		this.diaNascimento = diaNascimento;
	}
	public int getMesNascimento() {
		return mesNascimento;
	}
	public void setMesNascimento(int mesNascimento) {
		this.mesNascimento = mesNascimento;
	}
	public int getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	
	public void setIdade(int dia, int mes, int ano) {
		Date date = new Date();
		LocalDate localDate = date.toInstant()
		  .atZone(ZoneId.systemDefault())
		  .toLocalDate();

		int anoAtual = localDate.getYear();
		System.out.println("ano = " + ano);

		int mesAtual = localDate.getMonthValue();
		System.out.println("mes = " + mes);

		int diaAtual = localDate.getDayOfMonth();
		System.out.println("dia = " + dia);
		
		this.idade = (anoAtual + (mesAtual / 12) + diaAtual) - (ano + mes + dia);
	}
	
	public double getIdade(){
		return this.idade;
	}
	
	
	
}
