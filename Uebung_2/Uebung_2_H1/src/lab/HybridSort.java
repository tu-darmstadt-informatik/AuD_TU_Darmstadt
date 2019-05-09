package lab;

import java.util.ArrayList;
import java.util.Random;

/**
 * Aufgabe H1b)
 * 
 * Abgabe von: Jian Dong jd81vuti
 *             Zezhi Chen zc75diqa
 *             Hanyu Sun hs54keri
 */

import frame.SortArray;

public class HybridSort {
	
	/**
	 * Sort the given array using a hybrid method of Quick Sort and Insertion Sort.
	 * 
	 * @param array The array to sort.
	 * @param k Parameter k when we switch from Quick Sort to Insertion Sort: If the size of the subset which should be sorted is less than k, use Insertion Sort,
	 * 			otherwise keep on using Quick Sort.
	 */
	public void sort(SortArray array, int k) { 
		assert(k>=0);
		int p = 0;
		int r = array.getNumberOfItems() - 1;
		hySort(array, k, p, r);
	}

	public void hySort(SortArray array,int k, int p, int r) { 
		int q = 0;
		if (r > p) {
		    if ( r - p +1  >= k) { 
			    q = partion(array, p, r);
			    hySort(array, k, p, q-1);
			    hySort(array, k, q+1, r);
		    }
		    else {
			    insertionSort(array, p, r);
		    }
		}
	}
	
	public int partion(SortArray array, int p, int r) { 
		int pivot = randomPivot(p, r);
		cardSwap(array, p, pivot);
		Card x = new Card(array.getElementAt(p)); // Pivotelement
		int i = p;
		for (int j = p+1 ; j < r+1 ; j++) {
			if (array.getElementAt(j).compareTo(x) <= 0 ) {
				i = i + 1;
				cardSwap(array, i, j);
			}
		}
		cardSwap(array, i, p);
		return i;
		
	}
	
	public int randomPivot(int p, int r) {//gamz richtig $dj$
		return p;
	}
	
	public void cardSwap(SortArray array, int i, int j) { //dj
		Card tmp = new Card(array.getElementAt(i));
		array.setElementAt(i, array.getElementAt(j));
		array.setElementAt(j, tmp);
	}
	
	//below are methods for insertionSort 
	public void insertionSort(SortArray array, int p, int r) {
		int i;
		for (int j = p+1; j<= r; j++) {
			Card key = new Card(array.getElementAt(j));
			i = j - 1;
			while (i >= p && array.getElementAt(i).compareTo(key) > 0) {
				array.setElementAt(i+1, array.getElementAt(i));
				i = i - 1;
			}
			array.setElementAt(i+1,key);
		}
	}
	
	//below are methods for mergeSort 
	/*
	public void mergeSort(SortArray array, int p, int r) { //dj
		int q;
		if ( p < r ) {
			q = ( p + r ) / 2;
			mergeSort(array, p, q);
			mergeSort(array, q+1, r);
			merge(array, p, q, r);
		}
	}
	
	public void merge(SortArray array, int p, int q, int r) { //dj
		int n1 = q - p + 1;
		int n2 = r - q;
		
		ArrayList<Card> L = new ArrayList<Card>();
		for (int i = 0; i <= n1-1; i++) {
			L.add(array.getElementAt(i));
		}
		
		ArrayList<Card> R = new ArrayList<Card>();
		for (int i = 0; i <= n2-1; i++) {
			R.add(array.getElementAt(n2 + q));
		}	
		int i = 0;
        int j = 0;
        for (int k = p; k <=r; k++) {
        	if ( i == L.size() ) {
        		array.setElementAt(k, R.get(j));
        		j = j + 1;
        	}
        	else if ( j == R.size() ) {
        		array.setElementAt(k, L.get(i));
        		i = i + 1;
        	}
            else if ( L.get(i).compareTo(R.get(j)) <= 0 ) {
        		array.setElementAt(k, L.get(i));
        		i = i + 1;
        	}
        	else {
        		array.setElementAt(k, R.get(j));
        		j = j + 1;
        	}
        }
	}
	*/
}
