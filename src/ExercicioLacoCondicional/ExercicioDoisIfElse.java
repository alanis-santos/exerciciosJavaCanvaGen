package exercicioLacoCondicional;

import java.util.Scanner;

public class ExercicioDoisIfElse {

	public static void main(String[] args) {
		
		int numero, restoDivisao;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite um numero: ");
		numero = leia.nextInt();
		
		restoDivisao = (numero %2);
		
	   if (restoDivisao == 0){
		   if(numero >=0) {
				System.out.println("o número " + numero + " é par e positivo");
			} else {
				System.out.println("o número " + numero + " é par e negativo");
			}
	
		} else {
			if(numero >=0) {
				System.out.println("o número " + numero + " é impar e positivo");

			} else {
				System.out.println("o número " + numero + " é impar e negativo");
			}
			
		}
	}

}
