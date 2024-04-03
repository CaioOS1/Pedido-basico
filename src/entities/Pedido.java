package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.StatusPedido;

public class Pedido {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
	private Date momento;
	private StatusPedido status;	
	
	private Cliente cliente;
	
	private List<OrdemPedido> Itens = new ArrayList<OrdemPedido>();
	
	public Pedido() {		
	}

	public Pedido(Date momento, StatusPedido status, Cliente cliente, List<OrdemPedido> itens) {
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	
	public void addItem(OrdemPedido Item) {
		Itens.add(Item);
}
	public void removeItem(OrdemPedido Item) {
		Itens.remove(Item);
	}
	public double total() {
		double soma = 0.0;
		for (OrdemPedido op : Itens) {
			soma += op.subTotal();
			}
		return soma;
	}
	 
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Data pedido: ");
		sb.append(sdf.format(momento) + "\n");
		sb.append("Status do Pedido: ");
		sb.append(status + "\n");
		sb.append("Cliente: ");
		sb.append(cliente + "\n");
		sb.append("Pedido:\n");
		for (OrdemPedido item : Itens) {
			sb.append(item + "\n");
		}
		sb.append("Valor Total: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
		
		}
	
	 

}
