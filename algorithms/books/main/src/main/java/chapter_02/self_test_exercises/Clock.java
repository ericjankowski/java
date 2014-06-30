package chapter_02.self_test_exercises;

public class Clock {
	private int minute;
	private int hour;

	public Clock(){
		this.hour = 0;
		this.minute = 0;
	}
	
	public void setTime(int hour, int minute){
		if (minute > 59){
			throw new IllegalArgumentException("The minute must be less than or equal to 59");
		}
		if (hour > 12 || hour < 1){
			throw new IllegalArgumentException("The hour must be between 1 and 12 inclusive");
		}
		this.hour = hour;
		this.minute = minute;
	}
	
	public int getHour(){
		return hour % 12 == 0 ? 12 : hour % 12;
	}
	
	public int getMinute(){
		return minute;
	}
	
	public boolean isAfternoon(){
		return hour >= 12;
	}
	
	public void shift(int minutes){
		hour = hour + (minutes/60);
		minute = minute + (minutes % 60);
		
		if(minute > 59){
			hour = hour + 1;
			minute = minute % 60;
		}
		
		if(hour > 23){
			hour = hour % 24;
		}
		
		
	}
}
