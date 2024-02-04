import java.util.*;
public class prefixsumpractice {
    
    public static void maxsum(int[] parr){
        int maxsum=Integer.MIN_VALUE;
        int prefixsum=0;
        for(int i=0;i<parr.length;i++){
            for(int j=i;j<parr.length;j++){
                if(j==i){
                  prefixsum=parr[i];
                }
                else{
                     prefixsum=parr[j]-parr[i];
                }
                if(prefixsum>=maxsum){
                    maxsum=prefixsum;
                            }
            }
         
        }
        System.out.println(maxsum);
    }

    public static void main(String[] args) {
        int[] arr={1,-1,2,3};
        int[] parr=new int[4];
        int currsum=0;
        for(int i=0;i<arr.length;i++){
           currsum=currsum+arr[i];
           parr[i]=currsum;
        }
        maxsum(parr);
        
    }
}
