import java.util.*;
public class invertedwithno {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int count=n;
        //row control 
        for(int i=1;i<=n;i++){
            //coloumn control 
            for(int j=1;j<=count;j++){
                System.out.print(j);
            }
            count--;
            System.out.println();
        } 
    }
}
