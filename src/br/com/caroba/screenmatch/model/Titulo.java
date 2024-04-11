package br.com.caroba.screenmatch.model;

public class Titulo {
	String titulo;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    public Titulo(String titulo, int anoDeLancamento, boolean incluidoNoPlano, double somaDasAvaliacoes,
			int totalDeAvaliacoes, int duracaoEmMinutos) {
		super();
		this.titulo = titulo;
		this.anoDeLancamento = anoDeLancamento;
		this.incluidoNoPlano = incluidoNoPlano;
		this.somaDasAvaliacoes = somaDasAvaliacoes;
		this.totalDeAvaliacoes = totalDeAvaliacoes;
		this.duracaoEmMinutos = duracaoEmMinutos;
	}
    
    public Titulo() {
    	
    }

	public void exibirFicha(){
        System.out.println("Nome do filme: " + titulo);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    public void avaliar(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

	

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnoDeLancamento() {
		return anoDeLancamento;
	}

	public void setAnoDeLancamento(int anoDeLancamento) {
		this.anoDeLancamento = anoDeLancamento;
	}

	public boolean isIncluidoNoPlano() {
		return incluidoNoPlano;
	}

	public void setIncluidoNoPlano(boolean incluidoNoPlano) {
		this.incluidoNoPlano = incluidoNoPlano;
	}

	public double getSomaDasAvaliacoes() {
		return somaDasAvaliacoes;
	}

	public void setSomaDasAvaliacoes(double somaDasAvaliacoes) {
		this.somaDasAvaliacoes = somaDasAvaliacoes;
	}

	public int getTotalDeAvaliacoes() {
		return totalDeAvaliacoes;
	}

	public void setTotalDeAvaliacoes(int totalDeAvaliacoes) {
		this.totalDeAvaliacoes = totalDeAvaliacoes;
	}

	public int getDuracaoEmMinutos() {
		return duracaoEmMinutos;
	}

	public void setDuracaoEmMinutos(int duracaoEmMinutos) {
		this.duracaoEmMinutos = duracaoEmMinutos;
	}
}
