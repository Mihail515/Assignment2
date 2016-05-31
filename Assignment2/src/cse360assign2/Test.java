/* NAME: MIHAIL MARTINICH
 * PIN: 47
 * DESCRIPTION: Test file that implements Analytics methods and prints them to screen
 */

package cse360assign2;
public class Test {
	
	public static void main(String[] args){
		
		/////////////////////////////////////////
		//Testing empty list (should return -1)
		OrderedIntList listOne = new OrderedIntList(); //inserting lengthy array of integers
		Analytics li = new Analytics();
		listOne = li;
		
		((Analytics) listOne).print();
	    System.out.println();
	    System.out.println("Mean is " + ((Analytics) listOne).Mean());
	    System.out.println("Median is " + ((Analytics) listOne).Median());
	    System.out.println("High is " + ((Analytics) listOne).High());
	    System.out.println("Low is " +((Analytics) listOne).Low());
	    System.out.println("Number of integers is " + ((Analytics) listOne).numInts());
		
	    
	    /////////////////////////////////////////
	    // Testing random, large array even
		OrderedIntList listL = new OrderedIntList(); //inserting lengthy array of integers
		Analytics l = new Analytics();
		listL = l;
		listL.insert(12);
		listL.insert(2);
		listL.insert(4);
		listL.insert(3);
		listL.insert(5);
		listL.insert(6);
		listL.insert(9);
		listL.insert(8);
		listL.insert(7);
		listL.insert(10);
		listL.insert(11);
		listL.insert(1);
		
		System.out.println("\nList two: ");
		//Printing method results
	    ((Analytics) listL).print();
	    System.out.println();
	    System.out.println("Mean is " + ((Analytics) listL).Mean());
	    System.out.println("Median is " + ((Analytics) listL).Median());
	    System.out.println("High is " + ((Analytics) listL).High());
	    System.out.println("Low is " +((Analytics) listL).Low());
	    System.out.println("Number of integers is " + ((Analytics) listL).numInts());
	    
	    
	    /////////////////////////////////////////
	    // Testing decreasing, small odd array
	    OrderedIntList list = new OrderedIntList(); //inserting lengthy array of integers
		Analytics la = new Analytics();
		list = la;
		list.insert(10);
		list.insert(9);
		list.insert(8);
		list.insert(7);
		list.insert(6);
		list.insert(5);
		list.insert(4);
		list.insert(3);
		list.insert(2);
		
		//Printing method results
		System.out.println("\nList three: ");
	    ((Analytics) list).print();
	    System.out.println();
	    System.out.println("Mean is " + ((Analytics) list).Mean());
	    System.out.println("Median is " + ((Analytics) list).Median());
	    System.out.println("High is " + ((Analytics) list).High());
	    System.out.println("Low is " +((Analytics) list).Low());
	    System.out.println("Number of integers is " + ((Analytics) list).numInts());
	}
	
	
	
}
