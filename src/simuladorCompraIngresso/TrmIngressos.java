package br.unicamp.ic.mc302.fila;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StreamTokenizer;
import java.util.Scanner;

public class TrmIngresso {

	// Atributos
	private Ingresso ingresso = new Ingresso();
	private Usuario usuario = new Usuario();
	Scanner myObj = new Scanner(System.in); 
	private Pagamento pagamento = new Pagamento();

	public int iniciarOperacao() {
		int op; // codigo da operacao solicitada
		int filme;
		int n_ingressos;
		int tipo_ingresso;
		
		
		
		double precoFinal = 0;
		op = getOp();
		while (op != 9) {
			switch (op) {
			case 1:
				System.out.println("Escolha o filme:");
				filme = getInt("1 = The Joker, 2 = Avengers");
				while (filme != 9) {
					switch(filme) {
					case 1:
						ingresso.setFilmeIngresso("The Joker");
						int sessao = getInt("Escolha a sessão: 1 = 14:00, 2 = 20:00");
						while(sessao != 9) {
							switch(sessao) {
							case 1:
								ingresso.setSessao(14, 00, "Sala 1");
								break;
							case 2:
								ingresso.setSessao(20, 00, "Sala 1");
								break;
							}
							break;
						}
						break;
					case 2:
						ingresso.setFilmeIngresso("Avengers");
						break;
					}
					break;
				}
				n_ingressos = getInt("O número de ingressos: ");
				for(int i = 0; i < n_ingressos; i++) {
					tipo_ingresso = getInt("O tipo do Ingresso: 1 = Meia, 2 = Inteira");
					while (tipo_ingresso != 9) {
						switch(tipo_ingresso) {
						case 1:							
							System.out.println("O nome do ingresso: ");
							String nome = myObj.nextLine();
							usuario.setNome(nome, i);
							usuario.setIngresso(ingresso.getFilme().getNomeFilme(), 1, nome);
							break;
						case 2:
							System.out.println("O nome do ingresso: ");
							nome = myObj.nextLine();
							usuario.setNome(nome, i);
							usuario.setIngresso(ingresso.getFilme().getNomeFilme(), 2, nome);
							break;
						}
						break;
					}
				}
				
				int pag = getInt("A forma de pagamento será: 1: Cartão de Débito, 2: Cartão de Crédito, 3: Boleto");
				while(pag != 9) {
					switch(pag) {
					case 1:
						pagamento.selecionaFormaPagamento("Cartão Débito");
						break;
					case 2:
						pagamento.selecionaFormaPagamento("Cartão Crédito");
						break;
					case 3:	
						pagamento.selecionaFormaPagamento("Boleto");
						break;
					}
					break;
				}
				
				System.out.println("Filme escolhido: " + usuario.getIngresso(0).getFilme().getNomeFilme() + "\n");
				for(int i = 0; i < usuario.getNumIngressos(); i++) {
					System.out.println("Nome: "+ usuario.getNome(i) + "\n");
					System.out.println("Tipo de Ingresso: " + usuario.getIngresso(i).getTipo() + "\n");
					System.out.println("Preco: "+ usuario.getIngresso(i).getPreco() + "\n");
					precoFinal += usuario.getIngresso(i).getPreco();
				}
				System.out.println("Preço final: " + precoFinal + "\n");
				
				break;
			case 2:
				System.out.println("Filme escolhido: " + usuario.getIngresso(0).getFilme().getNomeFilme() + "\n");
				for(int i = 0; i < usuario.getNumIngressos(); i++) {
					System.out.println("Nome: "+ usuario.getNome(i) + "\n");
					System.out.println("Tipo de Ingresso: " + usuario.getIngresso(i).getTipo() + "\n");
					System.out.println("Preco: "+ usuario.getIngresso(i).getPreco() + "\n");
					precoFinal += usuario.getIngresso(i).getPreco();
				}
				System.out.println("Preço final: " + precoFinal + "\n");
			}
			op = getOp();
		}
		return -1;
	}	
	
	private int getOp() {
		int op;
		do {			
			op = getInt("1 = Comprar Ingresso, 2 = Verificar Carrinho, 9 = Sair");
			if (op != 1 && op != 2 && op != 9) op = 0;
		} while (op == 0);
		return (op);
	}

	private int getInt(String str) {
		Reader r = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(r);

		System.out.println(str);
		try {
			st.nextToken();
		} catch (IOException e) {
			System.out.println("Erro na leitura do teclado");
			return (0);
		}
		return ((int) st.nval);
	}
	
	/*	Colocar confirmação da compra dos ingressos
	 * 	Adicionar as sessoes para poder escolher e retirar as poltronas disponiveis
	 * 	Relatar problema de não ter mais poltronas disponiveis
	 * 	
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */

}
