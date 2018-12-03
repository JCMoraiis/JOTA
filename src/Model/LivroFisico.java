package Model;

public class LivroFisico extends Livro implements Promocional {

	/**
	 * Construtor herdado da classe pai: Livro.
	 * 
	 * @param isbn
	 * @param nome
	 * @param descricao
	 * @param valor
	 * @param autor
	 */
	public LivroFisico(String isbn, String nome, String descricao, double valor, Autor autor) {
		super(isbn, nome, descricao, valor, autor);
	}

	// Método que aplica e limita o desconto que pode ser aplicado em 30%.
	@Override
	public boolean aplicarDesconto(double valorDesconto) {
		if (valorDesconto > 30) {
			return false;
		}
		this.setValor(this.getValor() * (valorDesconto / 100));
		return true;
	}

	public double getTaxaImpressao() {
		return this.getValor() * 0.05;
	}
}
