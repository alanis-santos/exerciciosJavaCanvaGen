package exercicioVetor;

import java.util.Scanner;

public class ExercicioUmVetor {

	public static void main(String[] args) {
		
		int vetorNumero [] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int valorUsuario;
		boolean encontrado = false;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o número que voce deseja encontrar: ");
		valorUsuario = leia.nextInt();
		
          for (int j = 0; j <=9; j++) {
        	 
        	  
        if (valorUsuario == vetorNumero[j]) { 
        	  System.out.println("O número está localizado na posiçao: " + j);
        	  encontrado = true;
          }
        
        }
          if (encontrado == false) {
        	  System.out.println("O número " + valorUsuario + " nao foi encontrado!");
          }
       }
         
	}


