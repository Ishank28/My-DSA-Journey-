import java.util.*;

public class raa {

    public static void reversearr(int arr[]){
        int n=arr.length-1;
        for(int i=0;i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-i];
            arr[n-i]=temp;
        }

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        reversearr(arr);
for(int i : arr){
    System.out.println(i);
}

    }
}
