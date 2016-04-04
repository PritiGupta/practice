import java.util.Scanner;

public class solution3{

    @SuppressWarnings("resource")
	public static String objTest(Object o) {
    	  double y = 1.00; 
          int x = 2;
          String s = "hello";
          String ans = null;
        	for(int i=0;i<3;i++){
        		o.getClass();
        	         
               if(o.equals(s)){
        		 ans ="String:"+s;
               return ans;
               }
               if(o.equals(y)){
            	ans = "Double:"+ y;
               return ans;
               }
               if (o.equals(x)){
                  ans = "Int:"+ x;
                  return ans;
        	}
        	 	
    }
			return ans;
			
    }
}
