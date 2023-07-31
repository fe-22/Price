package user;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserData {

	Scanner sc = new Scanner(System.in);

	String nomeUsuario;
	String regiao;
	String numeroDeTelefone;
	String cpf;
	
	


	List<Produto> listaDeProdutos = new ArrayList<>();

	public UserData(String nomeUsuario, String regiao, String numeroDeTelefone, String cpf) {
		this.nomeUsuario = nomeUsuario;
		this.regiao = regiao;
		this.numeroDeTelefone = numeroDeTelefone;
		this.cpf = cpf;

	}

	public void adicionarProdutos() {

		System.out.println("Quantos produtos você quer adicionar?");
		int numProduto = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < numProduto; i++) {
			System.out.println("Digite o nome do produto:");
			String nome = sc.nextLine().trim();

			System.out.println("Digite a categoria do produto:");
			String categoria = sc.nextLine().trim();

			System.out.println(("Digite a marca do produto:"));
			String marca = sc.nextLine().trim();

			System.out.println("Digite o preço:R$");
			double preco = Double.parseDouble(sc.nextLine());

			System.out.println("Digite o valor desejado:R$ ");
			double desconto = Double.parseDouble(sc.nextLine());

			Produto produto = new Produto(nome, categoria, marca, preco);
			listaDeProdutos.add(produto);

			produto.setNome(nome);
			produto.setCategoria(categoria);
			produto.setMarca(marca);
			produto.setPreco(preco);
			produto.setDesconto(desconto);
			
			System.out.println("Nome:" + produto.getNome());
			System.out.println("categoria:" + produto.getCategoria());
			System.out.println("Marca:" + produto.getMarca());
			System.out.println("preço:" + produto.getpreco());
			System.out.println("Desconto:" + produto.getdesconto());
			System.out.println("Porcentagem do valor em desconto: %" + produto.calcularPorcentagem(preco, desconto));
	
		}
		
	}
		
				

}




