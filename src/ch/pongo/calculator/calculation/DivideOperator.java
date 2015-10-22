package ch.pongo.calculator.calculation;

public class DivideOperator extends AbstractCalculation {

	@Override
	public float calculate() {
		if (b == 0) {
			throw new IllegalArgumentException("Divisor is 0!");
		}
		return a / b;
	}
}
