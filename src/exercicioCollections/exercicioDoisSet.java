package exercicioCollections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExercicioDoisSet {

	public static void main(String[] args) {
		 
		Set<Integer> setNumero = new HashSet<Integer>(Set.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		int numeroDigitado;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		numeroDigitado = leia.nextInt();
		
	
		
		if (setNumero.contains(numeroDigitado) == true) {
			System.out.print("O número " + numeroDigitado + " foi encontrado.");
		} else {
			System.out.print("O número " + numeroDigitado + "não foi encontrado.");
		}
		
		
			
		
		
		
		
		
		

	}

}
