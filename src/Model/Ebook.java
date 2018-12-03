package Model;

public class Ebook extends Livro implements Promocional {

	private String waterMark;
	
	public Ebook(){
	}
	
	/**
	 * Construtor herdado da classe pai: Livro.
	 * 
	 * @param isbn
	 * @param nome
	 * @param descricao
	 * @param valor
	 * @param autor
	 */
	public Ebook(String isbn, String nome, String descricao, double valor, Autor autor) {
		super(isbn, nome, descricao, valor, autor);
	}

	// Método que calcula o desconto de no máximo 15% na compra do Ebook.
	@Override
	public boolean aplicarDesconto(double valorDesconto) {
		if (valorDesconto > 15) {
			return false;
		}

		this.setValor(this.getValor() - this.getValor() * (valorDesconto / 100));
		return true;
	}

	// Get's e set's.
	public String getWaterMark() {
		return waterMark;
	}

	public void setWaterMark(String waterMark) {
		this.waterMark = waterMark;
	}

}
