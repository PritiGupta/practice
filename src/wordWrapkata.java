import java.util.Scanner;

/**
 * 
 */

/**
 * @author Priti
 *
 */
public class wordWrapkata {

	/**
	 * @param args
	 */

	public static String wrap(String s, int column) {
		
		int space;
			if (s.length() <= column) {
				return s;
			}
			 space = s.substring(0, column+1).lastIndexOf(' ');
			
			 System.out.println(space);
			if (space != -1){
				// wraps the string to the exact # as the column
				return s.substring(0, space+(column-space)) + "\n" + wrap((s.substring(space+1)), (column));
				// wraps the string according to the spaces. line break after he space
				//return s.substring(0, space) + "\n" + wrap((s.substring(space+1)), (column));
			} else
					return s.substring(0, column) + "\n" + wrap(s.substring(column), (column));
				}
	
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int num = scan.nextInt();
		//wrap(str, num);
		System.out.println(wrap(str,num));
	}

}
