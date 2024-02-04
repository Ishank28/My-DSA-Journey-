import java.util.*;

public class printallprimeinrange {
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
    public static void printprimes(int a){
    for(int i=2;i<=a;i++){
        if(Isprime(i)==true){
            System.out.println(i);
        }
    }
}

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);     
        int n=scn.nextInt();
        printprimes(n);   
    }
}
