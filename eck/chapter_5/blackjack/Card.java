public class Card {
	
	private String display;
	private int value;
	
	public Card(String display, int value){
		this.setValue(value);
		this.setDisplay(display);
	}
	
	public String getDisplay(){
		return this.display;
	}
	
	public int getValue(){
		return this.value;
	}
	
	public void setValue(int value){
		this.value = value;
	}
	
	public void setDisplay(String display){
		this.display = display;
	}
}