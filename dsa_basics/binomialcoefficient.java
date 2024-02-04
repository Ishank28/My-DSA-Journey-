import java.util.*;
public class binomialcoefficient {
    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;    
    }
    public static int binomialco(int n,int r ){
        int a=factorial(n);
        int b=factorial(r);
        int d=n-r;
        int c=factorial(d);
        int binocoeff= a / (b*c);
        return binocoeff;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int r=scn.nextInt();
        int ans=binomialco(n,r);
        System.out.println(ans);
    }    
}