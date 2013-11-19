/**
 * 
 */

/**
 * @author user
 *
 */
public class Card {

	private int value;
	private int suit;
	
	public static final int HEARTS = 0;
	public static final int SPADES = 1;
	public static final int CLUBS = 2;
	public static final int DIAMONDS = 3;
	
	public Card(int value, int suit) {
		this.value = value;
		this.suit = suit;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getSuit() {
		return suit;
	}

	public void setSuit(int suit) {
		this.suit = suit;
	}

	@Override
	public String toString() {
		String value_string;
		String suit_string;
		if (value == 11) {
			value_string = "Jack";
		} else if (value == 12) {
			value_string = "Queen";
		} else if (value == 13) {
			value_string = "King";
		} else if (value == 1) {
			value_string = "Ace";
		} else {
			value_string = Integer.toString(value);
		}
		
		if (suit == 0) {
			suit_string = "Hearts";
		} else if (suit == 1) {
			suit_string = "Spades";
		} else if (suit == 2) {
			suit_string = "Clubs";
		} else {
			suit_string = "Diamonds";
		}
		return value_string + " of " + suit_string;
	}
	
	
}
