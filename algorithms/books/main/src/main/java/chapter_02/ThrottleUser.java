package chapter_02;

public class ThrottleUser {
	public static void main(String[] args) {
		Throttle control = new Throttle(100);
		control.shift(3);
		
		Throttle small = new Throttle(8);
		small.shift(3);
		System.out.println("My small throttle is now at position 3");
		System.out.println("The flow is now: " + small.getFlow());
		System.out.println("*******************\n\n\n");
		
		System.out.println("Simple pass by reference example");
		Throttle t1 = new Throttle(100);
		Throttle t2 = t1;
		t1.shift(75);
		System.out.println("The flow of t1 is " + t1.getFlow());
		
		t2.shift(-50);
		System.out.println("The flow of t1 is " + t1.getFlow());
		System.out.println("Calling a method on t2 affects the behavior of t1 because they are the same object.");
		
	}
}
