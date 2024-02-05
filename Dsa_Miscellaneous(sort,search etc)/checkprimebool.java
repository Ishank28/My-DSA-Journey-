import java.util.*;
public class checkprimebool {

    public static boolean Isprime(int n){
        //corner cases 
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
         if(Isprime(n)==false){
            System.out.println("NOT PRIME");
         }
         else{
            System.out.println("PRIME");
         }
    }
}
