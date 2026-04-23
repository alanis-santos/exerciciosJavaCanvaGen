package ExercicioLacoRepeticao;

import java.util.Scanner;

public class ExercicioUmWhile {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int idade;
		int menor21 = 0;
		int maior50 = 0;
		
		System.out.println("Digite uma idade: ");
		idade = leia.nextInt();
		
		while(idade >=0) {
			if(idade <21) {
				menor21++;
			}
			if(idade > 50) {
				maior50++;
		}

		System.out.println("Digite uma idade: ");
		idade = leia.nextInt();
		
	}
		System.out.println("Total de pessoas menores de 21: " + menor21);
        System.out.println("Total de pessoas maiores de 50: " + maior50);
  }
}