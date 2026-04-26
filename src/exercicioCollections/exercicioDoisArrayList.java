package exercicioCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicioDoisArrayList {

	public static void main(String[] args) {
		ArrayList<Integer>  listaNumeros = new ArrayList<Integer>(List.of(1,3,5,7,6,4,2,10,9,8));
		int numeroDigitado;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro: ");
		numeroDigitado = leia.nextInt();
		
		if(listaNumeros.contains(numeroDigitado)){
			System.out.println("O numero " + numeroDigitado + " esta localizado na posicao: " 
					+ listaNumeros.indexOf(numeroDigitado));
		} else {
			System.out.println("O numero " + numeroDigitado + " nao foi encontrado.");
		}
	}

}
