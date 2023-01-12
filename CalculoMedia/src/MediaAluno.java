import java.util.Scanner;

public class MediaAluno {

	public static void main(String[] args) {
		System.out.println("Bem vindo *CALCULAR MÉDIA DO ALUNO*");
		String nome;
		int n1, n2, n3, n4, media;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o nome do aluno: ");
		nome = teclado.nextLine();
		
		System.out.println("Digite a primeira nota: ");
		n1 = teclado.nextInt();
		
		System.out.println("Digite a segunda nota: ");
		n2 = teclado.nextInt();
		
		System.out.println("Digite a terceira nota: ");
		n3 = teclado.nextInt();
		
		System.out.println("Digite a quarta nota: ");
		n4 = teclado.nextInt();
		
		media = (n1 + n2 + n3 + n4)/4;
		
		System.out.println("A média final do aluno " + nome + " é: " + media );
		
		if(media < 5) {
			System.out.println("Reprovado");
		}else if (media < 7) {
		System.out.println("Recuperação");
		}else 
			System.out.println("Aprovado");
	}
}
