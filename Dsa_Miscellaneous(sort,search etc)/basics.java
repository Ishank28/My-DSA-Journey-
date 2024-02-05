import java.util.*;
public class basics {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int count=n-1;

        for(int i=1;i<=n;i++){
            for(int spaces=1;spaces<=count;spaces++){
                System.out.print(" ");
            }
            for(int star=1;star<=(2*i-1);star++){
                System.out.print("*");
            }
            count--;
            System.out.println();
        }
    }
}
