package ch.pongo.calculator.calculation;

import static org.junit.Assert.*;
import ch.pongo.calculator.calculation.*;

import org.junit.Test;

public class CalculationFactoryTests {

	@Test
	public void test_calculationFactoryShouldReturnOnlyBaseCalculations() {

		CalculationFactory calculationFactory = new CalculationFactory();
		
		PlusOperator plusOperator = new PlusOperator();
		MinusOperator minusOperator = new MinusOperator();
		MultiplicationOperator multiplicationOperator = new MultiplicationOperator();
		DivideOperator divideOperator = new DivideOperator();
		
		assertSame("For + sign factory must return a calculation with a PlusOperator",plusOperator.getClass(),calculationFactory.createCalculation("+").getClass());		
		assertSame("For - sign factory must return a calculation with a MinusOperator",minusOperator.getClass(),calculationFactory.createCalculation("-").getClass());		
		assertSame("For * sign factory must return a calculation with a MultiplicationOperator",multiplicationOperator.getClass(),calculationFactory.createCalculation("*").getClass());		
		assertSame("For / sign factory must return a calculation with a DivideOperator",divideOperator.getClass(),calculationFactory.createCalculation("/").getClass());		
	}

	@Test(expected=IllegalArgumentException.class)
 	public void testCreateCalculation_ShouldHandleNull() {
		// Fixture / Given
		CalculationFactory calculationFactory = new CalculationFactory();
		
		// When and Then
		calculationFactory.createCalculation(null);
	}
	
	@Test
 	public void testCreateCalculation_ShouldReturnPlusOperator() {
		// Fixture / Given
		CalculationFactory calculationFactory = new CalculationFactory();
		
		// When
		Calculation calculation = calculationFactory.createCalculation("+");
	
		//Then
		assertTrue(calculation instanceof PlusOperator);
	}
}