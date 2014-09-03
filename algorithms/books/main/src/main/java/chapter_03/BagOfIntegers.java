package chapter_03;

public class BagOfIntegers implements Cloneable{
	
	private int[] data;
	private int numberOfItems;
	
	public BagOfIntegers(){
		this(10);
	}
	
	public BagOfIntegers(int initialCapacity){
		if (initialCapacity < 0){
			throw new IllegalArgumentException("The initialCapacity is negative: " + initialCapacity);
		}else{
			numberOfItems = 0;
			data = new int[initialCapacity];
		}
	}
	
	public void add(int element){
		if(numberOfItems == data.length){
			ensureCapacity(numberOfItems*2 + 1);
		}
		data[numberOfItems] = element;
		numberOfItems++;
	}
	
	public void addMany(int... elements){
		if(numberOfItems + elements.length < data.length){
			ensureCapacity((numberOfItems + elements.length) * 2);
		}
		System.arraycopy(elements, 0, data, numberOfItems, elements.length);
		numberOfItems += elements.length;
	}
	
	public void addAll(BagOfIntegers bagToBeAdded){
		if(bagToBeAdded == null){
			throw new IllegalArgumentException("bagToBeAdded must not be null");
		}
		ensureCapacity(numberOfItems + bagToBeAdded.numberOfItems);
		System.arraycopy(bagToBeAdded, 0, data, numberOfItems, bagToBeAdded.numberOfItems);
		numberOfItems += bagToBeAdded.numberOfItems;
	}
	
	public boolean remove(int target){
		int index = 0;
		
		while ((index < numberOfItems) && (target != data[index])){
			index++;
		}
		if (index == numberOfItems){
			return false;
		}else{
			numberOfItems--;
			data[index] = data[numberOfItems];
			return true;
		}
	}
	
	public int size(){
		return numberOfItems;
	}
	
	public int countOccurrences(int target){
		int answer = 0;
		for (int index = 0; index < numberOfItems; index++){
			if (target == data[index]){
				answer++;
			}
		}
		return answer;
	}
	
	public static BagOfIntegers union(BagOfIntegers bag1, BagOfIntegers bag2){
		BagOfIntegers result = new BagOfIntegers(bag1.getCapacity() + bag2.getCapacity());
		System.arraycopy(bag1.data, 0, result.data, 0, bag1.numberOfItems);
		System.arraycopy(bag2.data, 0, result.data, bag1.numberOfItems, bag2.numberOfItems);
		result.numberOfItems = bag1.numberOfItems + bag2.numberOfItems;
		
		return result;
	}
	
	public BagOfIntegers clone(){
		BagOfIntegers result;
		try{
			result = (BagOfIntegers)super.clone();
		}catch(CloneNotSupportedException e){
			throw new RuntimeException("This class does not implement the cloneable interface");
		}
		result.data = data.clone();
		
		return result;
	}
	
	public int getCapacity(){
		return data.length;
	}
	
	public void ensureCapacity(int minimumCapacity){
		if (data.length < minimumCapacity){
			int[] biggerArray = new int[minimumCapacity];
			System.arraycopy(data, 0, biggerArray, 0, numberOfItems);
			data = biggerArray;
		}
	}
	
	public void trimToSize(){
		if (data.length != numberOfItems){
			int [] trimmedArray = new int[numberOfItems];
			System.arraycopy(data, 0, trimmedArray, 0, numberOfItems);
			data = trimmedArray;
		}
	}
}
