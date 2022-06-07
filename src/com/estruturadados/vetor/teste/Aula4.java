package com.estruturadados.vetor.teste;

import com.estruturadados.vetor.Vetor;

public class Aula4 {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(10);


		vetor.adiciona("Curso");
		vetor.adiciona("Estrutura de Dados");
		vetor.adiciona("elemento 3");
		
		System.out.println(vetor.tamanho());
		
		System.out.println(vetor.toString());
	}

}
