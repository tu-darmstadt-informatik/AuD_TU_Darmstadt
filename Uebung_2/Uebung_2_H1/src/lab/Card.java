package lab;

/**
 * Aufgabe H1b)
 * 
 * Abgabe von: Jian Dong jd81vuti
 *             Zezhi Chen zc75diqa
 *             Hanyu Sun hs54keri
 */

public class Card {
	
	// DO NOT MODIFY
	public enum Suit {
		Hearts, Diamonds, Clubs, Spades
	}
	
	// DO NOT MODIFY
	public int value;
	public Suit suit;
	
	// DO NOT MODIFY
	public Card() {
	}
	
	// DO NOT MODIFY
	public Card(int value, Suit suit) {
		this.value = value;
		this.suit = suit;
	}
	
	// DO NOT MODIFY
	public Card(Card other) {
		this.value = other.value;
		this.suit = other.suit;
	}
	
	public String toString() {
		return value+";"+suit;
	}
	
	/**
	 * Compare two card objects. Return -1 if this is deemed smaller than the object other, 0 if they are
	 * deemed of identical value, and 1 if this is deemed greater than the object other.
	 * @param other The object we compare this to.
	 * @return -1, 0 or 1
	 */
	public int compareTo(Card other) { 
		if (this.value > other.value) {
			return 1;
		}
		else if (this.value < other.value) {
			return -1;
		}
		else {// Diamonds 1, Hearts 0, Spades 3, Clubs 2,
			if (this.suit.ordinal() == 2) {
				if (other.suit.ordinal() == 2) {
					return 0;
				}
				else {
					return 1;
				}
			}
			else if (this.suit.ordinal() == 3) {
				if (other.suit.ordinal() ==1 || other.suit.ordinal() == 0) {
					return 1;
				}
				else if (other.suit.ordinal() == 3 ) {
					return 0;
				}
				else {
					return -1;
				}
			}
			else if (this.suit.ordinal() == 0) {
				if (other.suit.ordinal() == 1) {
					return 1;
				}
				else if (other.suit.ordinal() == 0) {
					return 0;
				}
				else {
					return -1;
				}
			}
			else {
				if (other.suit.ordinal() == 1) {
					return 0;
				}
				else {
					return -1;
				}
			}
		}
	}
	
}
