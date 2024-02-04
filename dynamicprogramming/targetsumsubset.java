package dynamicprogramming;
public class targetsumsubset {

    public static boolean targetsum(int[] arr,int target){
        int n=arr.length;
        boolean[][] dp=new boolean[n+1][target+1];
        //initialising the conditions on basis of base case
        for(int i=0;i<n+1;i++){
            dp[i][0]=true;//for all items if sum=0,then always possible
        }
        //we ignore the initialising for obtaining sum>0 for 0 items since java always keep false as inbuilt 


        for(int i=1;i<n+1;i++){
            for(int j=1; j<target+1 ; j++){
                int val=arr[i-1];//using the value of items present in the array.
                //include the number in subarray
                if(val<=j && dp[i-1][j-val]==true){
                    dp[i][j]=true;
                }
                //exclude
                else if(dp[i-1][j]==true){
                    dp[i][j]=true;
                }
            }
        }

        return dp[n][target];

    }
    
    public static void main(String[] args) {
        int[] arr={4,2,7,1,3};
        int target=10;
        System.out.println(targetsum(arr,target));
    }
}

