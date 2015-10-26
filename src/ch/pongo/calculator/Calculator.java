package ch.pongo.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.pongo.calculator.calculation.Calculation;
import ch.pongo.calculator.calculationsource.CalculationSource;
import ch.pongo.calculator.calculationsource.ReadFileAsCalculationSource;

public class Calculator {

	private static final Logger LOGGER = LoggerFactory.getLogger(Calculator.class);

	public static void main(String[] args) {

		LOGGER.info("Starting the Calculation application");

		CalculationSource calculationSource = new ReadFileAsCalculationSource();

		Calculation calculation = null;
		while ((calculation = calculationSource.getNextCalculation()) != null) {
//			System.out.println(calculation.calculate());
			LOGGER.trace("Executing the next calculation {}", calculation);
			float result = calculation.calculate();
			LOGGER.info("The result is {}", Float.toString(result));
		}

		LOGGER.info("Stopping the Calculation application");
	}
}
