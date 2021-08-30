
package cardapio;

import java.util.Scanner;

public class Principal {

	 static double valorBauS = 1.30;
	 static double valorBauCO = 1.50;
	 static double hamb = 1.20;
	 static double cheeseb = 1.30;
	 static double refri = 1.00;
	 static double valorCQ = 1.2;
	 
	public static void main(String[] args) {
		
		double vlrProduto = 0;
		int qtdeProduto = 0;
		int opcao;
		String produto;
		int codigo;
		int quantidade;
		Double vTotal = 0.0;

		Mercadoria mercadoria = new Mercadoria();

		Scanner entrada = new Scanner(System.in);
		Scanner menu = new Scanner(System.in);
		do {

			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			System.out.println("              Cadastro de Pedidos");
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			System.out.println("\n" + "1 - Cadastrar Pedido.\n" + "2 - Encerrar");

			opcao = menu.nextInt();

			switch (opcao) {

			case 1: {

				System.out.println("Digite o codigo do produto:");
				codigo = entrada.nextInt();

				System.out.println("Digite a quantidade do produto");
				quantidade = entrada.nextInt();

				// for (qtdeProduto = 0; qtdeProduto <= 6; qtdeProduto++) {
				if (codigo == 100) {
					double calcProduto = 0.0;
					vlrProduto = mercadoria.setValorCQ(valorCQ);
					calcProduto = mercadoria.calculaPedido(quantidade, vlrProduto);
					mercadoria.calcVtotalPedido(calcProduto);
					//
				}
				if (codigo == 101) {
					
					double calcProduto = 0.0;
					vlrProduto = mercadoria.getValorBauruS();
					calcProduto = mercadoria.calculaPedido(quantidade, vlrProduto);
					vTotal = vTotal + calcProduto;
				}
				if (codigo == 102) {
		
					double calcProduto = 0.0;
					vlrProduto = mercadoria.getValorBauruCO();
					calcProduto = mercadoria.calculaPedido(quantidade, vlrProduto);
					vTotal = vTotal + calcProduto;
				}
				if (codigo == 103) {
	
					double calcProduto = 0.0;
					vlrProduto = mercadoria.getHamburguer();
					calcProduto = mercadoria.calculaPedido(quantidade, vlrProduto);
					vTotal = vTotal + calcProduto;
				}
				if (codigo == 104) {
		
					double calcProduto = 0.0;
					vlrProduto = mercadoria.getCheeseburguer();
					calcProduto = mercadoria.calculaPedido(quantidade, vlrProduto);
					vTotal = vTotal + calcProduto;
				}
				if (codigo == 105) {
//		
					double calcProduto = 0.0;
					vlrProduto = mercadoria.getRefrigerante();
					calcProduto = mercadoria.calculaPedido(quantidade, vlrProduto);
					vTotal = vTotal + calcProduto;
				}

			}

			}
			
		} while (opcao != 2);

		System.out.println("Valor total do pedido:  \n" + mercadoria.getValorTotal());

	}

}
