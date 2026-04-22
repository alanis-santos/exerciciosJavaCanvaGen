package ExercicioLacoCondicional;

import java.util.Scanner;

public class ExercicioDoisSwitchCase {

	public static void main(String[] args) {
		float valorTotal, numero1, numero2;
		int operacao;
		Scanner leia = new Scanner(System.in);

		System.out.println("# ## ### #### #########   Calculadora   ########## #### ### ## #");
		System.out.println("1: Soma");
		System.out.println("2: Divisao");
		System.out.println("3: Multiplicacao");
		System.out.println("4: Subtracao");
		
		System.out.println("Digite o primeiro numero");
		numero1 = leia.nextFloat();
		System.out.println("Digite o segundo numero");
		numero2 = leia.nextFloat();
		System.out.println("Digite o numero da operacao de acordo com a tabela:");
		operacao = leia.nextInt();
		
		switch(operacao) {
		case 1:
			System.out.println(numero1 + "+" + numero2 + "=" + (numero1 + numero2));
			break;
		case 2:
			System.out.println(numero1 + "/" + numero2 + "=" + (numero1 / numero2));
			break;
		case 3:
			System.out.println(numero1 + "x" + numero2 + "=" + (numero1 * numero2));
			break;
		case 4:
			System.out.println(numero1 + "-" + numero2 + "=" + (numero1 - numero2));
			break;
		default:
			System.out.println("Operacao invalida!");

		}
		
		
	}

}
