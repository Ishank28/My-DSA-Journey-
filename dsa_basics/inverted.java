import java.util.*;
public class inverted {
    public static void main(String[] args) {
       
            Scanner scn=new Scanner(System.in);
            int n=scn.nextInt();
            int spaces=n-1;

            for(int i=1 ; i<=n ;i++){
                //printspaces
                for(int j=spaces;j>0;j--){
                 System.out.print(" ");
                }
                //printstars
                for(int k=1 ; k<=i ;k++) {
                System.out.print("*");
                }
                System.out.println();
                spaces--;
            }
        }
    }