package Operacoes;

public class Divisao extends Principal.calcula {

	public Divisao(double num1, double num2) {
		super(num1, num2);
	}

	public double calcula() {

		if (num2 == 0) {
			System.out.println("Operação inválida");
			System.exit(0);
		}
		return num1 / num2;

	}

}
