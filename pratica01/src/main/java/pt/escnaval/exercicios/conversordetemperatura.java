package main.java.pt.escnaval.exercicios;

import java.util.Scanner;

public class conversordetemperatura {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduza a temperatura: ");
		String tempStr = sc.nextLine();
		System.out.print("Introduza o tipo ('C' para Celsius ou 'F' para Fahrenheit): ");
		String tipoStr = sc.nextLine().trim().toUpperCase();
		try {
			double temp = Double.parseDouble(tempStr.trim());
			if (tipoStr.equals("C")) {
				double f = 1.8 * temp + 32;
				System.out.printf("%.1fº Celsius é equivalente a %.1fº Fahrenheit\n", temp, f);
			} else if (tipoStr.equals("F")) {
				double c = (temp - 32) / 1.8;
				System.out.printf("%.1fº Fahrenheit é equivalente a %.1fº Celsius\n", temp, c);
			} else {
				System.out.println("Tipo inválido. Use 'C' ou 'F'.");
			}
		} catch (NumberFormatException e) {
			System.out.println("Valor de temperatura inválido.");
		}
		sc.close();
	}
}
