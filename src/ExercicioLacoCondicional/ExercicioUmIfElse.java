package exercicioLacoCondicional;

import java.util.Scanner;

public class ExercicioUmIfElse {

	public static void main(String[] args) {
		
		
		int numeroA, numeroB, numeroC, soma;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o valor do número A: ");
		numeroA = leia.nextInt();
		
		System.out.println("Digite o valor do número B: ");
		numeroB = leia.nextInt();
		
		System.out.println("Digite o valor do número C: ");
		numeroC = leia.nextInt();
		
		soma = (numeroA + numeroB);
		
		if (soma > numeroC) {
			System.out.println("A soma de A + B é maior a C: ");
		}
		else if (soma == numeroC) {
			System.out.println("A soma de A + B é igual a C: ");
	
		} else {
			System.out.println("A soma de A + B é menor que C: ");
		}
		

	}

}
