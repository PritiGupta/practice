import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;


/**
 * 
 */

/**
 * @author Priti
 *
 */


	public class prac1 {
		public static void main(String[] args){
	 Regex_Test test = new Regex_Test();
    test.checker("[^\n]{3}[.][^\n]{3}[.][^\n]{3}[.][^\n]{3}");
 
 }

}
class Regex_Test {

    public void checker(String Regex_Pattern){
    
        Scanner Input = new Scanner(System.in);
        String Test_String = "";
       for(int i = 0; i < 4; i+=1){
            Test_String += Input.nextLine();
        }

        Pattern p = Pattern.compile(Regex_Pattern);
        Matcher m = p.matcher(Test_String);
        int Count = 0;
        while(m.find()){
        	Count+=1;
            System.out.println("m:"+m);
        }
        
        System.out.format("Number of matches : %d",Count);
    }   
    
}
