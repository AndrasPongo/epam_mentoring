package ch.pongo.calculator.calculation;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CalculationFactoryTests {

	@Test(expected = IllegalArgumentException.class)
	public void testCreateCalculation_NullArg() {
		// Fixture / Given
		CalculationFactory calculationFactory = new CalculationFactory();

		// When and Then
		calculationFactory.createCalculation(null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testCreateCalculation_InvalidArg() {
		// Fixture / Given
		CalculationFactory calculationFactory = new CalculationFactory();

		// When and Then
		calculationFactory.createCalculation("s");
	}

	@Test
	public void testCreateCalculation_ShouldReturnPlusOperator() {
		// Fixture / Given
		CalculationFactory calculationFactory = new CalculationFactory();

		// When
		Calculation calculation = calculationFactory.createCalculation("+");

		// Then
		assertTrue(calculation instanceof PlusOperator);
	}

	@Test
	public void testCreateCalculation_ShouldReturMinusOperator() {
		// Fixture / Given
		CalculationFactory calculationFactory = new CalculationFactory();

		// When
		Calculation calculation = calculationFactory.createCalculation("-");

		// Then
		assertTrue(calculation instanceof MinusOperator);
	}

	@Test
	public void testCreateCalculation_ShouldReturnMultiplicationOperator() {
		// Fixture / Given
		CalculationFactory calculationFactory = new CalculationFactory();

		// When
		Calculation calculation = calculationFactory.createCalculation("*");

		// Then
		assertTrue(calculation instanceof MultiplicationOperator);
	}

	@Test
	public void testCreateCalculation_ShouldReturnDivideOperator() {
		// Fixture / Given
		CalculationFactory calculationFactory = new CalculationFactory();

		// When
		Calculation calculation = calculationFactory.createCalculation("/");

		// Then
		assertTrue(calculation instanceof DivideOperator);
	}
}
