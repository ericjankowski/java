
import java.util.*;

public class Hand{
	private List<Card> cards;
	
	public Hand(){
		this.cards = new ArrayList<Card>();
	}
	
	public int getScore(){
		int score = 0;
		for(Card c: cards){
			score+= c.getValue();
		}
		if(score > 21){
			for(Card c: cards){
				if(c.getValue() == 11){
					c.setValue(1);
					return getScore();
				}
			}
		}
		return score;
	}
	public List<Card> getCards(){
		return cards;
	}
	public void hit (Card card){
		this.cards.add(card);
	}
	
	public String toString(){
		String s = "";
		for(Card c: cards){
			s += c.getDisplay() + " ";
		}
		return s;
	}
}