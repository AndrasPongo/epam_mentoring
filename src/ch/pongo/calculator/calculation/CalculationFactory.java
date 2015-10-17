package ch.pongo.calculator.calculation;

public class CalculationFactory {

	public Calculation createCalculation(String operatorSign){
		if (operatorSign.equals("+")) {
			return new PlusOperator();
		} else if (operatorSign.equals("/")) {
			return new DivideOperator();
		} else if (operatorSign.equals("*")) {
			return new MultiplicationOperator();
		} else if (operatorSign.equals("-")) {
			return new MinusOperator();
		} else {
			throw new IllegalArgumentException("Invalid operator sign");
		}				
	}
}
