import java.util.Scanner;

public class ExecutarCalculadora {

	public static void main(String[] args) {
		int valor1,valor2, opcao;
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite o valor 1: ");
		valor1 = teclado.nextInt();
		
		System.out.println("Digite o valor 2: ");
		valor2 = teclado.nextInt();
		
		//criando menu
		System.out.println("Escolha a opção abaixo desejada");
		System.out.println("1 - Adição");
		System.out.println("2 - Subtração");
		System.out.println("3 - Divisão");
		System.out.println("4 - Multiplicação");
		System.out.println("Digite a opção desejada: ");
		opcao = teclado.nextInt();		
		
		switch(opcao) {
		case 1:
			//System.out.println("A soma dos valores: " + (valor1 + valor2));
			int resultado;
			resultado = valor1 + valor2;
			System.out.println("A soma dos valores:" +resultado);
			break;
		case 2:
			resultado = valor1 - valor2;
			System.out.println("A subtração dos valores:" +resultado);
			break;
		case 3:
			resultado = valor1 / valor2;
			System.out.println("A divisão dos valores:" +resultado);
			break;
		case 4:
			resultado = valor1 * valor2;
			System.out.println("A multiplicação dos valores:" +resultado);
			break;
		default:
			System.out.println("Não existe essa opção");
		}
	}

}
