package br.com.caroba.screenmatch;

import br.com.caroba.screenmatch.model.Filme;

public class Main {
	public static void main(String[] args) {
		Filme filme1 = new Filme();
		filme1.setTitulo("Top Gun: Ases Indomáveis");
		filme1.setAnoDeLancamento(1987);
		filme1.setDuracaoEmMinutos(140);
		filme1.setIncluidoNoPlano(true);
		filme1.exibirFicha();
		filme1.avaliar(8);
		filme1.avaliar(9);
		filme1.avaliar(10);
		filme1.avaliar(5);
		System.out.println(filme1.getTotalDeAvaliacoes());
		System.out.println(filme1.pegaMedia());
	}
}
