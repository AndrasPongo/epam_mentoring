package ch.pongo.calculator.operand;

public class CalculationFactory {

	public Calculation createCalculation(String operatorSign){
		if (operatorSign.equals("+")) {
			return new PlusOperator();
		} else if (operatorSign.equals("/")) {
			return new DivideOperator();
		} else {
			throw new IllegalArgumentException("Invalid operator sign");
		}				
	}
}
