import java.util.*;
public class largestnoinarray {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int largest=Integer.MIN_VALUE;
     for(int i=0;i<n;i++){
        if(arr[i]>largest){
            largest=arr[i];
        }
    }
        System.out.println(largest);
    }
}
