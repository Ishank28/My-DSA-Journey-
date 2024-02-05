import java.util.*;
public class bsrevise{

    public static int binarysearch(int key,int arr[]){

        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=(start+mid)/2;

            if(arr[mid]==key){
                return mid;
            }

            if(arr[mid]<key){
                start=mid+1;
            }

           else{
            end=mid-1;
           }
         return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int key=scn.nextInt();
        int arr[]={2,3,5,6,1,23,41,50};
        System.out.println(binarysearch(key,arr));
    }
}