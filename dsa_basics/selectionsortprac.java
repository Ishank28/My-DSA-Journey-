import java.util.*;
public class selectionsortprac {
    
    public static void selectionsort(int arr[]){

      int n=arr.length;
        //turns 
        for(int i=0;i<arr.length-1;i++){
         
            //find the minimum element position
            int minpos=i;
            for(int j=i+1;j<n;j++){
           if(arr[j]<arr[minpos]){
              minpos=j;
           }
            }
            //swap or bring the minelement to start
            int temp=arr[i];
            arr[i]=arr[minpos];
            arr[minpos]=temp;
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[]={5,3,4,1,2};
        selectionsort(arr);

    }
}
