
public class ExecutarMatriz {

	public static void main(String[] args) {
		//Criando variável matriz
		String[]carros = {"Argo", "HB20", "Ferrari", "Porsche"};
		//incrementando a varável
		
		//mostrando o conteúdo da varável matriz
		//System.out.println(carros[0]);
		//System.out.println(carros[1]);
		//System.out.println(carros[2]);
		//System.out.println(carros[3]);
		//System.out.println(carros.length);
		//criando laço de repetição 
		for(int i=0 ; i<carros.length; i++) {
			int n = i + 1;
			System.out.println(n +"- "+carros[i]);
			
		}
	}
}
