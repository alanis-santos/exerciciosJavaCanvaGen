package exercicioCollections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Scanner;

public class ExercicioUmPilha {

	public static void main(String[] args) {

		Deque<String> pilha = new ArrayDeque<>();
		Scanner leia = new Scanner(System.in);
		int opcao;

		do {
			System.out.println("\n===== MENU =====");
			System.out.println("1 - Adicionar livro: ");
			System.out.println("2 - Listar livros: ");
			System.out.println("3 - Retirar livro: ");
			System.out.println("0 - Sair: ");
			System.out.print("Escolha a opção desejada: ");

			opcao = leia.nextInt();
			leia.nextLine();

			switch (opcao) {

			case 1:
				System.out.print("Digite o nome do livro: ");
				String livro = leia.nextLine();
				pilha.push(livro);

				System.out.println("Livro adicionado!");
				break;

			case 2:
				if (pilha.isEmpty()) {
					System.out.println("A pilha está vazia!");
				} else {
					System.out.println("Livros na pilha:");

					Iterator<String> iterator = pilha.iterator();
					while (iterator.hasNext()) {
						System.out.println(iterator.next());
					}
				}
				break;

			case 3:
				if (pilha.isEmpty()) {
					System.out.println("A pilha está vazia!");
				} else {
					String removido = pilha.pop();
					System.out.println("Livro retirado: " + removido);
				}
				break;

			case 0:
				System.out.println("Programa finalizado!");
				break;

			default:
				System.out.println("Opção inválida!");
			}

		} while (opcao != 0);
	}

}
