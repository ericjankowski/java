package chapter_01;

public class TempConverter {
	private static final double MINIMUM_CELSIUS = -273.15;

	public static void main(String[] args) {
		System.out.println("    TEMPERATURE CONVERSION    ");
		System.out.println("------------------------------");
		System.out.println("Celsius\t\tFahrenheit");
		for(double celsius = -50.00d; celsius < 51.0d; celsius += 10.0d){
			//System.out.println(celsius + "C\t\t" + celsiusToFahrenheit(celsius));
			System.out.printf("%6.2fC", celsius);
			System.out.printf("%15.2fF\n", celsiusToFahrenheit(celsius));
		}
		System.out.println("------------------------------");
		
	}
	
	public static double celsiusToFahrenheit(double celsius){
		if(celsius < MINIMUM_CELSIUS){
			throw new IllegalArgumentException("Argument " + celsius + " is below absolute zero and is not physically possible.");
		}
		return (celsius * 1.8d) + 32.0d;
	}
}
