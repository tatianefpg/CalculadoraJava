package Calculadora;

import java.util.Scanner;

public class Executavel {
	private static Scanner leitura;

	public static void main(String[] args) {

		imprime();
	}

	public static void imprime() {
		leitura = new Scanner(System.in);

		int opcao;

		System.out.println("1 - Soma\n2 - Subtracao\n3 - Multiplicacao\n4 - Divisao\n5 - Zerar\n0 - Sair");
		opcao = leitura.nextInt();
		Calculadora calculadora = new Calculadora();

		System.out.println("Digite o primeiro numero");
		calculadora.setNumero1(leitura.nextDouble());
		System.out.println("Digite o segundo numero");
		calculadora.setNumero1(leitura.nextDouble());
		System.out.print("\n");

		switch (opcao) {
		// Soma
		case 1:
			System.out.println(calculadora.soma());
			imprime();
			break;

		// Subtracao
		case 2:
			System.out.println(calculadora.subtracao());
			imprime();
			break;

		// Multiplicacao
		case 3:
			System.out.println(calculadora.multiplicacao());
			imprime();
			break;

		// Divisao
		case 4:
			System.out.println(calculadora.divisao());
			imprime();
			break;

		// Zera
		case 5:
			calculadora.zerar();
			imprime();
			break;

		// Sair
		case 0:
			break;

		default:
			break;
		}
	}
}
