import java.util.*;

import java.math.*;

public class checkprime {
    
    public static void checkp (int a){
        int i;
        for(i=2;i<=a/2;i++){
            int rem=a%i;
            if(rem==0){
                System.out.println("number is not prime");
                break;
            }
        }
        if(i==a/2 + 1){
          System.out.println("PRIME");
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        checkp(n);
    }
}
