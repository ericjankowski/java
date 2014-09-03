package chapter_02.programming_projects;

public class Statistician {

	private int length = 0;
	private double lastNumberOfSequence = Double.NaN;
	private double sum;
	private double min = Double.NaN;
	private double max = Double.NaN;

	public void nextNumber(double d) {
		if(length == 0){
			min = d;
			max = d;
		}else if(d < min){
			min = d;
		}else if(d > max){
			max = d;
		}
		length++;
		lastNumberOfSequence = d;
		sum += d;
	}

	public int getLengthOfSequence() {
		return length;
	}

	public double getLastNumberOfSequence() {
		return lastNumberOfSequence;
	}

	public double getSum() {
		return sum;
	}

	public double getMean() {
		return sum/length;
	}

	public double getMin() {
		return min;
	}

	public double getMax() {
		return max;
	}
}
