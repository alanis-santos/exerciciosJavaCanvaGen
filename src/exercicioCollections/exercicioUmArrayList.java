package exercicioCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class exercicioUmArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> cores = new ArrayList<String>();
		
		Scanner leia = new Scanner(System.in);
		
		for (int i = 0; i <5; i++) {
			System.out.println("Digite a " + ( i+1  ) +  "º cor: ");
			cores.add(leia.next());
		}
		
		System.out.println("Cores adicionadas : " + cores);
		
	   Collections.sort(cores);
	   System.out.println("Cores ordenadas: " + cores);
		
	}  

}
