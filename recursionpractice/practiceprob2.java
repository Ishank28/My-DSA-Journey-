package recursionpractice;
import java.util.*;

public class practiceprob2 {
    
    public static void  inttostr(int[]arr,int idx){
        if(idx==arr.length){
            return;
        }

        int curno=arr[idx];
        if(curno==1){
            System.out.print("one"+ " ");
        }
        if(curno==2){
            System.out.print("two"+ " ");
        }
        if(curno==3){
            System.out.print("three"+ " ");
        }
        if(curno==1){
            System.out.print("one"+ " ");
        }
        if(curno==4){
            System.out.print("four"+ " ");
        }
        if(curno==5){
            System.out.print("five"+ " ");
        }
        if(curno==6){
            System.out.print("six"+ " ");
        }
        if(curno==7){
            System.out.print("one"+ " ");
        }
        if(curno==9){
            System.out.print("nine"+ " ");
        }
        if(curno==8){
            System.out.print("eight"+ " ");
        }
        if(curno==0){
            System.out.print("zero" + " ");
        }
        inttostr(arr, idx+1);
        
    }
    public static void main(String[] args) {
        int[] arr=new int[3];
        Scanner scn=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        inttostr(arr, 0);
    }
}
