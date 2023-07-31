package user;

public class Produto {
	
	String nome;
	String categoria;
	String marca;
	double preco;
	double desconto;
	
	
	public Produto(String nome, String categoria, String marca, double preco) {
		this.nome = nome;
		this.categoria = categoria;
		this.marca = marca;
		this.preco = preco;
		this.desconto = desconto;
	}





	public String getNome() {
		return nome;
	}


	public String getCategoria() {
		return categoria;
	}


	public String getMarca() {
		return marca;
	}
	
	public double getpreco() {
		return preco;
	}
	
	public double getdesconto() {
		return desconto;
	}


    public void setNome(String nome) {
		this.nome = nome;
	}





	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}





	public void setMarca(String marca) {
		this.marca = marca;
	}





	public void setPreco(double preco) {
		this.preco = preco;
	}





	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
	public void setporcentagem(float porcentagem) {
		this.calcularPorcentagem(porcentagem, porcentagem);
	}
	

	public float calcularPorcentagem(double getpreco, double getdesconto) {
		float porcentagem;
		porcentagem = (float) (((getdesconto - getpreco) / getpreco)/100);
		return porcentagem;
	}

}
