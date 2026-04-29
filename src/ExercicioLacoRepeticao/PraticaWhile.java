package exercicioLacoRepeticao;

import java.util.Scanner;

public class PraticaWhile {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int qntDevBack = 0, qntMulherCisTransFront = 0, qntHomenCisTransMobileMaior40 = 0, 
				qntNBFullstackAte30 = 0, totalPessoas = 0, somaTotalIdade = 0, 
				mediaIdade, idade, genero, areaDev;
		String desejaSeguir = "S";
		
		while(desejaSeguir.equalsIgnoreCase("S")){
			System.out.println("Digite idade: ");
			idade = leia.nextInt();
			
			System.out.println("Identidade de Genero (numero inteiro)\n");
			System.out.println("1 – Mulher Cis\n"
					+ "2 – Homem Cis\n"
					+ "3 – Não Binário\n"
					+ "4 – Mulher Trans\n"
					+ "5 – Homem Trans\n"
					+ "6 – Outros\n"
					+ "");
			genero = leia.nextInt();
			
			System.out.println("Pessoa Desenvolvedora (Número Inteiro):\n");
			System.out.println("1 – Backend\n"
					+ "2 – Frontend\n"
					+ "3 – Mobile\n"
					+ "4 – FullStack\n"
					+ "");
			areaDev = leia.nextInt();
			
			if(areaDev == 1) {
				qntDevBack++;
			}
			if((genero == 1 || genero == 5) && areaDev == 2) {
				qntMulherCisTransFront++;
			}
			if((genero == 2 || genero == 5) && areaDev == 3 && idade >= 40) {
				qntHomenCisTransMobileMaior40++;
			}
			if(genero == 3 && areaDev == 4 && idade <= 30) {
				qntNBFullstackAte30++;
			}
			
			totalPessoas++;
			somaTotalIdade+=idade;
			
			
			System.out.println("Deseja continuar? [S/N]");
			desejaSeguir = leia.next();
		}
		
		mediaIdade = somaTotalIdade / totalPessoas;
		
		System.out.println("O número de pessoas desenvolvedoras Backend: " + qntDevBack + "\n"
				+ "O número de Mulheres Cis e Trans desenvolvedoras Frontend: " + qntMulherCisTransFront + "\n"
				+ "O número de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + qntHomenCisTransMobileMaior40 + "\n"
				+ "O número de Não Binários desenvolvedores FullStack menores de 30 anos: " + qntNBFullstackAte30 + "\n"
				+ "O número total de pessoas que responderam à pesquisa: " + totalPessoas + "\n"
				+ "A média de idade das pessoas que responderam à pesquisa: " + mediaIdade);
		
		
	}

}
