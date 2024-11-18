package firstproject;

public class Narrowcasting {
	 public static void main(String[] args) 
	    { 
	        double n = 500.123; 
	  
	        // Narrowing Type Casting 
	        short j = (short)n; 
	        int k = (int)n; 
	        double p = (double)500.0000;
	  
	        System.out.println("Original Value before Casting"
	                           + n); 
	        System.out.println("After Type Casting to double "
                    + p); 
	        System.out.println("After Type Casting to short "
	                           + j); 
	        System.out.println("After Type Casting to int "
	                           + k); 
	        
	       
	    } 
	}

