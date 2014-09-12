package recursion.basic_recursion.challenges;

public class Decrease {
	public static void main(String[] args) {
		decrease(7);
	}
	
	public static void decrease(int i){
		if (i==0){
			return;
		}else{
			System.out.print(i + " ");
			decrease(i - 1);
		}
	}
}
