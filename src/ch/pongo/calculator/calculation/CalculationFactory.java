package ch.pongo.calculator.calculation;

public class CalculationFactory {

	public Calculation createCalculation(String operatorSign){
		if (operatorSign==null) {
			throw new IllegalArgumentException();
		}
		
		if (operatorSign.equals("+")) {
			return new AdditionCalculation();
		} else if (operatorSign.equals("/")) {
			return new DivisionCalculation();
		} else if (operatorSign.equals("*")) {
			return new MultiplicationCalculation();
		} else if (operatorSign.equals("-")) {
			return new SubtractionCalculation();
		} else {
			throw new IllegalArgumentException("Invalid operator sign");
		}				
	}
}