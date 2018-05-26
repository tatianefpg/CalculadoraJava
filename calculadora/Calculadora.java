package Calculadora;

public class Calculadora {

	private double numero1 = 0d;

	private double numero2 = 0d;

	public double soma() {
		double soma = numero1 + numero2;

		return soma;
	}

	public double subtracao() {
		double subtracao = numero1 - numero2;

		return subtracao;
	}

	public double multiplicacao() {
		double multiplicacao = numero1 * numero2;

		return multiplicacao;
	}

	public double divisao() {
		double divisao;

		if (numero2 > 0) {
			divisao = numero1 / numero2;

			return divisao;

		} else
			System.out.println("Divisão inválida");
		return 0;
	}

	public void zerar() {
		numero1 = 0d;
		numero2 = 0d;
	}

	public double getNumero1() {
		return numero1;
	}

	public void setNumero1(double numero1) {
		this.numero1 = numero1;
	}

	public double getNumero2() {
		return numero2;
	}

	public void setNumero2(double numero2) {
		this.numero2 = numero2;
	}

}
