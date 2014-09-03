package chapter_05;

public class ArrayBag <E> implements Cloneable{
	private E[] data;
	private int manyItems;
	
	@SuppressWarnings("unchecked")
	public ArrayBag(){
		final int INITIAL_CAPACITY = 10;
		manyItems = 0;
		data = (E[]) new Object[INITIAL_CAPACITY];
	}
	
	@SuppressWarnings("unchecked")
	public ArrayBag(int initialCapacity){
		if(initialCapacity < 0){
			throw new IllegalArgumentException("Attempted to create an ArrayBag with a negative initialCapacity: " + initialCapacity);
		}
		manyItems = 0;
		data = (E[]) new Object[initialCapacity];
	}
	
	public void add(E element){
		if(manyItems == data.length){
			ensureCapacity(manyItems*2 + 1);
		}
		data[manyItems] = element;
		manyItems++;
	}
	
	public void addAll(ArrayBag<E> addend){
		if(addend == null){
			throw new IllegalArgumentException("addend must not be null");
		}
		ensureCapacity(manyItems + addend.manyItems);
		System.arraycopy(addend, 0, data, manyItems, addend.manyItems);
		manyItems += addend.manyItems;
	}
	
	public void addMany(E... elements){
		if(manyItems + elements.length < data.length){
			ensureCapacity((manyItems + elements.length) * 2);
		}
		System.arraycopy(elements, 0, data, manyItems, elements.length);
		manyItems += elements.length;
	}
	
	@SuppressWarnings("unchecked")
	public ArrayBag<E> clone(){
		ArrayBag<E> answer;
		
		try{
			answer = (ArrayBag<E>) super.clone();
		}catch(CloneNotSupportedException e){
			throw new RuntimeException("This class does not implement the Cloneable interface");
		}
		answer.data = data.clone();
		return answer;
	}
	
	public int countOccurences(E target){
		int answer = 0;
		int index;
		if(target == null){
			for(index = 0; index < manyItems; index++){
				if(data[index] == null){
					answer++;
				}
			}
		}else{
			for(index = 0; index < manyItems; index++){
				if(target.equals(data[index])){
					answer++;
				}
			}
		}
		return answer;
	}
	
	@SuppressWarnings("unchecked")
	public void ensureCapacity(int minimumCapacity){
		E biggerArray[];
		
		if (data.length < minimumCapacity){
			biggerArray = (E[]) new Object[minimumCapacity];
			System.arraycopy(data, 0, biggerArray, 0, manyItems);
			data = biggerArray;
		}
	}
	
	public int getCapacity(){
		return data.length;
	}
	
	public E grab(){
		if (manyItems == 0){
			throw new IllegalStateException("Unable to grab from an empty bag.");
		}
		return data[(int)(Math.random() * manyItems)];
	}
	
	public boolean remove(E target){
		int index = 0;
		if(target == null){
			while ((index < manyItems) && (data[index] != null)){
				index++;
			}
		}else{
			while ((index < manyItems) && !target.equals(data[index])){
				index++;
			}
		}
		
		if (index == manyItems){
			return false;
		}else{
			manyItems--;
			data[index] = data[manyItems];
			data[manyItems] = null;
			return true;
		}
	}
	
	public int size(){
		return manyItems;
	}
	
	@SuppressWarnings("unchecked")
	public void trimToSize(){
		E trimmedArray[];
		if (data.length != manyItems){
			trimmedArray = (E[]) new Object[manyItems];
			System.arraycopy(data,  0,  trimmedArray,  0,  manyItems);
		}
	}
	
	public static <E> ArrayBag<E> union(ArrayBag<E> b1, ArrayBag<E> b2){
		ArrayBag<E> answer = new ArrayBag<E>(b1.getCapacity() + b2.getCapacity());
		System.arraycopy(b1.data, 0, answer.data, 0, b1.manyItems);
		System.arraycopy(b2.data, 0, answer.data, b1.manyItems, b2.manyItems);
		return answer;
		
	}

}
