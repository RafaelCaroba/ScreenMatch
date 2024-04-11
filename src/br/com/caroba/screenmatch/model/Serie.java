package br.com.caroba.screenmatch.model;

public class Serie extends Titulo {
	private int temporadas;
	private int episodiosTemporada;
	private boolean ativa;
	private int minutosPorEpisodio;
	
	public Serie(String titulo, int anoDeLancamento, boolean incluidoNoPlano, double somaDasAvaliacoes,
			int totalDeAvaliacoes, int duracaoEmMinutos, int temporadas, int episodiosTemporada, boolean ativa,
			int minutosPorEpisodio) {
		super(titulo, anoDeLancamento, incluidoNoPlano, somaDasAvaliacoes, totalDeAvaliacoes, duracaoEmMinutos);
		this.temporadas = temporadas;
		this.episodiosTemporada = episodiosTemporada;
		this.ativa = ativa;
		this.minutosPorEpisodio = minutosPorEpisodio;
	}
	
	public Serie () {
		
	}

	public int getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}

	public int getEpisodiosTemporada() {
		return episodiosTemporada;
	}

	public void setEpisodiosTemporada(int episodiosTemporada) {
		this.episodiosTemporada = episodiosTemporada;
	}

	public boolean isAtiva() {
		return ativa;
	}

	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}

	public int getMinutosPorEpisodio() {
		return minutosPorEpisodio;
	}

	public void setMinutosPorEpisodio(int minutosPorEpisodio) {
		this.minutosPorEpisodio = minutosPorEpisodio;
	}
	
	@Override
	public int getDuracaoEmMinutos() {
		return temporadas * episodiosTemporada * minutosPorEpisodio;
	}
}
