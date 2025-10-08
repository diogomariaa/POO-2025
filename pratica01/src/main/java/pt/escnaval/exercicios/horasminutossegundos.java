package main.java.pt.escnaval.exercicios;

import java.util.Scanner;

public class horasminutossegundos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduza o valor em segundos: ");
		String linha = sc.nextLine();
		try {
			int totalSegundos = Integer.parseInt(linha.trim());
			int horas = totalSegundos / 3600;
			int minutos = (totalSegundos % 3600) / 60;
			int segundos = totalSegundos % 60;
			System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);
		} catch (NumberFormatException e) {
			System.out.println("Valor inválido.");
		}
		sc.close();
	}
}
