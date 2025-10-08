package main.java.pt.escnaval.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class EstatisticasSimples {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);

		int n = 0;
		double soma = 0, min = Double.POSITIVE_INFINITY, max = Double.NEGATIVE_INFINITY;

		while (true) {
			System.out.print("Valor (enter para terminar): ");
			String linha = sc.nextLine();
			if (linha.trim().isEmpty()) break;
			try {
				double v = Double.parseDouble(linha.trim());
				n++;
				soma += v;
				if (v < min) min = v;
				if (v > max) max = v;
			} catch (NumberFormatException e) {
				// Ignorar não numéricos
			}
		}

		if (n > 0) {
			double media = soma / n;
			System.out.printf(Locale.US, "n=%d, soma=%.3f, média=%.3f, min=%.3f, max=%.3f\n", n, soma, media, min, max);
		} else {
			System.out.println("Nenhum valor numérico inserido.");
		}
		sc.close();
	}
}
