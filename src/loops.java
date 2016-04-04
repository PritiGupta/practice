/**
 * 
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * @author Priti
 *1st term=0+1*2=2
*	2nd term=0+1*2+2*2=6
*	3rd term=0+1*2+2*2+4*2=14

 */
public class loops {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		double ans=0;
			for (int i = 0; i < input; i++)
	      {
	       int a = scan.nextInt();
	       int b = scan.nextInt();
	       int n = scan.nextInt();
	       for(int j=0;j<n;j++){
	    	a+= b * (Math.pow(2,(double)j));
	           System.out.print((int)ans +" ");
	            }
	            System.out.print("\n");
	             }
		}
}