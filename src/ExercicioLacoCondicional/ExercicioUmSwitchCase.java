package ExercicioLacoCondicional;

import java.util.Scanner;

public class ExercicioUmSwitchCase {

	public static void main(String[] args) {
		
		int produto, quantidade;
		float valorTotal;
		Scanner leia = new Scanner(System.in);

		System.out.println("# ## ### #### #########   Produto   ########## #### ### ## #");
		System.out.println("1: Cachorro Quente");
		System.out.println("2: X-Salada");
		System.out.println("3: X-Bacon ");
		System.out.println("4: Bauru");
		System.out.println("5: Refrigerante");
		System.out.println("6: Suco de Laranja");
		System.out.println("Digite o número do produto que deseja: ");
		produto = leia.nextInt();
		
		System.out.println("Digite a quantidade que deseja: ");
		quantidade = leia.nextInt();
		
		switch (produto) {
		case 1:
			valorTotal = quantidade * 10.00f;
			System.out.println("Cachorro quente");
			System.out.println("Valor Total: " + valorTotal);
			break;
		
		case 2:
			valorTotal = quantidade * 15.00f;
			System.out.println("X-Salada");
			System.out.println("Valor Total: " + valorTotal);
			break;
		case 3:
			valorTotal = quantidade * 18.00f;
			System.out.println("X-Bacon");
			System.out.println("Valor Total: " + valorTotal);
			break;
		case 4:
			valorTotal = quantidade * 12.00f;
			System.out.println("Bauru");
			System.out.println("Valor Total: " + valorTotal);
			break;	
		case 5:
			valorTotal = quantidade * 8.00f;
			System.out.println("Refrigerante");
			System.out.println("Valor Total: " + valorTotal);
			break;
		case 6:
			valorTotal = quantidade * 13.00f;
			System.out.println("Suco de Laranja");
			System.out.println("Valor Total: " + valorTotal);
			break;
		default:
			System.out.println("Opcão Inválida.");
		}
		
		
	}

}
