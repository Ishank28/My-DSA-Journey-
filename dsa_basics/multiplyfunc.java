import java.util.*;
public class multiplyfunc {
   public static int mul(int a,int b){
    int mul=a*b;
    return mul;
   }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        mul(a,b);
        System.out.println(mul(a,b));
    }
    
}
