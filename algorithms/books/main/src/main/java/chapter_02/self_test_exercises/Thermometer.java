package chapter_02.self_test_exercises;

public class Thermometer {
	private double temperatureInCentigrade;
	
	public void setCentigrade(double temperatureInCentigrade){
		this.temperatureInCentigrade = temperatureInCentigrade;
	}
	
	public void setFahrenheit(double temperatureInFahrenheit){
		this.temperatureInCentigrade = (temperatureInFahrenheit - 32.0d) * 5.0d / 9.0d;
	}
	
	public double getCentigrade(){
		return temperatureInCentigrade;
	}
	
	public double getFahrenheit(){
		return (temperatureInCentigrade * 9.0d / 5.0d) + 32;
	}
}
