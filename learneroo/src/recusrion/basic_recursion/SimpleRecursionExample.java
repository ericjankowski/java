package recusrion.basic_recursion;

public class SimpleRecursionExample {
	public static void main(String[] args) {
		recurse(0);
	}
	
	public static void recurse(int i){
		System.out.println(i);
		if(i == 10820){ //Stack overflow error on this local machine at 10820
			return;
		}else{
			recurse(i+1);
		}
	}
}
