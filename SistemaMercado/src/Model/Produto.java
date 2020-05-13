package Model;

public class Produto {
	int ID;
	String nome;
	int Qtd;
	Double preco;
	int codigo;
	
	public void setID(int id) {
		this.ID = id;	
	}
	public int getId() {
		return ID;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	
	public void setQtd(int qtd) {
		this.Qtd=qtd;
	}
	public int getQtd() {
		return Qtd;
	}
	
	public void setpreco(Double preco) {
		this.preco = preco;
	}
	public Double getpreco() {
		return preco;
	}
	public void setcodigo(int codigo) {
		this.codigo = codigo;
		
	}
	public int getcodigo(){
		return codigo;
		
		
	}
	

}
