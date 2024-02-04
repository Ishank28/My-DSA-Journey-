import java.util.*;
public class buyandsellstocks {
    
    public static void buyandsell(int[] prices){
        //check for buying price
        int buy=prices[0]; 
       int profit=0;
        for(int i=1;i<prices.length;i++){
           
            if ( prices[i]<=buy) {
                buy=prices[i];
            }
           else{
            int sell=prices[i];
            int checkprofit=sell-buy;
            if(checkprofit>profit){
                profit=checkprofit;
            }
            
           } 
        }
        System.out.println(profit);
    }
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        
        buyandsell(arr);
    }
}
