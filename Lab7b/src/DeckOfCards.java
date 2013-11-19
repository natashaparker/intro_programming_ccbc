import java.util.Random;

/**
 * 
 */

/**
 * @author user
 *
 */
public class DeckOfCards {

	/**
	 * 
	 */
	
	private Card[] cards;
	private int cards_left;
	private final int DECK_SIZE = 52;
	
	public DeckOfCards() {
		cards = new Card[DECK_SIZE];
		cards_left = DECK_SIZE;
		for (int i = 0; i < 13; i ++) {
			cards[i] = new Card(i + 1, Card.HEARTS);
			cards[i + 13] = new Card(i + 1, Card.SPADES);
			cards[i + 26] = new Card(i + 1, Card.DIAMONDS);
			cards[i + 39] = new Card(i + 1, Card.CLUBS);
		}
	}
	
	public int CardsLeft() {
		return cards_left;
	}
	
	public Card deal() {
		if (cards_left == 0 ) {
			return null;
		}
		cards_left--;
		return cards[cards_left];
	}
	
	public void shuffle() {
		Random rand = new Random();
		Card temp;
		int rand_int;
		
		for (int i = 0; i < cards_left; i++) {
			rand_int = rand.nextInt(cards_left);
			temp = cards[i];
			cards[i] = cards[rand_int];
			cards[rand_int] = temp;
		}
	}
	
}

