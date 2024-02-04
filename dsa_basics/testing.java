import java.util.*;
public class testing {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int[] cars=new int[10];

        for(int i=0;i<10;i++){
             cars[i]=scn.nextInt();
        }
        for(int i=0;i<10;i++){
            System.out.println(cars[i]);        
       }
    }
}
