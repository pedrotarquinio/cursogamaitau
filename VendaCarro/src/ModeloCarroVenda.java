import java.util.Scanner;

public class ModeloCarroVenda {

	public static void main(String[] args) {
		String carro = "Tiggo 8 ";
		int valor = 180000;		
		int entrada;
		
		System.out.println("O valor do carro " + carro + "é " + "R$ " + valor);
		System.out.println("\nDigite o valor da entrada");
		Scanner teclado = new Scanner(System.in);
		entrada = teclado.nextInt();
		
		int dif = valor - entrada;
		
		int analise = 0;
		while(analise<1) {
		System.out.println("O valor da entrada é R$ " + entrada);
		System.out.println("O valor restante para parcelar R$ " + dif);
		System.out.println("*************************************");
		System.out.println("Escolha as parcelas desejada");
		System.out.println("    1 - Parcela 24x");
		System.out.println("    2 - Parcela 48x");
		System.out.println("    3 - Parcela 72x");
		System.out.println("*************************************");		
		
		int opcao = 0;
		opcao = teclado.nextInt();
		switch (opcao) {
		case 1: 
			int parc24 = dif/24;
			System.out.println("O valor em 24 parcelas R$ " + parc24);
			analise++;
			break;
		case 2: 
			int parc48 = dif/48;
			System.out.println("O valor em 48 parcelas R$ " + parc48);
			analise++;
			break;
		case 3:
			int parc72 = dif/72;
			System.out.println("O valor em 72 parcelas R$ " + parc72);
			analise++;
			break;
		default:
			System.err.println("Opção Inválida execute Novamente");
			analise=0;
			break;
		}
	}
	}
}
