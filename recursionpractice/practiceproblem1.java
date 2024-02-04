package recursionpractice;

import java.util.Scanner;

public class practiceproblem1 {

    public static void pi(int key,int idx,int[] arr){
        //base case
        if(idx==arr.length){
            return ;
        }
        //kaam
        if(arr[idx] == key){
            System.out.println(idx);
        }

        pi(key,idx+1,arr);
    }

    public static void main(String[] args) {
        int[] arr={2,2,1,3,4,2};
        // Scanner scn=new Scanner(System.in);
        // for( int val : arr){
        //     arr[val]=scn.nextInt();
        // }
        pi(2,0, arr);
    }
    
}
