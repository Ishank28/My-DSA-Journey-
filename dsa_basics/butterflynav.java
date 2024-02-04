import java.util.*;
public class butterflynav {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int count=2*n-2;

        for(int i=1;i<=n;i++){
            for(int star=1;star<=i;star++){
                System.out.print("*");
            }
            for(int space=0; space<count;space++){
                System.out.print(" ");
            }
            for(int star=1;star<=i;star++){
                System.out.print("*");
            }
            System.out.println();
            count-=2;
        }
        int count2=0;
        for(int i=n;i>=1;i--){
            for(int star=i;star>=1;star--){
                System.out.print("*");
            }
            for(int space=1; space<=count2;space++){
                System.out.print(" ");   
            }
            count2+=2;
            for(int star=i;star>=1;star--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
