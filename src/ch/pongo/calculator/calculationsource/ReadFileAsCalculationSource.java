package ch.pongo.calculator.calculationsource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

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
				StringTokenizer stringTokenizer = new StringTokenizer(line, ",");
				nextCalculation[0] = Float.parseFloat(stringTokenizer.nextToken());
				nextCalculation[1] = Float.parseFloat(stringTokenizer.nextToken());
				operandsFromFile.add(nextCalculation);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
