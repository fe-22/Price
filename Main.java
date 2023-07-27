package user;

import java.io.IOException;
import java.security.PublicKey;
import java.util.Locale;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) throws IOException {
	
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

		
		String nomeUsuario;
		String regiao;
		String numeroDeTelefone;
		String cpf;
		
		
		System.out.println("Digite seu nome completo sem abreviação:");
		nomeUsuario = sc.nextLine().trim();
		System.out.println("Digite de qual região do Brasil, você esta buscando um preço negociado:");
		regiao = sc.nextLine().trim();
		System.out.println("Digite o número do seu telefone:");
		numeroDeTelefone = sc.nextLine().trim();
		System.out.println("Digite o número do seu CPF:");
		cpf = sc.nextLine().trim();
		
		

		
		UserData userData = new UserData(nomeUsuario, regiao, numeroDeTelefone, cpf);
		userData.adicionarProdutos();
		userData.mostrarProduto();
			
		sc.close();
		
		}
		
	

	}


