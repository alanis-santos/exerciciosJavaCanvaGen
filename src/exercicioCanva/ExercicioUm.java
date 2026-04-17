package exercicioCanva;

import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		
		// Declarando as variaveis
		Scanner leia = new Scanner(System.in);
		
		float n1, n2, n3, n4;
		
		// Entrada de Dados
		System.out.println("Digite a nota1: ");
		n1 = leia.nextFloat();
		
		System.out.println("Digite a nota2: ");
		n2 = leia.nextFloat();
			
		System.out.println("Digite a nota3: ");
		n3 = leia.nextFloat();
		
		System.out.println("Digite a nota4: ");
		n4 = leia.nextFloat();
		
		// Processamento
		float media = (n1 + n2 + n3 + n4) / 4;
		
		// Saída de Dados
		System.out.println("Média: " + media);
	}

}
