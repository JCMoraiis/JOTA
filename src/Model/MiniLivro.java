package Model;

public class MiniLivro extends Livro implements Produto {

	/**
	 * Construtor necessário para a criação de um MiniLivro que herda da classe
	 * pai: Livro.
	 * 
	 * @param isbn
	 * @param nome
	 * @param descricao
	 * @param valor
	 * @param autor
	 */
	public MiniLivro(String isbn, String nome, String descricao, double valor, Autor autor) {
		super(isbn, nome, descricao, valor, autor);
	}
}
