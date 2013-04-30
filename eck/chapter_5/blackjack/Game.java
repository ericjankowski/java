import java.io.*;

public class Game{
	public static void main (String [] args){
		Hand player = new Hand();
		Hand dealer = new Hand();
		Deck d = new Deck();
		
		player.hit(d.deal());
		dealer.hit(d.deal());
		player.hit(d.deal());
		dealer.hit(d.deal());
		
		System.out.println("\nDealer\n----------");
		System.out.println(dealer);
		System.out.println(dealer.getScore());
		
		System.out.println("\n\nPlayer\n----------");
		System.out.println(player);
		System.out.println(player.getScore());
		
		if(dealer.getScore() == 21){
			if(player.getScore() == 21){
				System.out.println("Push!!");
			}else{
				System.out.println("Dealer Blackjack");
			}
		}else if(player.getScore()!=21){
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try{
				while(br.readLine().equals("h")){
					player.hit(d.deal());
					System.out.println("\nDealer\n----------");
					System.out.println(dealer);
					System.out.println(dealer.getScore());

					System.out.println("\n\nPlayer\n----------");
					System.out.println(player);
					if(player.getScore()<=21){
						System.out.println(player.getScore());
					}else{
						System.out.println(player.getScore());
						break;
					}
				}
			}catch(Exception e){}
			if(player.getScore()<=21){
				while(dealer.getScore()<= 17){
					dealer.hit(d.deal());
				}
			}
			
			System.out.println("\nDealer\n----------");
			System.out.println(dealer);
			System.out.println(dealer.getScore());

			System.out.println("\n\nPlayer\n----------");
			System.out.println(player);
			System.out.println(player.getScore());
			
			if(dealer.getScore() > player.getScore() && dealer.getScore() <= 21){
				System.out.println("Dealer Wins");
			}else if(dealer.getScore() < player.getScore() && player.getScore() <= 21){
				System.out.println("Player Wins");
			}else if(player.getScore() > 21){
				System.out.println("Player Bust");
			}else if(dealer.getScore() > 21){
				System.out.println("Dealer Bust");
			}else if(dealer.getScore() == player.getScore()){
				System.out.println("Push!!!");
			}
		}else{
			System.out.println("Player Blackjack!");
		}
	}
}