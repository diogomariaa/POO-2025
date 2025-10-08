package main.java.pt.escnaval.exercicios;

import java.util.Scanner;

public class horasdetrabalho {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduza os horários no formato hh:mm");
		System.out.print("Entrada manhã: ");
		int entradaManha = lerMinutos(sc.nextLine());
		System.out.print("Saída para almoço: ");
		int saidaAlmoco = lerMinutos(sc.nextLine());
		System.out.print("Entrada depois do almoço: ");
		int entradaAlmoco = lerMinutos(sc.nextLine());
		System.out.print("Saída final do dia: ");
		int saidaFinal = lerMinutos(sc.nextLine());

		int minutosManha = saidaAlmoco - entradaManha;
		int minutosTarde = saidaFinal - entradaAlmoco;
		int totalMinutos = minutosManha + minutosTarde;
		int horas = totalMinutos / 60;
		int minutos = totalMinutos % 60;

		System.out.printf("Tempo total trabalhado: %d horas e %d minutos\n", horas, minutos);
		sc.close();
	}

	private static int lerMinutos(String horaStr) {
		try {
			String[] partes = horaStr.trim().split(":");
			int horas = Integer.parseInt(partes[0]);
			int minutos = Integer.parseInt(partes[1]);
			return horas * 60 + minutos;
		} catch (Exception e) {
			System.out.println("Formato inválido. Use hh:mm");
			return 0;
		}
	}
}
