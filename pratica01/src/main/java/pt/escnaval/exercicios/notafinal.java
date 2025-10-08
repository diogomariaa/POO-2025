package main.java.pt.escnaval.exercicios;

import java.util.Scanner;

public class notafinal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nota da avaliação periódica (0-20): ");
		double notaPeriodica = lerNota(sc);
		System.out.print("Nota da avaliação final (0-20): ");
		double notaFinal = lerNota(sc);

		double media = notaPeriodica * 0.3 + notaFinal * 0.7;
		System.out.printf("Nota final: %.1f", media);
		if (notaPeriodica < 6 || notaFinal < 6) {
			System.out.print(" - Reprovado por uma das notas ser nota inferior à mínima");
		}
		System.out.println();
		sc.close();
	}

	private static double lerNota(Scanner sc) {
		while (true) {
			String linha = sc.nextLine();
			try {
				double nota = Double.parseDouble(linha.trim());
				if (nota >= 0 && nota <= 20) return nota;
			} catch (NumberFormatException e) {}
			System.out.print("Valor inválido. Introduza uma nota entre 0 e 20: ");
		}
	}
}
