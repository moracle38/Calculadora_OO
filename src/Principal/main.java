package Principal;

import java.util.Scanner;
import Operacoes.*;
import OperacoesAvancadas.MediaBim;

public class main {

	public static void main(String[] args) {

		double resultado;

		System.out.println("Digite dois números: ");
		Scanner sc1 = new Scanner(System.in);
		double numero1 = sc1.nextDouble();
		Scanner sc2 = new Scanner(System.in);
		double numero2 = sc2.nextDouble();

		System.out.println("Qual operação você quer?\n[1]Adicao [2]Subtração [3]Multiplicação [4]Divisão [5]Média Bimestral");
	
		Scanner var = new Scanner(System.in);
		int opt = var.nextInt();

		switch (opt) {
		case 1:
			resultado = new Adicao(numero1, numero2).calcula();
			System.out.println(numero1 + " + " + numero2 + " = " + resultado);
			break;

		case 2:
			resultado = new Subtracao(numero1, numero2).calcula();
			System.out.println(numero1 + " - " + numero2 + " = " + resultado);
			break;

		case 3:
			resultado = new Multiplicacao(numero1, numero2).calcula();
			System.out.println(numero1 + " x " + numero2 + " = " + resultado);
			break;

		case 4:
			resultado = new Divisao(numero1, numero2).calcula();
			System.out.println(numero1 + " / " + numero2 + " = " + resultado);
			break;

		case 5:
			resultado = new MediaBim(numero1, numero2).fazMedia();
			System.out.println("Media Bimestral(" + numero1 + " , " + numero2 + ") = " + resultado);
			break;
		default:
			System.out.println("Opção Inválida");
			break;

		}

	}

}
