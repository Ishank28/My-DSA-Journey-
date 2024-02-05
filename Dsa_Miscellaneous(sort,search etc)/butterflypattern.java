import java.util.*;
public class butterflypattern {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        for(int i=1;i<=n;i++){
            //print stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //print spaces
            for(int k=1;k<=2*(n-i);k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>0;i--){
            //print stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //print spaces
            for(int k=1;k<=2*(n-i);k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
