package ch.pongo.calculator.calculation;

abstract class AbstractCalculation implements Calculation {

	protected float a;
	protected float b;
	
	@Override
	public void setA(float a) {
		this.a = a;
	}

	@Override
	public void setB(float b) {
		this.b = b;
	}
}