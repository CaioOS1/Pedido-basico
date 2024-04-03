package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import entities.Cliente;
import entities.OrdemPedido;
import entities.Pedido;
import entities.Produto;
import entities.enums.StatusPedido;

public class Programa {
	
	public static void main (String args[]) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
		
		
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);		
		
		
		System.out.println("Digite os dados do cliente:");
		System.out.print("Nome: ");
		String nome = s.nextLine();
		System.out.print("Email:");
		String Email = s.nextLine();
		System.out.print("Data de nascimento: ex(**/**/****)" );
		Date nascimento = sdf.parse(s.next());
		
		Cliente cliente = new Cliente (nome, Email, nascimento);
		
		System.out.println("Digite os dados do pedido: ");
		System.out.print("Status do pedido: ");
		StatusPedido status = StatusPedido.valueOf(s.next());
		
		Pedido ped = new Pedido(new Date(), status, cliente, null);
		
		System.out.println("Quantos itens serão pedidos: ");
		int N = s.nextInt();
		for(int i=1; i<=N; i++) {
			System.out.println("Digite o " + (i) + "º pedido: ");
			System.out.print("Qual o produto: ");
			s.nextLine();
			String produtoNome = s.nextLine();
			System.out.print("Qual o valor do produto: ");
			double produtopreco = s.nextDouble();
			System.out.print("Qual a quantidade desejada: ");
			int quantidade = s.nextInt();	
			
			Produto produto = new Produto(produtoNome, produtopreco);
			OrdemPedido op = new OrdemPedido(quantidade, produtopreco, produto);
			ped.addItem(op);
		}
		
		System.out.println();
		System.out.println("--------------------------------------");
		System.out.println();
		System.out.println("RESUMO DO PEDIDO");
		System.out.println();
		System.out.println(ped);
		System.out.println("--------------------------------------");
		
		
		
		s.close();
		
	}

}
