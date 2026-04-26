package exercicioVetor;

import java.util.Scanner;

public class PraticaVetor {

	public static void main(String[] args) {

		int numeros[] = new int[10];
		int soma = 0;
		float media;
		
		Scanner leia = new Scanner(System.in);

		for (int l = 0; l < 10; l++) {
			System.out.println("Digite um número inteiro: ");
			numeros[l] = leia.nextInt();
		}
		
		System.out.print("Elementos nos índices ímpares: ");
		for (int i = 0; i < 10; i++) {
			if (i % 2 != 0) {
				System.out.print(numeros[i] + " ");
			}
		}
		
		System.out.println("\nElementos pares: ");
		for (int i = 0; i < 10; i++) {

			if (numeros[i] % 2 == 0) {
				System.out.println(numeros[i]);
			}
		}
		
		for (int i = 0; i < 10; i++) {
			soma += numeros[i];
		}
		System.out.println("Soma: " + soma);
		
		media = soma / 10f;
		System.out.printf( "média: %.2f%n ", media);

	}

}
