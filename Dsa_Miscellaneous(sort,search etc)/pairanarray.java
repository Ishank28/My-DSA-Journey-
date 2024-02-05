import java.util.*;
public class pairanarray {
    
    public static void createarray(int arr[]){
     
        Scanner scn=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
    }

    public static void pairup(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=1;j<arr.length;j++){
                if( i != j ){
                    System.out.print("(" + arr[i] +"," + arr[j]+  ")");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        int arr[]=new int[n];
        createarray(arr);
        pairup(arr);
    }
    


}
