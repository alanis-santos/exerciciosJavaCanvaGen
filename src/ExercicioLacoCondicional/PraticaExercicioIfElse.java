package ExercicioLacoCondicional;

import java.util.Scanner;

public class PraticaExercicioIfElse {

	public static void main(String[] args) {
		String nome;
		int idade, respPrimeiraDoacao;
		boolean primeiraDoacao = false;
		
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o nome do doador: ");
		nome = leia.next();
		
		System.out.println("Digite a idade do doador: ");
		idade = leia.nextInt();
		
		System.out.println("Primeira vez doando sangue? [1] SIM [2] NAO ");
		respPrimeiraDoacao = leia.nextInt();
		
		if(respPrimeiraDoacao == 1) {
			primeiraDoacao = true;
		}
		
		
		if (idade >= 18){
			if (idade >= 60 && idade <= 69) {
				if (primeiraDoacao != true) {
					System.out.println(nome + " Está apto para doar sangue.");
					return;
				} else {
					System.out.println(nome + " Nao está apto para doar sangue");
					return;
				}
			}
		  System.out.println(nome + " Está apto para doar sangue.");
		} else { 
			System.out.println(nome + " Nao está apto para doar sangue.");
		}
		
		  
	} 

}
