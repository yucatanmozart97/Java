package com.stefanini.exerciciostreino.exercicios;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class PrincipalEx11 {

	public static void main(String[] args){
		
		PessoaEx11 pessoa1 = new PessoaEx11();
		pessoa1.setNome("albert");
		pessoa1.setDiaNascimento(14);
		pessoa1.setMesNascimento(3);
		pessoa1.setAnoNascimento(1879);
		
		PessoaEx11 pessoa2 = new PessoaEx11();
		pessoa2.setNome("isaac");
		pessoa2.setDiaNascimento(4);
		pessoa2.setMesNascimento(1);
		pessoa2.setAnoNascimento(1643);
		
		pessoa1.setIdade(14, 3, 1879);
		pessoa2.setIdade(4, 1, 1643);
		
	System.out.println(pessoa1.getIdade());
	System.out.println(pessoa2.getIdade());
	}
	
}
