package exercicioCanva;

import java.util.Scanner;

public class ExercicioDois {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float salarioBruto, adicionalNoturno, horasExtras, descontos;
		
		System.out.println("Digite o salário bruto: ");
		salarioBruto = leia.nextFloat();
		
		System.out.println("Digite o adicional noturno: ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.println("Digite as horas extras: ");
		horasExtras = leia.nextFloat();
		
		System.out.println("Digite o descontos: ");
		descontos = leia.nextFloat();
		
		float salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		
		System.out.print("Salário liquido: " + salarioLiquido);
		
	}

}
