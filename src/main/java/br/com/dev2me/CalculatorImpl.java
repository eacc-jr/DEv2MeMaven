package br.com.dev2me;

public class CalculatorImpl implements Calculator {

	@Override
	public int sun(int a, int b) {
		return a + b;
	}

	@Override
	public int subtraction(int a, int b) {
		return a - b;
	}

	@Override
	public int multiplication(int a, int b) {
		return a * b;
	}

	@Override
	public int division(int a, int b) {
		return a / b;
	}

	@Override
	public boolean equalsIntegers(int a, int b) {
		return a == b;
	}

}
