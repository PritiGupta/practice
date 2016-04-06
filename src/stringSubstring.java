import java.util.Scanner;
import java.util.*;


/**
 * 
 */

/**
 * @author Priti
 *
 */
public class stringSubstring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner scan = new Scanner(System.in);
	       String s1 = scan.next();
	       	 int index =scan.nextInt();
	          	String s2;
	      
	       	SortedSet<String> set = new TreeSet<String>();
	       	try{
	            			 for(int i=0; i<s1.length()-1; i++){
	        				 
	        				 s2 = s1.substring(i,index);
	        				 index++;
	        				 System.out.println("s2:"+s2);
	        				
	        				set.add(s2);
	            			 }
	        			
	        			         }catch (Exception se){
		            				 
		            			 }		
	            			 System.out.println("setmin:"+set.first());
		        			 System.out.println("setmax:"+set.last());
		        			        	 
	        			 }

}

