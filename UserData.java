package user;

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
				
				System.out.println(("Digite a marca d produto:"));
				String marca = sc.nextLine().trim();
				
				Produto produto = new Produto(nome, categoria, marca);
				listaDeProdutos.add(produto);
			     
		
		}
			
			System.out.println("Nome do Usúario:" + nomeUsuario);
			System.out.println("Região onde foi negociado o produto:" + regiao);
			System.out.println("Contato do usúario:" + numeroDeTelefone);
			System.out.println("Número do cpf:" + cpf);

	    
	}
	
	public void mostrarProduto() {
		for(Produto produto : listaDeProdutos) {
			System.out.println("Nome:" + produto.getNome());
			System.out.println("Categoria:" + produto.getCategoria());
			System.out.println("Marca:" + produto.getMarca());
			System.out.println();
		}
	}

}
