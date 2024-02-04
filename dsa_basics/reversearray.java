import java.util.*;
public class reversearray {

    public static void revarr(int arr[]){

        int first=0;
        int last=arr.length-1;

        while(first<=last){
            int temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;
        }
    }

    public static void createarray(int arr[]){
     
        Scanner scn=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
    }

    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
  

        public static void main(String[] args) {
            Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        int arr[]=new int[n];
        createarray(arr);

        revarr(arr);

        printarr(arr);

        }

        

    }


