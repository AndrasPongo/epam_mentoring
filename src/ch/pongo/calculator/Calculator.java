package ch.pongo.calculator;

import ch.pongo.calculator.calculation.Calculation;
import ch.pongo.calculator.calculationsource.CalculationSource;
import ch.pongo.calculator.calculationsource.ReadFileAsCalculationSource;

public class Calculator {

	public static void main(String[] args) {

		CalculationSource calculationSource = new ReadFileAsCalculationSource();

		Calculation calculation = null;
		while ((calculation = calculationSource.getNextCalculation()) != null) {
			System.out.println(calculation.calculate());

		}
	}
}