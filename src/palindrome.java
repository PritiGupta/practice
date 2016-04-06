/**
 * 
 */
import java.io.*;
import java.lang.*;
import java.util.*;

/**
 * @author Priti
 *
 */
public class palindrome {

	/**
	 * @param args
	 */

		    public static void main(String[] args) {
		        
		        Scanner sc=new Scanner(System.in);
		        String A=sc.next();
		        Stack<Character> stack = new Stack<Character>();;
		         for(int i =0;i<A.length();i++){
		    	  System.out.println(stack.push(A.charAt(i)));
		    	   	   }
		      String reverse="";
		      while(!stack.isEmpty()){
		    	  {
		    		  System.out.println(reverse+=stack.pop());
		    		  	  }
		    	    }
		      sc.close();
		if(A.equals(reverse))
		System.out.println("String is a Palindrome");
		else
			System.out.println("String is  not a Palindrome");
		    }
		    
}
	


