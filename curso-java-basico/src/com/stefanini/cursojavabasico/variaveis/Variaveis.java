package com.stefanini.cursojavabasico.variaveis;

public class Variaveis {
	
 public static void main(String[] args) {
	byte numByte = -128; //-128 a 127 (8 bits)
	short numShort = 12321; // -32768 a 32676 (16 bits)
	int numInt = 2147483647; // -2.147.483.648 a 2.147.483.647 (32 bits)
	long numLong = 897997888; // -9.223.372.036.854.770.000 a 9.223.372.036.854.770.000 (64 bits) usar l apos passar da capacidade do int
    
	float numFloat = 10.000f; //(32 bits)
	double nuDouble = 100000000000000000.000; //(64 bits)
	
	char varChar = 'F'; // 0 a 65535 (16 bits)
	
	boolean varBoolean = true; //true ou false (1 bit)
	
	String texto = "Bem vindo!";
	Integer numero = 4000;
	Long numeroLongo = 21111L;
	
	//Ele deve começar com uma letra minúscula
	//Não deve começar com caracteres especiais 
	//Camel case
  
	String nome = "Yucatan";
 }
}
