package chapter_02;

public class Location implements Cloneable{
	private double x;
	private double y;
	
	public Location (double x, double y){
		this.setX(x);
		this.setY(y);
	}
	
	public Location clone(){
		Location answer;
		
		try{
			answer = (Location) super.clone();
		}catch(CloneNotSupportedException e){
			throw new RuntimeException("This class does not implement Cloneable.");
		}
		
		return answer;
	}
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public boolean equals(Object o){
		if (o instanceof Location){
			Location candidate = (Location) o;
			return (candidate.getX() == this.x) && (candidate.getY() == this .y);
		}
		return false;
	}
	
	public void rotateNinetyDegreesAboutTheOrigin(){
		double temp = y;
		y = -x;
		x = temp;
	}
	
	public void shift( double xAmount, double yAmount){
		x += xAmount;
		y += yAmount;
	}
	
	public String toString(){
		return "(x=" + x + " y=" + y + ")";
	}
	
	public static double distance(Location p1, Location p2){
		if((p1 == null) || (p2 == null)){
			return Double.NaN;
		} else {
			double a = p1.getX() - p2.getX();
			double b = p1.getY() - p2.getY();
			return Math.sqrt(a*a +b*b);
		}
	}
	
	public static Location midpoint(Location p1, Location p2){
		if ((p1 == null) || (p2 == null)){
			return null;
		} else {
			double xMid = (p1.getX()/2) + (p2.getX()/2);
			double yMid = (p1.getY()/2) + (p2.getY()/2);
			
			return new Location(xMid, yMid);
		}
	}

	
}
