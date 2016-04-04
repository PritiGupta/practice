import java.util.Scanner;

/**
 * 
 */

/**
 * @author Priti
 *
 */
public class long_addition {
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        System.out.println("Enter a integer:");
	        int n = in.nextInt();
	        long sum = 0;
	        int arr[] = new int[n];
	        for(int arr_i=0; arr_i < n; arr_i++){
	            arr[arr_i] = in.nextInt();
	            sum += arr[arr_i];
	        }
	        System.out.println(sum);
}
}