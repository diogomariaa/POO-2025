package main.java.pt.escnaval.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class CalcCLI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);

		double a = 0, b = 0;
		String op = "";

		// Ler a
		while (true) {
			System.out.print("Introduza o primeiro número: ");
			String linha = sc.nextLine();
			try {
				a = Double.parseDouble(linha.trim());
				break;
			} catch (NumberFormatException e) {
				System.out.println("Valor inválido. Tente novamente.");
			}
		}

		// Ler b
		while (true) {
			System.out.print("Introduza o segundo número: ");
			String linha = sc.nextLine();
			try {
				b = Double.parseDouble(linha.trim());
				break;
			} catch (NumberFormatException e) {
				System.out.println("Valor inválido. Tente novamente.");
			}
		}

		// Ler operador
		while (true) {
			System.out.print("Introduza o operador (+, -, *, /, %): ");
			op = sc.nextLine().trim();
			if (op.matches("[-+*/%]")) {
				break;
			} else {
				System.out.println("Operador inválido. Tente novamente.");
			}
		}

		// Calcular
		double resultado = 0;
		boolean erro = false;
		switch (op) {
			case "+":
				resultado = a + b;
				break;
			case "-":
				resultado = a - b;
				break;
			case "*":
				resultado = a * b;
				break;
			case "/":
				if (b == 0) {
					System.out.println("Erro: divisão por zero não permitida.");
					erro = true;
				} else {
					resultado = a / b;
				}
				break;
			case "%":
				if (b == 0) {
					System.out.println("Erro: módulo por zero não permitido.");
					erro = true;
				} else {
					resultado = a % b;
				}
				break;
		}

		if (!erro) {
			System.out.printf("Resultado: %.4f\n", resultado);
		}
		sc.close();
	}
}
