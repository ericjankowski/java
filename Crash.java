public class Crash{
	public static void main (String [] args){
		Crash head = new Crash(new String("valueWithALotOfChatactersButNotTooMany"));
		buildBigTree(head);
	}

	public String value;
	public Crash left;
	public Crash right;
	public Crash center;

	public Crash(String value){
		this.value = value;
	}

	public static Crash buildBigTree(Crash parent){
		parent.left = new Crash(new String("valueWithALotvalueWithALotOfChatactersButNotTooMany");
		parent.center = new Crash(new String("valueWithALotOfChatactersButNotTooMany");
		parent.right = new Crash(new String("valueWithALotOfChatactersButNotTooMany");
		buildBigTree(parent.left);
		buildBigTree(parent.right);
		buildBigTree(parent.center);
	}
}
