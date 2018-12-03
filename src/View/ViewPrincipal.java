package View;

import java.util.Scanner;

public class ViewPrincipal {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int opcaoInicial = 1;

		int cont = 1;

		while (cont == 1) {

			// Tela inicial.
			System.out.println("        JOTA - Sua loja de livros.        ");
			System.out.println("                                          ");
			System.out.println("Escolha uma opção: ");
			System.out.println("(1) Gerenciamento de Produtos");
			System.out.println("(2) Compra de Produtos");
			opcaoInicial = entrada.nextInt();

			if (opcaoInicial == 1) {

				System.out.println("                                          ");
				System.out.println("        JOTA - Sua loja de livros.        ");
				System.out.println("                                          ");
				System.out.println("Gerenciamento de Produtos");
				System.out.println("Escolha uma opção: ");
				System.out.println("(1) Cadastrar Produto");
				System.out.println("(2) Editar Produto");
				System.out.println("(3) Excluir Produto");
				int opcaoGerenciamento = entrada.nextInt();
				
				switch (opcaoGerenciamento) {
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				default:
					break;
				}

			} else if (opcaoInicial == 2) {

				System.out.println("                                          ");
				System.out.println("        JOTA - Sua loja de livros.        ");
				System.out.println("                                          ");
				System.out.println("Compra de Produtos");
				System.out.println("Escolha uma opção: ");
				System.out.println("(1) Listar produtos");
				System.out.println("(2) Selecionar produto para compra");
				int opcaoCompra = entrada.nextInt();

				switch (opcaoCompra) {
				case 1:
					break;
				case 2:
					break;
				default:
					break;
				}

			}

		}

	}
}
	


