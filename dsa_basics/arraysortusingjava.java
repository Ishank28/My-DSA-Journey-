import java.util.*;
import java.util.Arrays;
import java.util.Collections;
public class arraysortusingjava {
 
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        Integer arr[]=new  Integer[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

    Arrays.sort(arr,Collections.reverseOrder());

        for(int i=0;i<n;i++){
            System.out.print(arr[i] + "  ");
        }


    }
}
