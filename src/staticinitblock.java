	import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;
	
	
	public class staticinitblock {
		static Scanner s = new Scanner(System.in);
		 static int B = s.nextInt();
		 static int H = s.nextInt();
		static boolean flag= true;


		static{
		        if(!(B>0 && H>0)){  
		         flag = false; 
		        System.out.println(" Breadth and height must be positive");
		           }

		}
		public static void main(String args[]){
		
			if(flag){
				int area=B*H;
				System.out.print(area);
			}
				
		}
	}

	
