package main.java.pt.escnaval.exercicios;

import java.util.Scanner;

public class estatisticasproducao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = 0;
		int dias = 0;
		int diasBaixaProducao = 0;

		System.out.println("Introduza o nº de peças produzidas por dia (-1 para terminar):");
		while (true) {
			String linha = sc.nextLine();
			try {
				int valor = Integer.parseInt(linha.trim());
				if (valor == -1) break;
				total += valor;
				dias++;
				if (valor < 250) diasBaixaProducao++;
			} catch (NumberFormatException e) {
				System.out.print("Valor inválido. Tente novamente: ");
			}
		}

		if (dias > 0) {
			double media = (double) total / dias;
			System.out.printf("Total de peças produzidas: %d\n", total);
			System.out.printf("Média de peças por dia: %.2f\n", media);
			System.out.printf("Dias com produção inferior a 250 peças: %d\n", diasBaixaProducao);
		} else {
			System.out.println("Nenhum dia registado.");
		}
		sc.close();
	}
}
