import java.util.*;

public class Deck{
	private List<Card> cards;
	
	public Deck(){
		cards = new ArrayList<Card>();
		for(int j = 0; j<4; j++){
			cards.add(new Card("A", 11));
			cards.add(new Card("K", 10));
			cards.add(new Card("Q", 10));
			cards.add(new Card("J", 10));
		}
		for (int i = 2;i<11;i++){
			for(int j = 0; j<4; j++){
				cards.add(new Card(String.valueOf(i), i));
			}
		}
		shuffle();
	}
	
	public List<Card> getCards(){
		return cards;
	}
	
	public void shuffle(){
		for(int i=0;i<10000;i++){
			int index1 = (int)(Math.random()*52);
			this.cards.add(this.cards.remove(index1));
		}
	}
	
	public Card deal(){
		return cards.remove(0);
	}
}