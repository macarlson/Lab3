//Matt Carlson & Curtis Kreidler Lab 3

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
	private ArrayList<Card> cards;

	public Deck() {

		ArrayList<Card> MakingDeck = new ArrayList<Card>();
		for (short i = 0; i <= 3; i++) {
			eSuit SuitValue = eSuit.values()[i];			
			for (short j = 0; j <= 12; j++) {
				eRank RankValue = eRank.values()[j];				
				Card NewCard = new Card(SuitValue,RankValue);
				MakingDeck.add(NewCard);
			}
		}
		
		cards = MakingDeck;
		ShuffleCards();

	}
	
	public Deck(int NbrOfJokers) {

		this();
		
		for (short i = 1; i <= NbrOfJokers; i++) {
			cards.add(new Card(eSuit.JOKER,eRank.JOKER));
		}
		ShuffleCards();
	}
	
	public Deck(int NbrOfJokers, ArrayList<Card> WildCards) {

		this(NbrOfJokers);
		
		
		for (Card deckCard : cards)
		{
			for (Card WildCard: WildCards)
			{
				if ((deckCard.getSuit() == WildCard.getSuit()) &&
						(deckCard.getRank() == WildCard.getRank()))
						{
							deckCard.setWild();
						}					
			}
		}
		ShuffleCards();
	}
	
	private void ShuffleCards()
	{

		Collections.shuffle(cards);
	}

	public Card drawFromDeck() {

		Card FirstCard = cards.get(0);
		cards.remove(0);
		return FirstCard;
	}

	public int getTotalCards() {

		return cards.size();
	}
	
	public ArrayList<Card> getCards()
	{
		return this.cards;
	}
}