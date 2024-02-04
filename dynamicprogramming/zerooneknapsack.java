package dynamicprogramming;

public class zerooneknapsack {

    public static int knapsack(int[] value,int[] wt,int w,int n,int[][] dp){

        if(w==0 || n==0 ){
            return 0;
        }

        //if nth object is eliginle for inclusion
        if(wt[n]<=w){
            //now i wish to include
             int ans1=value[n]+knapsack(value,wt,w-wt[n],n-1,dp);
            //exclusion 
            int ans2=knapsack(value,wt,w,n-1,dp);
            return Math.max(ans1, ans2);
        }
        else{
            return knapsack(value,wt,w,n-1,dp);
        }

    } 
  
    public static void main(String[] args) {
        int val[]={15,14,10,45,30};
        int wt[]={2,5,1,3,4};
        int W=7;
        int[][] dp=new int[val.length+1][wt.length+1];
        for(int i=0;i<val.length;i++){
            for(int j=0;j<wt.length;j++){
                dp[i][j]= -1;
            }
        }
        System.out.println(knapsack(val,wt,W,val.length-1,dp));
    }
    
}
