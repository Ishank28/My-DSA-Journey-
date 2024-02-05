import java.util.*;         
public class fact { 
        public static long factorial(int n){
            long  fact=1;
            for(int i=1;i<=n;i++){
                fact*=i;
            }
            return fact;    
        }

   public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n=scn.nextInt();
    System.out.println(factorial(n));
   }
}
