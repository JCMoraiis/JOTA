
public class CarrinhoDeCompras {
	private double total;

	/**
	 * Método que soma o total contido no carrinho de compras.
	 * 
	 * @param livro
	 */
	public void adicionaLivro(Livro livro) {
		System.out.println("Adicionando: " + livro);
		total += livro.getValor();
	}

	public double getTotal() {
		return total;
	}
}
