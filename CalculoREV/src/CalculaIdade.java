import java.util.Scanner;

public class CalculaIdade {

	public static void main(String[] args) {
		//Variáveis
		String nome;
		int anoNasc,anoAtual,idade;
		
		//Objeto Scanner
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		//Vincular o conteúdo digitado a variável nome
		nome = teclado.nextLine();
		
		System.out.println("Digite o ano de nascimento: ");
		//Vincular o contéudo digitado a variável anoNasc
		anoNasc = teclado.nextInt();
		
		System.out.println("Digite o ano atual: ");
		anoAtual = teclado.nextInt();
		
		idade = anoAtual - anoNasc;
		
		System.out.println("Olá " + nome + " e sua idade é: " + idade + " anos");
	}

}
