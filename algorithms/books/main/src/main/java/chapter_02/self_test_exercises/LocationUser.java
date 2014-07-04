package chapter_02.self_test_exercises;

import chapter_02.Location;

public class LocationUser {
	public static void main(String[] args) {
		Location a = new Location(0,0);
		Location b = new Location(1,1);
		
		System.out.println("The distance between a and b is " + Location.distance(a, b));
		
		Location midpoint = Location.midpoint(a, b);
		
		System.out.println("The midpoint between a and b is " + midpoint);
	}
}
