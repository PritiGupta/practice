import java.util.Scanner;
import java.io.*;

/**
 * 
 */

/**
 * @author Priti
 *
 */
public class stringfunc {
	 public static void main(String[] args) {
	        
	        @SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        String B=sc.next();
	        System.out.println(A.length() + B.length());
	       // System.out.println(A.compareTo(B));
	        if(A.compareTo(B)>0){
	        	
	        	System.out.println("Yes");
	        }
	        else{
	        	System.out.println("No");
	        	
	        }
	       
	       String x =stringUpperCase(A);
	       String y = stringUpperCase(B);
	       System.out.println(x+" "+y);
	       

}

	/**
	 * @param A
	 */
	private static String stringUpperCase(String capitalfirstLetter) {
		if(capitalfirstLetter == null || capitalfirstLetter.length()== 0){
	    	   return capitalfirstLetter;
	       } else
	    		 return  capitalfirstLetter.substring(0, 1).toUpperCase() + capitalfirstLetter.substring(1);
	}
}
