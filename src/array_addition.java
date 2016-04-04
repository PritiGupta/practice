import java.util.Scanner;

/**
 * 
 */

/**
 * @author Priti
 *
 */
public class array_addition {
	
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int sum = 0 ;
	        System.out.println(" Enter an integer:");
	        int n = in.nextInt();
	        int arr[] = new int[n];
	        for(int arr_i=0; arr_i < n; arr_i++){
	            arr[arr_i] = in.nextInt();
	            
	            
	            sum += arr[arr_i]; 
	           // System.out.println("sum = "+ sum);
	        }
	        System.out.println("sum = "+ sum);
	    }
	}


