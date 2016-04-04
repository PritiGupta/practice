/**
 * 
 */

/**
 * @author Priti
 *
 */

	
	import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;

	public class  Solution{
		static boolean flag=false;
		static int B;
		static int H;
		public static void main(String[] args){
			Scanner scan = new Scanner(System.in);
			B=scan.nextInt();
			H=scan.nextInt();
			
			
		if (B>=0&&H>=0) {
			flag= true;
				if (flag) {
					int area = B * H;
					System.out.print(area);
					} 
			}else{
			flag=false;
			System.out.println("java.lang.Exception: Breadth and height must be positive");
			}
		scan.close();
		}//end of main


}
