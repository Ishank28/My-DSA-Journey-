import java.util.Scanner;
public class Bsort {

 public static void bubblesort(int[]arr){
    for(int i=0;i<arr.length-1;i++){
        for(int j=0;j<arr.length-1-i;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
 }
 public static void printarray(int[] arr){
    for(int i : arr){
        System.out.print(i);
    }
 }
    public static void main(String[] Args){
     int arr[]={3,6,2,1,8,7,4,5,3,1};
     bubblesort(arr);
     printarray(arr);
    }
}
