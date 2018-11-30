
public abstract class Livro implements Produto {

	private String isbn;
	private String nome;
	private String descricao;
	private double valor;
	private Autor autor;

	/**
	 * Construtor necessário para criação de um objeto Livro.
	 * 
	 * @param isbn
	 * @param nome
	 * @param descricao
	 * @param valor
	 * @param autor
	 */
	public Livro(String isbn, String nome, String descricao, double valor, Autor autor) {
		this.isbn = isbn;
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
		this.autor = autor;
	}

	/**
	 * Método para mostrar os detalhes que foram cadastrados no Livro.
	 * 
	 * @param livro
	 */
	public void mostrarDetalhes(Livro livro) {
		System.out.println(livro.nome);
		System.out.println(livro.descricao);
		System.out.println(livro.valor);
		System.out.println(livro.isbn);
	}

	// GET's e SET's.
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

}
