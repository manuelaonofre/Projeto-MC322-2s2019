package simuladorCompraIngresso;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Pagamento {
	
	private String tipoDeIngresso;
	private String formaDePagamento;
	
	
//tem que selecionar metodo de pagamento
	//se cartao pede os dados do cartao -> num, nome, data de validade, cod
	//se boleto entao informa o num do codigo de barra
	
	public void selecionaFormaPagamento(String forma) {
		this.formaDePagamento = forma;
		if(formaDePagamento.equalsIgnoreCase("Cartão Crédito")||formaDePagamento.equalsIgnoreCase("Cartão Débito")) {
			//printar valor a ser pago
			System.out.println("Informe o número do cartão");
			Scanner input = new Scanner(System.in);
			String num = input.nextLine();
			System.out.println("Informe o nome como esta no cartão");
			String nome = input.nextLine();
			System.out.println("Informa data de validade no formado dd/mm/aa");
			String data = input.nextLine();
			System.out.println("Informe os 3 dígitos do código de segurança");
			String cod = input.nextLine();
			//printa os dados de volta só pra ter uso
			//fechar scanner
		}
		else if(formaDePagamento.equalsIgnoreCase("Boleto")) {
			//printar valor a ser pago
			System.out.println("Gerando código do boleto...");
			gerarBoleto();
		}
		
	}
	public void gerarBoleto() {
		int[] boleto = new int[13];
		Random aleatorio = new Random();
		for (int i=0; i<13; i++) {
			boleto[i] = aleatorio.nextInt(9);
			System.out.print(boleto[i]);
		}	
	}
	public double calculaPrecoFinal(int num, List<Ingresso> ingressos) {
		double valorFinal = 0.0;
		for(int i = 0; i < num; i++) {
			valorFinal += ingressos.get(i).getPreco(); 
		}
		
		return valorFinal;
	}
}
