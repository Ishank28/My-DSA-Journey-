import java.util.*;
public class binarysearch {

    public static int BinarySearch(int arr[],int key){         
        int start=0;
        int end=arr.length-1;
    
    while(start<=end){

    int mid=(start+end)/2;

      if(key==arr[mid]){
        return mid;
      }

      else if(key<arr[mid]){
        end=mid-1;
      }

      else if(key>arr[mid]){
        start=mid+1;
      }
    }
    return -1; 
    }
    public static void createarray(int arr[]){
     
        Scanner scn=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
    }
    public static void main(String[] args) {

        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        System.out.println("the key is " + n);
        int array[]=new int[5];
        createarray(array);
        int ans=BinarySearch(array,n);
        if(ans!=-1){
            System.out.println( "key  exists at index  : " + ans);
        }
        else{
            System.out.println("not found");
        }
        }
    }

