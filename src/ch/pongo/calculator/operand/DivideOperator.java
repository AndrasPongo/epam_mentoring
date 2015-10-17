package ch.pongo.calculator.operand;

class DivideOperator extends AbstractCalculation {

	@Override
	public float calculate() {
		if (b == 0) {
			throw new IllegalArgumentException("Divisor is 0!");
		} else {
			return a / b;
		}
	}
}
