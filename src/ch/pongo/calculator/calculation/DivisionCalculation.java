package ch.pongo.calculator.calculation;

class DivisionCalculation extends AbstractCalculation {

	@Override
	public float calculate() {
		if (b == 0) {
			throw new IllegalArgumentException("Divisor is 0!");
		}
		return a / b;
	}
}