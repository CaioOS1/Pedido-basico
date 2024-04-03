package entities;

import entities.Produto;

public class OrdemPedido {
	
	private Integer quantidade;
	private Double preco;
	
	private Produto produto;

	
	public OrdemPedido(Integer quantidade, Double preco, Produto produto) {

		this.quantidade = quantidade;
		this.preco = preco;
		this.produto = produto;
	}

	public OrdemPedido() {
	}


	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	
	public double subTotal () {
		return quantidade * preco;
	}
	
	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	@Override
	public String toString() {
		return getProduto().getNome()
				+", $"
				+String.format("%.2f", preco)
		 		+", Quantidade: "
				+quantidade
				+", SubTotal : $"
				+String.format("%.2f", subTotal());
	}
}
	
