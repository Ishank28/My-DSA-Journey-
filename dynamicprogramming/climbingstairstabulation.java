package dynamicprogramming;

import java.util.Scanner;

public class climbingstairstabulation {
    // In the Tabulation method we find the answer by using the creation of  a table which will store the values of the changing variable 
    //we use table and a loop to find the solution eliminating the use of recursion 
    public static void main(String[] args) {
     Scanner scn=new Scanner(System.in);
        System.out.println("enter the no of stairs to be climbed");
        int n=scn.nextInt();//enter the number of stairs to be climbed
        
        int[] dp=new int[n+1];//the size is set to be n+1 because 0 to n is the level
        //initialisation 
        dp[0]=1;//we have only one way of reaching the oth level
        for(int i=1;i<dp.length;i++){
            //if we reach the first position then take care of negative value
            if(i==1){
                dp[i]=dp[i-1];
            }
            //add the ways of reaching the position 
            else{dp[i]=dp[i-1]+dp[i-2];}
        }

        System.out.println(dp[n]);
    }
    
}
