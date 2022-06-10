package com.estruturadados.vetor.teste;

import com.estruturadados.vetor.Lista;
import com.estruturadados.vetor.VetorObjetos;

public class Aula11 {

	public static void main(String[] args) {
		
		Lista<Contato> vetor = new Lista<Contato>(1);
		
		Contato c1 = new Contato("Contato 1", "1234-5678", "contato1@email.com");
		Contato c2 = new Contato("Contato 2", "2134-8888", "contato2@email.com");
		Contato c3 = new Contato("Contato 3", "3412-6666", "contato3@email.com");
		
		vetor.adiciona(c1);
		
	}

}
