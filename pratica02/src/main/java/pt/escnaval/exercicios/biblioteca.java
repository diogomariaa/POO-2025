package main.java.pt.escnaval.exercicios;

import java.util.ArrayList;

class Livro {
	private String titulo;
	private String autor;
	private int anoPublicacao;
	private String genero;
	private boolean disponibilidade;

	// Construtor completo
	public Livro(String titulo, String autor, int anoPublicacao, String genero, boolean disponibilidade) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
		this.genero = genero;
		this.disponibilidade = disponibilidade;
	}

	// Construtor apenas com título e autor
	public Livro(String titulo, String autor) {
		this(titulo, autor, 0, "Desconhecido", true);
	}

	// Getters
	public String getTitulo() { return titulo; }
	public String getAutor() { return autor; }
	public int getAnoPublicacao() { return anoPublicacao; }
	public String getGenero() { return genero; }
	public boolean isDisponivel() { return disponibilidade; }

	// Setters
	public void setTitulo(String titulo) { this.titulo = titulo; }
	public void setAutor(String autor) { this.autor = autor; }
	public void setAnoPublicacao(int ano) { this.anoPublicacao = ano; }
	public void setGenero(String genero) { this.genero = genero; }
	public void setDisponibilidade(boolean disponibilidade) { this.disponibilidade = disponibilidade; }

	// Método formatado
	public String infoFormatada() {
		return String.format("Título: %s\nAutor: %s\nAno de Publicação: %d\nGênero: %s\nDisponibilidade: %s",
				titulo, autor, anoPublicacao, genero, disponibilidade ? "Disponível" : "Indisponível");
	}
}

public class biblioteca {
	public static void main(String[] args) {
		// Três instâncias usando diferentes construtores
		Livro l1 = new Livro("1984", "George Orwell", 1949, "Distopia", true);
		Livro l2 = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943, "Fábula", false);
        Livro l3 = new Livro("Dom Quixote", "Miguel de Cervantes", 1605, "Romance", false);

		System.out.println("Livro 1:\n" + l1.infoFormatada());
		System.out.println("\nLivro 2:\n" + l2.infoFormatada());
		System.out.println("\nLivro 3:\n" + l3.infoFormatada());

		// Coleção de 10 livros dummy
		ArrayList<Livro> livros = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			livros.add(new Livro("Livro Dummy " + i, "Autor Dummy " + i));
		}

		System.out.println("\nColeção de livros:");
		int idx = 1;
		for (Livro livro : livros) {
			System.out.println("\nLivro " + idx + ":\n" + livro.infoFormatada());
			idx++;
		}
	}
}
