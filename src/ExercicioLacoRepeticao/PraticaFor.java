package ExercicioLacoRepeticao;

import java.util.Scanner;

public class PraticaFor {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int numero;
		int pares = 0;
		int impares = 0;
		
		for(int i = 0; i<10; i++) {
			System.out.println("Digite um numero: ");
			numero = leia.nextInt();
			
			if(numero % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
			
		}
		
		System.out.println("Total de numeros pares: " + pares);
		System.out.println("Total de numeros impares: " + impares);

   }
}