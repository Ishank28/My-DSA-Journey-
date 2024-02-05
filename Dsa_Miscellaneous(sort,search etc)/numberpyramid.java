
import java.util.*;
public class numberpyramid {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int count=n-1;
        
        for(int i=1;i<=n;i++){
            for(int space=1;space<=count;space++){
                System.out.print(" ");
                
            }
            
            for(int k=1;k<=i;k++){
                System.out.print(i + " ");
            }
            count--;
            System.out.println();


        }
    }
    
}
