package chapter_02;

public class Throttle implements Cloneable{
	private int top;
	private int position = 0;
	
	public Throttle(){
		this(1);
	}
	
	public Throttle(int size){
		this(size, 0);
	}
	
	public Throttle(int size, int initialPosition){
		if (size <= 0){
			throw new IllegalArgumentException("Size ("+ size +") must be greater than zero.");
		}
		top = size;
		
		if (initialPosition < 0 || initialPosition > size){
			throw new IllegalArgumentException("Initial Position ("+ initialPosition +") must be between zero and " + size + ".");
		}
		position = initialPosition;
	}
	
	public double getFlow(){
		return (double)position / (double)top;
	}
	
	public boolean isOn(){
		return position > 0;
	}
	
	public void shutOff(){
		position = 0;
	}
	
	public void shift(int amount){
		if ( amount > (top - position)){
			position = top;
		}else if ((position + amount) < 0){
			position = 0;
		}else{
			position += amount;
		}
	}
	
	public boolean isHalfStarted(){
		return getFlow() > ((double)top / 2.0);
	}
	
	public boolean equals(Object o){
		if (o instanceof Throttle){
			Throttle other = (Throttle) o;
			return this.position == other.position && this.top == other.top;
		}
		return false;
	}
	
	public Throttle clone(){
		Throttle answer;
		
		try{
			answer = (Throttle) super.clone();
		}catch(CloneNotSupportedException e){
			throw new RuntimeException("This class does not implement Cloneable.");
		}
		
		return answer;
	}
}
