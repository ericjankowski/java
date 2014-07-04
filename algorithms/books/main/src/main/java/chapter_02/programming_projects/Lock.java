package chapter_02.programming_projects;

public class Lock {
	int x;
	int y;
	int z;
	int currentPosition;
	int numberCorrect;
	String status;
	
	public Lock(){
		this(randomLockPosition(), randomLockPosition(), randomLockPosition());
	}
	
	public Lock(int x, int y, int z){
		this.x = x;
		this.y = y;
		this.z = z;
		this.currentPosition = 0;
		this.numberCorrect = 0;
		this.status = "LOCKED";
	}
	
	public void setCombination(int x, int y, int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public void turn(String direction, int target){
		if(numberCorrect == 0){
			if (direction == "CLOCKWISE" && target == x){
				this.currentPosition = x;
				numberCorrect = 1;
			}else{
				currentPosition = target;
				numberCorrect = 0;
			}
		}else if(numberCorrect == 1){
			if (direction == "COUNTER_CLOCKWISE"  && target == y){
				this.currentPosition = y;
				numberCorrect = 2;
			}else{
				currentPosition = target;
				numberCorrect = 0;
			}
		}else if(numberCorrect == 2){
			if (direction == "CLOCKWISE" && target == z){
				this.currentPosition = z;
				this.status = "OPEN";
				this.numberCorrect = 0;
			}else{
				currentPosition = target;
				numberCorrect = 0;
			}
		}
	}
	
	public void close(){
		this.status = "LOCKED";
		this.currentPosition = randomLockPosition();
	}
	
	public String attemptToOpen(){
		if(this.getStatus().equals("OPEN")){
			return "SUCCESS!! Lock is OPEN.";
		}else{
			return "FAILURE!! Lock is not OPEN.";
		}
	}

	public String getStatus() {
		return this.status;
	}
	
	public int getCurrentPosition(){
		return this.currentPosition;
	}

	private static int randomLockPosition() {
		return (int)(Math.random()*39);
	}
}
