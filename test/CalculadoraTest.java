package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Calculadora.Calculadora;

public class CalculadoraTest {
	Calculadora calculadora = new Calculadora();

	@Before
	public void init() {

		calculadora.setNumero1(10d);
		calculadora.setNumero2(1d);

		// Valor que voce esta comparando depois o get
		Assert.assertTrue(10 == calculadora.getNumero1());
		Assert.assertTrue(1 == calculadora.getNumero2());

	}

	@Test
	public void somarTest() {
		Assert.assertTrue(11 == calculadora.soma());
	}

	@Test
	public void subtrairTest() {
		Assert.assertTrue(9 == calculadora.subtracao());
	}

	@Test
	public void multiplicarTest() {
		Assert.assertTrue(10 == calculadora.multiplicacao());
	}

	@Test
	public void dividirTest() {
		Assert.assertTrue(10 == calculadora.divisao());

		Assert.assertFalse(0 == calculadora.divisao());
	}

	@Test
	public void zerarTest() {
		calculadora.zerar();
		Assert.assertTrue(0 == calculadora.getNumero1());
		Assert.assertTrue(0 == calculadora.getNumero2());
	}
}
