package cardapio;

public class Mercadoria {

	private double valorBauruS ;
	private double valorBauruCO ;
	private double hamburguer ;
	private double cheeseburguer ;
	private double refrigerante ;
	private double valorCQ;
	private double valorTotal;
	
	
	public double getValorCQ() {
		return valorCQ;
	}

	public double setValorCQ(double valorCQ) {
		this.valorCQ = valorCQ;
		return this.valorCQ;
	}

	public Mercadoria() {
		super();
	
		this.valorBauruS = valorBauruS;
		this.valorBauruCO = valorBauruCO;
		this.hamburguer = hamburguer;
		this.cheeseburguer = cheeseburguer;
		this.refrigerante = refrigerante;
	}

	public double getValorBauruS() {
		return valorBauruS;
	}
	public void setValorBauruS(double valorBauruS) {
		this.valorBauruS = valorBauruS;
	}
	public double getValorBauruCO() {
		return valorBauruCO;
	}
	public void setValorBauruCO(double valorBauruCO) {
		this.valorBauruCO = valorBauruCO;
	}
	public double getHamburguer() {
		return hamburguer;
	}
	public void setHamburguer(double hamburguer) {
		this.hamburguer = hamburguer;
	}
	public double getCheeseburguer() {
		return cheeseburguer;
	}
	public void setCheeseburguer(double cheeseburguer) {
		this.cheeseburguer = cheeseburguer;
	}
	public double getRefrigerante() {
		return refrigerante;
	}
	public void setRefrigerante(double refrigerante) {
		this.refrigerante = refrigerante;
	}

	
	public double calculaPedido(int qtde, double valor) {
		this.valorTotal = qtde * valor;
		return this.valorTotal;
	}
	
	public double calcVtotalPedido(double calcPedido) {
		
		this.valorTotal = calcPedido;
		return this.valorTotal;
		//tarefinha ver pq valortotal já faz a soma por produto.
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
}
