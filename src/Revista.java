
public class Revista implements Produto, Promocional {
	
	private String nome;
	private String descricao;
	private double valor;
	private Editora editora;
	
	public boolean aplicarDesconto(double porcentagem) {
		if (porcentagem < 15) {
			this.valor = this.valor - (this.valor * porcentagem/100);
			return true;
		}
		return false;
	}
	
	//getters e setters
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
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Editora getEditora() {
		return editora;
	}
	public void setEditora(Editora editora) {
		this.editora = editora;
	}
}
