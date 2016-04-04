
 import java.io.*;
 import java.util.*;
 import java.text.*;
 import java.math.*;
 import java.util.regex.*;
/**
 * @author Priti
 *
 */
		//If NN is odd, print "Weird".
//		If NN is even and, in between the range of 2 and 5(inclusive), print "Not Weird".
//		If NN is even and, in between the range of 6 and 20(inclusive), print "Weird".
//		If NN is even and N>20N>20, print "Not Weird".
		
		    

		    public class Solution1 {
   
public static String getSolution(int input){
		        	
		             String ans= "Weird";
		              		while(isEven(input)) {
							if (input >= 2 && input <= 5) {
								ans = "NotWeird";
								return ans;
							  }
							else if(input > 5 && input <= 20) {
								ans = "Weird";
								return ans;
							}else if(input >= 21)
								ans = "notweird";
							  return ans;
		        			}
		        		return ans;
		    }
			public static boolean isEven(int number){
				System.out.println(number);
				if(number%2 == 0){
					return true;
				}
				else if(number%2 >1){
					return false;
					}
				return false;   
				}
}



