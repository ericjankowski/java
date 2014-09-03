package chapter_03;

public class DoubleArraySequence implements Cloneable{
	
	private double [] data;
	private int numberOfItems;
	private int currentIndex;
	
	
	public DoubleArraySequence(){
		this(10);
	}
	
	public DoubleArraySequence(int capacity){
		data = new double [capacity];
		numberOfItems = 0;
		currentIndex = 0;
	}
	
	public int size(){
		return numberOfItems;
	}
	
	public void start(){
		currentIndex = 0;
	}
	public double getCurrent(){
		return data[currentIndex];
	}
	public void advance(){
		currentIndex++;
	}
	public boolean isCurrent(){
		return currentIndex < numberOfItems;
	}
	public void addBefore(double element){
		if(numberOfItems == data.length){
			ensureCapacity((numberOfItems * 2) + 1);
		}
		if(numberOfItems == 0){
			data[0] = element;
		}else{
			for(int operatingIndex = numberOfItems - 1; operatingIndex >= currentIndex; operatingIndex--){
				data[operatingIndex + 1] = data[operatingIndex];
			}
			data[currentIndex] = element;
		}
		numberOfItems++;
	}
	public void addAfter(double element){
		if(numberOfItems == data.length){
			ensureCapacity((numberOfItems * 2) + 1);
		}
		if(numberOfItems == 0){
			data[0] = element;
		}else{
			for(int operatingIndex = numberOfItems - 1; operatingIndex >= currentIndex + 1; operatingIndex--){
				data[operatingIndex + 1] = data[operatingIndex];
			}
			data[currentIndex + 1] = element;
		}
		numberOfItems++;
	}
	public boolean removeCurrent(){
		if(isCurrent()){
			for(int operatingIndex = currentIndex; operatingIndex < numberOfItems - 1; operatingIndex ++){
				data[operatingIndex] = data[operatingIndex + 1];
			}
			numberOfItems--;
			return true;
		}else{
			return false;
		}
	}
	public void addAll(DoubleArraySequence addend){}
	public static DoubleArraySequence concatenation (DoubleArraySequence a, DoubleArraySequence b){
		return new DoubleArraySequence();
	}
	public DoubleArraySequence clone(){
		return new DoubleArraySequence();
	}
	public int getCapacity(){
		return 0;
	}
	public void ensureCapacity(int minimumCapacity){
		if (data.length < minimumCapacity){
			double[] biggerArray = new double[minimumCapacity];
			System.arraycopy(data, 0, biggerArray, 0, numberOfItems);
			data = biggerArray;
		}
	}
	public void trimToSize(){}
	
	public String toString(){
		String result = "[";
		for (int i = 0; i< numberOfItems; i++){
			result += data[i]+", ";
		}
		result = result.substring(0, result.length()-2);
		result += "]";
		return result;
	}
}
