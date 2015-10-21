package ch.pongo.calculator.calculationsource;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class ReadFileAsCalculationSource implements CalculationSource {
	private List<float[]> operandsFromFile = new LinkedList<float[]>();

	public ReadFileAsCalculationSource() {
		fetchCalculationsFromFile();
	}

	@Override
	public float[] getNextCalculation() {
		if (!operandsFromFile.isEmpty()) {
			return operandsFromFile.remove(0);
		}
		return null;
	}

	private void fetchCalculationsFromFile() {
		try (BufferedReader br = new BufferedReader(new FileReader("Calculations.txt"))) {
			String line;
			while ((line = br.readLine()) != null) {
				float[] nextCalculation = new float[2];
				nextCalculation[0] = Float.parseFloat(line.substring(0, line.indexOf(",")));
				nextCalculation[1] = Float.parseFloat(line.substring(line.indexOf(",") + 1, line.length()));
				operandsFromFile.add(nextCalculation);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
