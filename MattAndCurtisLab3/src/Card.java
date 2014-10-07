//Matt Carlson & Curtis Kreidler Lab 3

import java.util.Comparator;

public final class Card {
	private eSuit Suit;
	private eRank Rank;
	private boolean Wild = false;
	
	private Card()
	{
	}
	
	public Card(eSuit suit, eRank rank) {
		Suit = suit; 
		Rank = rank; 
		this.Wild = false;
	}

	public Card(eSuit suit, eRank rank, boolean Wild) {
		Suit = suit; 
		Rank = rank; 
		this.Wild = Wild;
	}
	
	public eRank getRank() {
		return this.Rank;
	}

	public eSuit getSuit() {
		return this.Suit;
	}
	
	public boolean getWild()
	{
		return this.Wild;
	}
	
	public void setWild()
	{
		this.Wild = true;
	}

	public static Comparator<Card> CardRank = new Comparator<Card>() {

		public int compare(Card c1, Card c2) {

		   int Cno1 = c1.getRank().getRank();
		   int Cno2 = c2.getRank().getRank();

		   return Cno2 - Cno1;

	   }};

}