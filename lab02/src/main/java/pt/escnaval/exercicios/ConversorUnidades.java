package main.java.pt.escnaval.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ConversorUnidades {
	// Métodos "puros" (sem I/O)
	public static double kmToMi(double km) {
		return km * 0.6214;
	}

	public static double miToKm(double mi) {
		return mi * 1.609;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);

		int opcao = 0;
		while (true) {
			System.out.println("Menu:");
			System.out.println("1) km → mi");
			System.out.println("2) mi → km");
			System.out.print("Escolha a opção (1 ou 2): ");
			String linha = sc.nextLine();
			try {
				opcao = Integer.parseInt(linha.trim());
				if (opcao == 1 || opcao == 2) break;
			} catch (NumberFormatException e) {}
			System.out.println("Opção inválida. Tente novamente.");
		}

		double valor = 0;
		while (true) {
			if (opcao == 1)
				System.out.print("Introduza o valor em km: ");
			else
				System.out.print("Introduza o valor em mi: ");
			String linha = sc.nextLine();
			try {
				valor = Double.parseDouble(linha.trim());
				break;
			} catch (NumberFormatException e) {
				System.out.println("Valor inválido. Tente novamente.");
			}
		}

		if (opcao == 1) {
			double mi = kmToMi(valor);
			System.out.printf(Locale.US, "%.3f km = %.3f mi\n", valor, mi);
		} else {
			double km = miToKm(valor);
			System.out.printf(Locale.US, "%.3f mi = %.3f km\n", valor, km);
		}
		sc.close();
	}
}
