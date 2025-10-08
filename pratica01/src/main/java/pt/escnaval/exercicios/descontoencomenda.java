package main.java.pt.escnaval.exercicios;

import java.util.Scanner;

public class descontoencomenda {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Número de peças encomendadas: ");
		int numPecas = lerInt(sc);
		System.out.print("Preço unitário (euros): ");
		double precoUnitario = lerDouble(sc);

		double valorTotal = numPecas * precoUnitario;
		double desconto;
		if (valorTotal < 2000) {
			desconto = 0.02;
		} else if (valorTotal < 5000) {
			desconto = 0.04;
		} else {
			desconto = 0.075;
		}
		double valorDesconto = valorTotal * desconto;
		double valorFinal = valorTotal - valorDesconto;

		System.out.printf("Valor total: %.2f euros\n", valorTotal);
		System.out.printf("Desconto aplicado: %.1f%%\n", desconto * 100);
		System.out.printf("Valor a pagar: %.2f euros\n", valorFinal);
		sc.close();
	}

	private static int lerInt(Scanner sc) {
		while (true) {
			String linha = sc.nextLine();
			try {
				return Integer.parseInt(linha.trim());
			} catch (NumberFormatException e) {
				System.out.print("Valor inválido. Tente novamente: ");
			}
		}
	}

	private static double lerDouble(Scanner sc) {
		while (true) {
			String linha = sc.nextLine();
			try {
				return Double.parseDouble(linha.trim());
			} catch (NumberFormatException e) {
				System.out.print("Valor inválido. Tente novamente: ");
			}
		}
	}
}
