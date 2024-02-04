package divideandconquer;

import java.util.Arrays;
import java.util.Scanner;

public class majorityelement {
    
    public static void main(String[] args) {
        
        int arr[]=new int[6];
        //input of elements in an array
        Scanner scn=new Scanner(System.in);
    for(int i=0;i<arr.length;i++){
        arr[i]=scn.nextInt();
    }
    //sorting the array so that i get an array that is having all the majority ekements consecutively 
    Arrays.sort(arr,0,arr.length-1);

  //Now checking the count,if it is greater than majority count.

    int si=0;
    int ei=arr.length-1;
    int count=1;
    
    for(int i=1;i<arr.length;i++){    
        if(arr[i-1]==arr[i]){
            count++;
        }
        if( arr[i-1]!=arr[i] && count<=arr.length/2){
            count=1;
        }
        else if(count==(arr.length/2)+1){
            System.out.println("the majority element is "+  arr[i]);
            break;
        }
        
    }

    if(count<=arr.length/2){
        System.out.println("no majority element is found");
    }
    }
}
