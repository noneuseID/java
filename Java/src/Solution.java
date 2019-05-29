import java.util.*;


public class Solution {
    static Scanner in=new Scanner(System.in);
    static boolean flag=true;
    static int B,H;
    static{
        B=in.nextInt();
        H=in.nextInt();
        if(B<0 ||H<0){
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }

    }


public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class


