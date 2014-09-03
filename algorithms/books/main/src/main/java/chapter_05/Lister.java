package chapter_05;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Lister<E> implements Iterator<E>{
	Node<E> cursor;
	
	public Lister(Node<E> head){
		cursor = head;
	}
	
	public boolean hasNext(){
		return cursor != null;
	}
	
	public E next(){
		if(this.hasNext()){
			cursor = cursor.link;
			return cursor.getData();
		}else{
			throw new NoSuchElementException();
		}
	}
	
	public void remove(){
		throw new UnsupportedOperationException("The remove method is not supported.");
	}
}
