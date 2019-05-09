package lab;

import java.util.Random;

/**
 * Aufgabe H1c)
 * 
 * Abgabe von: Jian Dong jd81vuti
 *             Zezhi Chen zc75diqa
 *             Hanyu Sun hs54keri
 */

/**
 * Use a random pivot within Quick Sort.
 */
public class HybridSortRandomPivot extends HybridSort {
	
	public int randomPivot(int p, int r) { 
		Random rand = new Random();
		int rp = rand.nextInt((r - p) + 1) + p;
		return rp;
	}
	
}
