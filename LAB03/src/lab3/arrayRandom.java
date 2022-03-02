package lab3;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Random; 

public class arrayRandom {

	public arrayRandom() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
	        int userInput = 0 ; 
	        
	        System.out.print( "Please enter your value : " );
	        try {
	            userInput = Integer.parseInt( br.readLine() );  // Read user input
	        } catch ( NumberFormatException nfe) {
	            System.err.println( "Invalid Format!" );
	        }
	        
	        System.out.println( "-----------------------");
	        
	        Random ran = new Random();  
	        int[] x = new int [userInput];
	        
	        for ( int i = 0 ; i < userInput ; i++ ){
	        	
	            int Number = ran.nextInt(99);   
	            x[i] = Number;
	            System.out.println( "Array["+ (i+1) +"] = "+ x[i]) ;
	            
	        }

	    }

}
