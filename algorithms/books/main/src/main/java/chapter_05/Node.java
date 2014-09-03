package chapter_05;

public class Node <E>{
	private E data;
	Node<E> link;
	
	public Node(E data, Node<E> link) {
		this.data = data;
		this.link = link;
	}
	
	public E getData(){
		return data;
	}
	
	public void addNodeAfter(E data){
		
		if(link == null){
			link = new Node<E>(data, null);
		}else{
			link = new Node<E>(data, link);
		}
	}
	
	public static <E> Node<E> listSearch(Node<E> head, E target){
		Node<E> cursor;
		if (target == null){
			for (cursor = head; cursor != null; cursor= cursor.link){
				if (cursor.data == null){
					return cursor;
				}
			}
		}else{
			for (cursor = head; cursor != null; cursor = cursor.link){
				if (target.equals(cursor.data)){
					return cursor;
				}
			}
		}
		return null;
	}
	
	
	
	public static <E> Node<E>[] listPart(Node<E> start, Node<E> end){
		Node<E> copyHead;
		Node<E> copyTail;
		Node<E> cursor;
		Node<E>[] answer = (Node<E>[]) new Object[2];
		
		if (start == null) {
			throw new IllegalArgumentException("start is null.");
		}
		if (end == null) {
			throw new IllegalArgumentException("end is null.");
		}
		
		copyHead = new Node<E>(start.data, null);
		copyTail = copyHead;
		cursor = start;
		
		while (cursor != end){
			cursor = cursor.link;
			if (cursor == null){
				throw new IllegalArgumentException("end node was not found on the list.");
			}
			copyTail.addNodeAfter(cursor.data);
			copyTail = copyTail.link;
		}
		
		answer[0] = copyHead;
		answer[1] = copyTail;
		return answer;
		
	}
}
