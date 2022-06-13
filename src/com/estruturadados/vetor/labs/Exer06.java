package com.estruturadados.vetor.labs;

import java.util.Scanner;

import com.estruturadados.vetor.Lista;
import com.estruturadados.vetor.teste.Contato;

public class Exer06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Lista<Contato> lista = new Lista<Contato>(20);

		criarContatosDinamicamente(5, lista);
		
		int opcao = 1;
		
		while (opcao != 0) {
			opcao = obterOpcaoMenu(scan);
			
			switch (opcao) {
			case 1: 
				adicionarContatoFinal(scan, lista);
				break;
			case 2:	
			default:
				break;
			}
		}
		
		System.out.println("Usuário digitou 0, programa finalizado");

	}
	
	private static void adicionarContatoFinal(Scanner scan, Lista<Contato> lista) {
		System.out.println("Criando um contato, entre com as infomrações: ");
		String nome = leInformacao("Entre com o nome", scan);
		String telefone = leInformacao("Entre com o telefone", scan);
		String email = leInformacao("Entre com o e-mail", scan);
		
		Contato contato = new Contato(nome, telefone, email);
		
		lista.adiciona(contato);
		
		System.out.println("Contato adicionado com sucesso!");
		System.out.println(contato);
	}
	
	private static String leInformacao(String msg, Scanner scan) {
		
		System.out.println(msg);
		String entrada = scan.nextLine();
		
		return entrada;
	}

	private static int obterOpcaoMenu(Scanner scan) {

		boolean entradaValida = false;
		int opcao = 0;
		String entrada;

		while(!entradaValida) {
			System.out.println("Digite a opção desejada:");
			System.out.println("1: Adiciona contato no final do vetor");
			System.out.println("2: Adiciona contato em uma posição específica");
			System.out.println("3: Busca contato de uma posição específica");
			System.out.println("4: Consulta contato");		
			System.out.println("5: Consulta último indice do contato");
			System.out.println("6: Verifica se contato existe");
			System.out.println("7: Excluir por posição");
			System.out.println("8: Excluir por contato");
			System.out.println("9: Verifica tamanho do vetor");
			System.out.println("10: Excluir todos os contatos do vetor");
			System.out.println("11: Imprime vetor");
			System.out.println("0: Sair");
			
			try {
				
				entrada = scan.nextLine();
				opcao = Integer.parseInt(entrada);
				
				if (opcao >=0 && opcao <=11) {
					entradaValida = true;
				} else {
					throw new Exception();
				}
				
			} catch (Exception e) {
				
				System.out.println("Entrada inválida, digite novamente\n\n");
			}
			
		}

		return opcao;
	}

	private static void criarContatosDinamicamente(int quantidade, Lista<Contato> lista) {

		Contato contato;

		for (int i = 1; i <= quantidade; i++) {

			contato = new Contato();
			contato.setNome("Contato " + i);
			contato.setTelefone("11111111"+i);
			contato.setEmail("contato"+i+"@email.com");

			lista.adiciona(contato);
		}
	}

}
