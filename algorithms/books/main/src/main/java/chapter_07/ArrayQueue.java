package chapter_07;

public class ArrayQueue<E> implements Cloneable {
	private E[] data;
	private int manyItems;
	private int front;
	private int rear;

	public ArrayQueue(){
		this(10);
	}
	
	public ArrayQueue(int initialCapacity){
		if (initialCapacity < 0){
			throw new IllegalArgumentException("initialCapacity is negative: " + initialCapacity);
		}
		manyItems = 0;
		data = (E[]) new Object[initialCapacity];
	}
	
	public void add (E item){
		if (manyItems == data.length){
			ensureCapacity(manyItems*2 + 1);
		}
		
		if (manyItems == 0){
			front = 0;
			rear = 0;
		} else {
			rear = nextIndex(rear);
		}
		data[rear] = item;
		manyItems++;
	}
	
	public ArrayQueue<E> clone(){
		ArrayQueue<E> answer;
		
		try{
			answer = (ArrayQueue<E>) super.clone();
		}catch(CloneNotSupportedException e){
			throw new RuntimeException("This class does not implement Cloneable.");
		}
		answer.data = data.clone();
		return answer;
	}
	
	public int getCapacity(){
		return data.length;
	}
	
	public boolean isEmpty(){
		return (manyItems == 0);
	}
	

	private int nextIndex(int i) {
		if (i == data.length-1){
			return 0;
		}else{
			return i+1;
		}
	}

	private void ensureCapacity(int minimumCapacity) {
		// TODO Auto-generated method stub
		
	}
}
