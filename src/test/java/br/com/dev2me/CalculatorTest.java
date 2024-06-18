package br.com.dev2me;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void deveriaSomarDoisValoresPassados() {
		int valorA = 2;
		int valorB = 2;
		int soma = 0;
		
		Calculator calc = new CalculatorImpl();
		soma = calc.sun(valorA, valorB);
		
		assertEquals(soma, 4);
		
	}
	@Test
	public void deveriaSubtrairDoisValores() {
		int valorA = 25;
		int valorB = 7;
		int sub = 0;
		
		
		Calculator calc = new CalculatorImpl();
		sub = calc.subtraction(valorA, valorB);
		
		assertEquals(sub, 18);
		
		
	}
	
	@Test
	public void deveriaMultiplicarDoisValores() {
		int valorA = 2;
		int valorB = 2;
		int multi = 0;
		
		
		Calculator calc = new CalculatorImpl();
		multi = calc.multiplication(valorA, valorB);
		
		assertEquals(multi, 4);
		
	}
	
	@Test
	public void deveriaDividirDoisValores() {
		int valorA = 4;
		int valorB = 2;
		int divi= 0;
		
		
		Calculator calc = new CalculatorImpl();
		divi = calc.division(valorA, valorB);
		
		assertEquals(divi, 2);
		
	}
	
	@Test
	public void deveririaSerIgualDoisValores() {
		int valorA = 2;
		int valorB = 2;
		boolean igual = false;
		
		Calculator calc = new CalculatorImpl();
		igual = calc.equalsIntegers(valorA, valorB);
		
		assertTrue(igual);
		
	}

}
