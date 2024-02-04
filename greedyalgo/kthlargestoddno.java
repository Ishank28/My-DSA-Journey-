package greedyalgo;
import java.util.*;
import java.util.Arrays;
import java.util.Collections;
public class kthlargestoddno {
    
    public static void main(String[] args) {
        
        Scanner scn=new Scanner(System.in);
        System.out.println("enter the starting,ending and kth number");
         int n=scn.nextInt();//starting number
        int last=scn.nextInt();//ending num
        int k=scn.nextInt();
        Integer[] arr=new Integer[last-n+1];
        int start=n;
        int a=0;
        while( start <=last ){
            arr[a]=start;
            start++;
            a++;
        }
        //sorting the array in descending order 
        Arrays.sort(arr,Collections.reverseOrder()); 
        //now we have to find the kth largest odd no.
        int pointer=0;
        for(int i=0;i<arr.length;i++){
            if( arr[i] % 2 != 0){
           pointer++;
        }
        if(pointer==k){
            System.out.println("The Kth largest odd number is " + arr[i]);
            break;
        }
        if(i==arr.length-1){
            System.out.println("0");
        }
    }
    }
}
