import java.util.Scanner;

public class CalculaIdade {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String nome;
		System.out.println("Digite o o seu nome: ");
		nome = teclado.next();
		
		int anoAtual;
		System.out.println("Digite o ano atual: ");
		anoAtual = teclado.nextInt();
		
		int anoNascimento;
		System.out.println("Digite o ano do seu nascimento: ");
		anoNascimento = teclado.nextInt();
		
		int idade;		
		idade = anoAtual - anoNascimento;

		System.out.println("Olá " + nome + " e sua idade é: " + idade + " anos");
	}

}