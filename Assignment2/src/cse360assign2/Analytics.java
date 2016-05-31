/* NAME: MIHAIL MARTINICH
 * PIN: 47
 * DESCRIPTION: Analytics implements different methods, using array from parent
 * class OrderedIntList
 */

package cse360assign2;

public class Analytics extends OrderedIntList { 
	
	//Constructor
	Analytics (){
		a = new int[10]; // array of size 10 is specified
	}
	
	// Mean method
	public double Mean(){
		if (a[0] == 0)
			return -1; //If list if Empty
		/////////////////////////////////
		double mean = 0;
		int counter = 0;
		for (int i = 0; i <c ; i++){ //number
			if (a[i] != 0){ 
				counter++; //keeps count of actual integers
				}
			mean = a[i] + mean; 
		}
		return (mean/counter);
	}

	// Median Method
	public int Median(){
		if (a[0] == 0)
			return -1; //If list if Empty
		//////////////////////////////////
		int counter = 0;
		for (int i = 0; i < c; i++){ //counter will keep track of actual integers not just empty spaces
			if (a[i] != 0)
				counter++;}
		int[] temparray = new int[counter]; //use temporary array to compare actual number of integers (since c might not be accurate)
		if (temparray.length % 2 == 0) //If size of array is even
			return ((int)a[counter/2] + (int)a[counter/2 - 1])/2;

		
		   return a[counter/2]; //If is odd return middle number
		
	}
	// High Method
	public int High(){
		if (a[0] == 0)
			return -1; //If list if Empty
		///////////////////////////////////
		int high = 0;; //temporary method variable used to store highest number
		for (int i = 0; i < c; i++){
			if (c == 0)
				return high;
			else 
				high = a[i]; //return last non-zero integer in the sorted array
			
		}
		return high;
	}
	
	// Low Method
	public int Low(){
		if (a[0] == 0)
			return -1; //If list if Empty
		//////////////////////////////////
		return a[0]; //return first item in the sorted array
	}
	
	//Method numInts
	public int numInts(){
	
		int counter = 0;
		for (int i = 0; i < c; i++){
			if (a[i] != 0)
				counter++; //keep track of nonzero items in the array
		}
				
			return counter;
	}
		
}
