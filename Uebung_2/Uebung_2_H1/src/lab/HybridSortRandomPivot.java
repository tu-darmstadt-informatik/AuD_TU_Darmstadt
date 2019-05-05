package lab;

import java.util.Random;

/**
 * Aufgabe H1c)
 * 
 * Abgabe von: <name>, <name> und <name>
 */

/**
 * Use a random pivot within Quick Sort.
 */
public class HybridSortRandomPivot extends HybridSort {
	// TODO: Implement 
	
	public int randomPivot(int p, int r) {//gamz richtig $dj$
		Random rand = new Random();
		int rp = rand.nextInt((r - p) + 1) + p;
		return rp;
	}
	
}
