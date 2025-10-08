package main.java.pt.escnaval.exercicios;

import java.util.Scanner;

public class milhasparakm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduza a distância em milhas: ");
		String linha = sc.nextLine();
		try {
			double milhas = Double.parseDouble(linha.trim());
			double km = milhas * 1.609;
			System.out.printf("%.3f milhas = %.3f km\n", milhas, km);
		} catch (NumberFormatException e) {
			System.out.println("Valor inválido.");
		}
		sc.close();
	}
}
