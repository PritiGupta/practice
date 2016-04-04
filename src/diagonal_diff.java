import java.util.Scanner;

public class diagonal_diff {
	public static void main(String args[]){
	Scanner in = new Scanner(System.in);
	System.out.println("enter a int:");
    int n = in.nextInt();
	//int n = 4;
    //int diff=0;
    int a[][] = new int[n][n];
   // int a[][] = new int[3][4];
    for(int a_i=0; a_i < n; a_i++){
        for(int a_j=0; a_j < n; a_j++){
            a[a_i][a_j] = in.nextInt();
            System.out.print("[a_j]:"+ a_j +" ");
           // diff +=  a[a_i][a_j];
        }
        System.out.print("a[a_i]:" + a_i+" ");
       // System.out.println(diff+"=diff");
}
    
}
}