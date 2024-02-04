import java.util.*;

public class prefixarraymaxsuarray {

    public static void prefixarray(int arr[],int prearr[]){
    
        for(int i=1;i<arr.length;i++){
            if(i==0){
                prearr[i]=arr[i];
            }
            prearr[i]=prearr[i-1]+arr[i];
        }
    }
    public static void main(String[] args) {
        int cursum=0;
        int maxsum=Integer.MIN_VALUE;
        
        int arr[]={1,-2,6,-1,3};
        int prearr[]=new int[arr.length];
        prefixarray(arr,prearr);

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(i==0){
                    cursum=prearr[j];
                   
                }
                else{
                    cursum=prearr[j]-prearr[i-1];  
                }
                if(cursum>maxsum){
                    maxsum=cursum;
                } 
            }
        }

        System.out.println("THE MAX SUBARRAY SUM IS " + maxsum);

    }
}
