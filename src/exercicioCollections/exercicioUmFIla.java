package exercicioCollections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class exercicioUmFIla {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>();
		int opcaoDesejada = 0;
		String nome = null;

		Scanner leia = new Scanner(System.in);

		do {
			System.out.println("\n========== MENU ==========\n");
			System.out.println(
					"1- Adicionar cliente na fila: \n2- Listar todos os clientes: \n3- Retirar cliente da fila: \n0- Sair: \n");
			System.out.println("Entre com a opção desejada: ");
			opcaoDesejada = leia.nextInt();

			if (opcaoDesejada == 1) {
				System.out.print("Digite um nome: ");
				nome = leia.next();
				fila.add(nome);
				System.out.print("Fila: \n ");

				Iterator<String> iterator = fila.iterator();
				while (iterator.hasNext()) {
					System.out.print(iterator.next() + "\n");
				}
				System.out.print("\nCliente adicionado!");

			} else if (opcaoDesejada == 2) {
				System.out.print("Clientes na fila: \n");
				Iterator<String> iterator = fila.iterator();
				while (iterator.hasNext()) {
					System.out.print(iterator.next() + "\n");
					
				}
			} else if (opcaoDesejada == 3) {
				fila.poll();
				System.out.print("Clientes na fila: \n");
				Iterator<String> iterator = fila.iterator();
				while (iterator.hasNext()) {
					System.out.print(iterator.next()  + "\n");
				
			}
		}
		} while (opcaoDesejada != 0);

		System.out.print("\nFinalizado :) ");
		
		
		
     }
   }

