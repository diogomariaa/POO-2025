package main.java.pt.escnaval.exercicios;

import java.util.Scanner;

public class dolaresparaeuros {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduza a quantia em dólares: ");
		String linha = sc.nextLine();
		try {
			double dolares = Double.parseDouble(linha.trim());
			double euros = (dolares / 1.2) - 2.0;
			System.out.printf("%.2f dólares = %.2f euros (comissão de 2 euros incluída)\n", dolares, euros);
		} catch (NumberFormatException e) {
			System.out.println("Valor inválido.");
		}
		sc.close();
	}
}
