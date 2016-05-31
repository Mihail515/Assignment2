/* NAME: MIHAIL MARTINICH
 * PIN: 47
 * DESCRIPTION: Code has been edited to meet coding standards as well as added
 * documentation. Code was also tested afterwards to make sure it worked.
 */

package cse360assign2;
/*
 * Declaring class 
 */
public class OrderedIntList {
	
	
	protected int[] a;   // declaring global array of integers
	protected int c; 	   // declaring global integer
	
	/* 
	 * Class Constructor
	 */
	OrderedIntList () { 
		
		a = new int[10]; // array of size 10 is specified
		
	} // end of constructor
	

	/* 
	 * Insertion Method takes integer as parameter
	 */
	public void insert (int v) {
		
		if (c == a.length){ //when there are more than 10 elements, perform method grow
			grow();
		} // end of if
		if (c == 0){ // if array is empty, insert current integer at index 0
			a[0] = v;
			c++;
	    } // end of if
		else {
			
			int j = 0;
			
				for (int i = 0; i < c; i++){
					if (v < a[i]) {
						break;
						} // end of if
					j++;
				} // end of for loop
				for (int i = c; i > j; i--){
					a[i] = a[i - 1];
					} // end of for loop
				
				a[j] = v; 
				c++; 
				
		}// end of else
	}// end of insert method
	
	/*
	 * void method grow() increments array size if more than 10 elements are inserted
	 */
	private void grow(){
		
		int t[] = new int[c * 2]; // creating temporary array with twice the size of current array (20)
		
		for (int i = 0; i < c; i++){
			t[i] = a[i]; // copying items into temporary array
		} // end of for
		a = t; // duplicating current array
		
	}// end of grow() method
	
	/*
	 * void method print() prints the array inserted
	 */
	public void print () {
		
		for (int i = 0; i < c; i++) {
			
			if (i % 5 == 0) {
				System.out.println();
				} // end of iff
			
			System.out.print(a[i] + "\t");
			
			} // end of for
		
		System.out.println();
		
	} // end of print() method
} // end of public class

