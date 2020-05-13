package Model;

public class ProdutoUpdate {
	int ID;
	String novonome;
	int novoQtd;
	Double novopreco;
	
	public void setID(int id) {
		this.ID = id;	
	}
	public int getId() {
		return ID;
	}
	
	public void setnovoNome(String nome) {
		this.novonome = nome;
	}
	public String getnovoNome() {
		return novonome;
	}
	
	public void setnovoQtd(int qtd) {
		this.novoQtd=qtd;
	}
	public int getnovoQtd() {
		return novoQtd;
	}
	
	public void setnovopreco(Double preco) {
		this.novopreco = preco;
	}
	public Double getnovopreco() {
		return novopreco;
	}

}
