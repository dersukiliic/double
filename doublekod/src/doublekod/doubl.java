package doublekod;

public class doubl {

	// Java program to demonstrate 
	// allocate() method 
	  
	import java.nio.*; 
	import java.util.*; 
	  
	public class GFG { 
	    public static void main(String[] args) 
	    { 
	  
	        // Declaring the capacity of the DoubleBuffer 
	        int capacity = 10; 
	  
	        // Creating the DoubleBuffer 
	  
	        // creating object of Doublebuffer 
	        // and allocating size capacity 
	        DoubleBuffer db = DoubleBuffer.allocate(capacity); 
	  
	        // putting the value in Doublebuffer 
	        db.put(8.56F); 
	        db.put(2, 9.61F); 
	  
	        System.out.println("DoubleBuffer: "
	                           + Arrays.toString(db.array())); 
	    } 
	} 