import java.util.*;
public class subarrays {
    
    public static void createarray(int arr[]){
     
        Scanner scn=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
    }

    public static void createsubarray(int arr[]){
        
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print( arr[k] + " ");
                }
                System.out.println();  
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int arr[]=new int[4];
        createarray(arr);
        createsubarray(arr);
    }


}
