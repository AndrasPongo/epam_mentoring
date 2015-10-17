package ch.pongo.calculator;

import ch.pongo.calculator.calculationsource.ReadFileAsCalculationSource;
import ch.pongo.calculator.calculation.Calculation;
import ch.pongo.calculator.calculation.CalculationFactory;
import ch.pongo.calculator.calculationsource.CalculationSource;

public class Calculator {

	public static void main(String[] args) {

		CalculationSource calculationSource = new ReadFileAsCalculationSource();

		float[] aAndB = null;
		while ((aAndB = calculationSource.getNextCalculation()) != null){
			String operatorSign = "/";
			CalculationFactory calculationFactory = new CalculationFactory();
			Calculation calculation = calculationFactory.createCalculation(operatorSign);
			calculation.setA(aAndB[0]);
			calculation.setB(aAndB[1]);
			System.out.println(calculation.calculate());
		}
	}
}
