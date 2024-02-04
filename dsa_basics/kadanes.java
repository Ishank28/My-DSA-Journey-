import java.util.*;
public class kadanes {
    
    public static void kadanesalgo(int[] arr){
        int maxsum=Integer.MIN_VALUE;
        int currsum=0;

        for(int i=0;i<arr.length;i++){
         currsum+=arr[i];
         if(currsum<0){
            currsum=0;
         }
        maxsum=Math.max(currsum,maxsum);
        }

        System.out.println(maxsum);
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        kadanesalgo(arr);
    }
}
