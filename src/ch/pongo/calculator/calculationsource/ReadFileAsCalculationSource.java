package ch.pongo.calculator.calculationsource;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;


public class ReadFileAsCalculationSource implements CalculationSource {
	private Stack<float[]> operandsFromFile = new Stack<float[]>();
	
	public ReadFileAsCalculationSource() {
		this.fetchCalculationsFromFile();
	}
	
	@Override
	public float[] getNextCalculation() {
		float[] x = {0, 0};
		if (!operandsFromFile.empty()) {
			x = (float[])operandsFromFile.pop();
			return (x);
		} else {
			return null;
		}
	}
	
	private Stack<float[]> fetchCalculationsFromFile() {
		//float[] nextCalculation = {0, 0};
		try (BufferedReader br = new BufferedReader(new FileReader("Calculations.txt"))) {
			String line;
			while((line = br.readLine()) != null) {
				float[] nextCalculation = new float[2]; 
				nextCalculation[0] = Float.parseFloat(line.substring(0, line.indexOf(",")));
				nextCalculation[1] = Float.parseFloat(line.substring(line.indexOf(",")+1, line.length()));
				operandsFromFile.push(nextCalculation);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return operandsFromFile;
	}
}
