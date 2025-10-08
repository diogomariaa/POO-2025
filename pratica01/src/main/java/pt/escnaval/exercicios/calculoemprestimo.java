package main.java.pt.escnaval.exercicios;

import java.util.Scanner;

public class calculoemprestimo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Valor do empréstimo (euros): ");
		float valorEmprestimo = lerFloat(sc);

		System.out.print("Duração (anos): ");
		float numAnos = lerFloat(sc);

		System.out.print("Taxa de juro anual (entre 0 e 1): ");
		float taxaJuro = lerFloat(sc);

		float jurosMes = taxaJuro / 12.0f;
		float baseMes = 1.0f + jurosMes;
		int numMeses = (int)(numAnos * 12);

		float mensalidade = (jurosMes * (float)Math.pow(baseMes, numMeses) * valorEmprestimo) /
				((float)Math.pow(baseMes, numMeses) - 1);
		float totalAPagar = mensalidade * numMeses;

		System.out.printf("Mensalidade: %.2f euros\n", mensalidade);
		System.out.printf("Total a pagar: %.2f euros\n", totalAPagar);
		sc.close();
	}

	private static float lerFloat(Scanner sc) {
		while (true) {
			String linha = sc.nextLine();
			try {
				return Float.parseFloat(linha.trim());
			} catch (NumberFormatException e) {
				System.out.print("Valor inválido. Tente novamente: ");
			}
		}
	}
}
