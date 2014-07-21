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
		return false;
	}
	
	public int size(){
		return 0;
	}
	
	public int countOccurrences(int target){
		return 0;
	}
	
	public static BagOfIntegers union(BagOfIntegers bag1, BagOfIntegers bag2){
		return new BagOfIntegers();
	}
	
	public BagOfIntegers clone(){
		return this;
	}
	
	public int getCapacity(){
		return 0;
	}
	
	public void ensureCapacity(int minimumCapacity){
		
	}
	
	public void trimToSize(){
		
	}
}
