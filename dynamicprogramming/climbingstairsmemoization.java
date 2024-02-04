package dynamicprogramming;
import java.util.*;
public class climbingstairsmemoization {

    public static int countways(int n,int[] dp){

        //base case 
        if(n==0){
            return 1;//assign 1 way of reaching 0th level from 0th level 
        }

        if(n < 0){
            return 0;//for ex for n=1,n-2=-1 so ways of reaching -1th level=0
        }

        if( dp[n] != -1 ){
            return dp[n];//if we have already counted the ways of reaching a particular level then return that 
        }
        else{
        dp[n]=countways(n-1,dp)+countways(n-2,dp);//add the ways of reaching n-1th level and n-2th level.
        return dp[n];//return the ways 
        }

    }


    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter the no of stairs to be climbed");
        int n=scn.nextInt();//enter the number of stairs to be climbed
        //create an array dp for memoization
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(countways(n,dp));
    }
    
}
