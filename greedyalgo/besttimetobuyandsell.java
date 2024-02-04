package greedyalgo;
import java.util.*;
import java.util.Arrays;

public class besttimetobuyandsell {

    public static void main(String[] args) {
    int[][] dayvsprice={{0,7},{1,1},{2,5},{3,3},{4,6},{5,4}};
    int n=dayvsprice.length;
    Arrays.sort(dayvsprice,Comparator.comparingDouble(o -> o[1]));
    for(int i=0;i<n;i++){
        for(int j=0;j<2;j++){
            System.out.print(dayvsprice[i][j] + " ");
        }
        System.out.println();
    }
    
    //now using the least and the maximum prices of the stock to calculate the max profit greedily
    int count=0;
    for(int i=0 ; i < n;i++){
        //check for each condition when the stock is bought at minimum price
        for(int j=n-1 ;j>i;j--){
            if( dayvsprice[i][0] < dayvsprice[j][0]){//purchase day is before sale day
                int profit=dayvsprice[j][1]-dayvsprice[i][1];
                System.out.println("the max profit is " + profit );
                    count=1;
                    break;
                }  
            }
            if(count==1){
                break;
            }
        }
    
    if(count==0){
         System.out.println("not possible");
    }
}
}
