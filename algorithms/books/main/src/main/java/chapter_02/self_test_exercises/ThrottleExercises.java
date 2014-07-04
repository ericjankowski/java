package chapter_02.self_test_exercises;

import chapter_02.Throttle;

public class ThrottleExercises {
	public static void main(String[] args) {
		//Question 9
		Throttle throttle1 = new Throttle(6);
		throttle1.shift(3);
		System.out.println("Question 9:  Current throttle flow is " + throttle1.getFlow());
	}
}
