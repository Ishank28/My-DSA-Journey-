import java.util.*;
public class prefixsumarray {
    public static void createarray(int arr[]){
     
        Scanner scn=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
    }

    public static void prefixsumArray(int arr[]){
        int prefixa[]=new int[arr.length];
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            prefixa[i]=sum;
        }
    }
    public static void maxsum(int prefixa[]){
        
        for(int i=1;i<prefixa.length;i++){

           
        }
    }


}
