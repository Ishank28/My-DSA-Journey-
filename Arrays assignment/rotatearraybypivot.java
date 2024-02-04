package Arraysassignment;
import java.util.*;
public class rotatearraybypivot {

    public static int searchelement(int arr[],int key,int target){

        int start=0;
        int end=arr.length-1;

        while(start<end){
      
            int mid=(start+end)/2;

            if(arr[mid]==target){
                return mid;
            }

            else if(arr[mid]>target){
                end=mid-1;
            }
     
            else if(arr[mid]<target){
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        System.out.println("Enter the key ");
        int k=scn.nextInt();
        int target=scn.nextInt();

        int ans=searchelement(arr,k,target);
        
        if(ans<k  && ans!= -1){
            ans=ans+(k+1);
           System.out.println(ans);
        }

        else{
            ans=ans-k;
            System.out.println(ans);
        }

    }
    
}
