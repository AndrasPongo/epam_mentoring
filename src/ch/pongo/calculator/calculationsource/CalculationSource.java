package ch.pongo.calculator.calculationsource;

import ch.pongo.calculator.calculation.Calculation;

public interface CalculationSource {

	public Calculation getNextCalculation();
}
