package main.java.pt.escnaval.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class LeituraRobusta {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);

		int n = 0;
		double x = 0.0;
		String texto = "";

		// Ler inteiro
		while (true) {
			System.out.print("Introduza um inteiro: ");
			String linha = sc.nextLine();
			try {
				n = Integer.parseInt(linha.trim());
				break;
			} catch (NumberFormatException e) {
				System.out.println("Valor inválido. Tente novamente.");
			}
		}

		// Ler double
		while (true) {
			System.out.print("Introduza um double: ");
			String linha = sc.nextLine();
			try {
				x = Double.parseDouble(linha.trim());
				break;
			} catch (NumberFormatException e) {
				System.out.println("Valor inválido. Tente novamente.");
			}
		}

		// Ler linha de texto
		System.out.print("Introduza uma linha de texto: ");
		texto = sc.nextLine();

		System.out.printf("n = %d, x = %.3f, texto = '%s'%n", n, x, texto);
		sc.close();
	}
}
