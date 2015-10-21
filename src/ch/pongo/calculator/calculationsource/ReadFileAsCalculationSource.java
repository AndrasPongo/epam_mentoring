package ch.pongo.calculator.calculationsource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

import ch.pongo.calculator.calculation.Calculation;
import ch.pongo.calculator.calculation.CalculationFactory;

public class ReadFileAsCalculationSource implements CalculationSource {

	private CalculationFactory calculationFactory = new CalculationFactory();
	private List<Calculation> operandsFromFile = new LinkedList<Calculation>();

	public ReadFileAsCalculationSource() {
		fetchCalculationsFromFile();
	}

	@Override
	public Calculation getNextCalculation() {
		if (!operandsFromFile.isEmpty()) {
			return operandsFromFile.remove(0);
		}
		return null;
	}

	private void fetchCalculationsFromFile() {
		try (BufferedReader br = new BufferedReader(new FileReader("Calculations.txt"))) {
			String line;
			while ((line = br.readLine()) != null) {

				Calculation calculation = parseCalculation(line);
				operandsFromFile.add(calculation);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private Calculation parseCalculation(String calculationString) {
		StringTokenizer stringTokenizer = new StringTokenizer(calculationString, "+-*/", true);
		float a = Float.parseFloat(stringTokenizer.nextToken());
		String operand = stringTokenizer.nextToken();
		float b = Float.parseFloat(stringTokenizer.nextToken());

		Calculation calculation = calculationFactory.createCalculation(operand);
		calculation.setA(a);
		calculation.setB(b);
		return calculation;
	}
}
