import java.util.*;
public class maxsumsubarray {
    
    public static void createsumsubarray(int arr[]){
        int maxsum=Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int cursum=0;
                for(int k=i;k<=j;k++){
             cursum += arr[k];
             System.out.println(cursum);
                }
                if(cursum>=maxsum){
                    maxsum=cursum;
                }
            }
        }
        System.out.println(maxsum);
    }
    public static void createarray(int arr[]){
     
        Scanner scn=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int arr[]=new int[4];
        createarray(arr);
        createsumsubarray(arr);
    }

}
