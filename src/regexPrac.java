/**
 * 
 */

/**
 * @author Priti
 *
 */
public class regexPrac {

	/**
	 * @param args
	 * @return 
	 */
	static String choice;
	static String s;
	public  static String getResultForCuisine(String cuisineChoice)
	{
		if(cuisineChoice.matches("American|Greek|Thai|Italian|Pizza")){
			//System.out.println(choice.matches("\b(American|Greek|Thai|Italian)\b"));
		return cuisineChoice;
		}else
			return null;

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Greek";
	choice = getResultForCuisine(s);
	System.out.println("choice is :"+choice);
		


	
	}
}
