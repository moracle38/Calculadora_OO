package OperacoesAvancadas;

import Operacoes.*;

public class MediaBim extends Principal.calcula {

	private double peso = 0.5, r1, r2;

	public MediaBim(double num1, double num2) {
		super(num1, num2);

	}

	public double fazMedia() {
		
		r1 = new Multiplicacao(num1, peso).calcula();
		r2 = new Multiplicacao(num2, peso).calcula();

		Adicao soma;
		soma = new Adicao(r1, r2);
		return soma.calcula();

	}
}
