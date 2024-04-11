package br.com.caroba.screenmatch.model;

public class Filme extends Titulo {
	private String diretor;

	public Filme(String titulo, int anoDeLancamento, boolean incluidoNoPlano, double somaDasAvaliacoes,
			int totalDeAvaliacoes, int duracaoEmMinutos, String diretor) {
		super(titulo, anoDeLancamento, incluidoNoPlano, somaDasAvaliacoes, totalDeAvaliacoes, duracaoEmMinutos);
		this.diretor = diretor;
	}
	
	public Filme() { // construtor vazio
		
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	
	
}
