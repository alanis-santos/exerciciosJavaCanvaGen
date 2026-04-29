package exercicioCollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ExercicioUmSet {

	public static void main(String[] args) {
		
		Set<Integer> setNumeros = new HashSet<Integer>();
		
		Scanner leia = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			
			System.out.println("Digite um número: ");
			setNumeros.add(leia.nextInt());
		}
		Iterator<Integer> isetNumeros = setNumeros.iterator();
		
		while (isetNumeros.hasNext()) {
			System.out.println(isetNumeros.next());
		}
		
		

	}

}
