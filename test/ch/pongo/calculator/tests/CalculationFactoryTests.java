package ch.pongo.calculator.tests;

import static org.junit.Assert.*;
import ch.pongo.calculator.calculation.*;

import org.junit.Test;

public class CalculationFactoryTests {

	@Test
	public void calculationFactoryShouldReturnOnlyBaseCalculations() {

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

}
