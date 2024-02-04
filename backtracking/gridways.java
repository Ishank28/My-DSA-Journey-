package backtracking;

import java.util.*;

public class gridways {
    public static int fact(int n){
        int fact=1;
        for(int i=n;i>=1;i--){
            fact=fact*i;
        }
        return fact;
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();

        int factnum=fact(n-1+m-1);
        int factden=fact(n-1) * fact(m-1);
        int ways=factnum/factden;
        System.out.println(ways);
        
    }
}
