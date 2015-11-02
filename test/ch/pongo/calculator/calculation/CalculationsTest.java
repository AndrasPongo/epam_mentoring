package ch.pongo.calculator.calculation;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class CalculationsTest {
/*	
 * First I wanted to include tests for the setter methods as well, but later I figured that this behavior 
 * belong to the interface, not to the classes themselves, so if this needs to be tested it will have to be done 
 * in another Test file, specifically testing the common interface.
 * 
 * Not to mention that I wasn't even sure if this is the right way to do this
 * 
	@Test(expected = Error.class)
	public void testOperations_AdditionOperation_IllegalArgA() {
		//Given
		AdditionCalculation additionCalculation = new AdditionCalculation();
		
		//When & Then		
		additionCalculation.setA("a");
	}
	
	@Test(expected = Error.class)
	public void testOperations_AdditionOperation_IllegalArgB() {
		//Given
		AdditionCalculation additionCalculation = new AdditionCalculation();
		
		//When & Then		
		additionCalculation.setB("a");
	}
	
	@Test(expected = Error.class)
	public void testOperations_SubtractionOperation_IllegalArgA() {
		//Given
		SubtractionCalculation subtractionCalculation = new SubtractionCalculation();
		
		//When & Then		
		subtractionCalculation.setA("a");
	}
	
	@Test(expected = Error.class)
	public void testOperations_SubtractionOperation_IllegalArgB() {
		//Given
		SubtractionCalculation subtractionCalculation = new SubtractionCalculation();
		
		//When & Then		
		subtractionCalculation.setB("a");
	}
	
	@Test(expected = Error.class)
	public void testOperations_MultiplicationOperation_IllegalArgA() {
		//Given
		MultiplicationCalculation multiplicationCalculation = new MultiplicationCalculation();
		
		//When & Then		
		multiplicationCalculation.setA("a");
	}
	
	@Test(expected = Error.class)
	public void testOperations_MultiplicationOperation_IllegalArgB() {
		//Given
		MultiplicationCalculation multiplicationCalculation = new MultiplicationCalculation();
		
		//When & Then		
		multiplicationCalculation.setB("a");
	}	
	
	@Test(expected = Error.class)
	public void testOperations_DivisionOperation_IllegalArgA() {
		//Given
		DivisionCalculation divisionCalculation = new DivisionCalculation();
		
		//When & Then		
		divisionCalculation.setA("a");
	}
	
	@Test(expected = Error.class)
	public void testOperations_DivisionOperation_IllegalArgB() {
		//Given
		DivisionCalculation divisionCalculation = new DivisionCalculation();
		
		//When & Then		
		divisionCalculation.setB("a");
	}	
	
*/		
	
	
	@Test
	public void testOperations_ShouldPerformAdditionOperation() {
		
		//Given
		AdditionCalculation additionCalculation = new AdditionCalculation();
		
		//When
		additionCalculation.setA(1);
		additionCalculation.setB(2);
	
		//Then
		assertTrue(additionCalculation.calculate() == 3.0);
	}
	
	@Test
	public void testOperations_ShouldPerformSubtractionOperation() {
		
		//Given
		SubtractionCalculation subtractionCalculation = new SubtractionCalculation();
		
		//When
		subtractionCalculation.setA(1);
		subtractionCalculation.setB(2);
	
		//Then
		assertTrue(subtractionCalculation.calculate() == -1.0);
	}
	
	@Test
	public void testOperations_ShouldPerformMultiplicationOperation() {
		
		//Given
		MultiplicationCalculation multiplicationCalculation = new MultiplicationCalculation();
		
		//When
		multiplicationCalculation.setA(1);
		multiplicationCalculation.setB(2);
	
		//Then
		assertTrue(multiplicationCalculation.calculate() == 2.0);
	}
	
	@Test
	public void testOperations_ShouldPerformDivisionOperation() {
		
		//Given
		DivisionCalculation divisionCalculation = new DivisionCalculation();
		
		//When
		divisionCalculation.setA(1);
		divisionCalculation.setB(2);
	
		//Then
		assertTrue(divisionCalculation.calculate() == 0.5);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testOperations_DivisionOperation_NullDivisor() {
		//Given
		DivisionCalculation divisionCalculation = new DivisionCalculation();
		
		//When & Then
		divisionCalculation.setA(1);
		divisionCalculation.setB(0);
		divisionCalculation.calculate();
	}	
}
