import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Priti
 *
 */
public class anagram {
	static boolean isAnagram(String A, String B) {
		 char []a= A.toLowerCase().toCharArray();
	        char[]b=B.toLowerCase().toCharArray();
	       
	   
      boolean ret=false;
	    if(a!=null && b!=null){  
	    	 Arrays.sort(a);
		        Arrays.sort(b);
           ret =  Arrays.equals(a,b);
                 return ret;
	    	       }
          return ret;
	}
	//another possible solution but doesnt work with test cases 10,11 & 12
    // int sum = 0,sum1 = 0;
//       for(int i=0;i<a.length;i++)
//	       {
//    	   
//             try{ 
//            	    sum+=a[i];
//	    	   sum1+=b[i];
//             }catch(Exception e){}
//	       }
//            if(sum == sum1)
//	    	    return true;
//	          else
//	    	  return false;
//	      }else
//           return false;
//	}
//	 
	    public static void main(String[] args) {
	        
	        Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        String B=sc.next();
	       
	        boolean ret=isAnagram(A,B);
	        sc.close();
	        if(ret)System.out.println("Anagrams");
	        else System.out.println("Not Anagrams");
	        
	    }
	}



