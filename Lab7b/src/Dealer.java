/**
 * 
 */

/**
  * @author Matthew Verrette				Lab7b.java
 * 
 * Professor Cross						Introduction to Programming
 * 
 *The programming projects of Chapter 5 discussed a Card class 
 *that represents a standard playing card. Create a class called 
 *DeckOfCards that stores 52 objects of the Card class. Include 
 *methods to shuffle the deck, deal a card, and report the number 
 *of cards left in the deck. The shuffle method should assume a 
 *full deck. Create a driver class with a main method that deals 
 *each card from a shuffled deck, printing each card as it is dealt.
 */
public class Dealer {


	public static void main(String[] args) {
		System.out.println("**********************************************");
		System.out.println("*        Creates a Deck of Cards             *");
		System.out.println("*        Shuffles a Deck of Cards            *");
		System.out.println("*        Deals a Deck of Cards               *");
		System.out.println("**********************************************");

		Card current_card = null;
		DeckOfCards deck = new DeckOfCards();
		System.out.println();
		System.out.println("Shuffling Deck of Cards...");
		System.out.println();
		deck.shuffle();
		current_card = deck.deal();
		System.out.println("Dealing Cards...");
		System.out.println();
		while (deck.CardsLeft() != 0 || current_card == null) {
			System.out.println("-------------------------");
			System.out.println(current_card.toString());
			current_card = deck.deal();
		}
	}

}
