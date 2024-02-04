package greedyalgo;
import java.util.*;
public class lexicographicallysandsum {
    
    public static void main(String[] args) {

        char[] array={'z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y'};
       
        Scanner scn=new Scanner(System.in);

        int n=scn.nextInt();//enter the length of string//4
        int k=scn.nextInt();//enter the sum of char of string//42
        int ph=n-1;
        int left=k;
        char[] ans=new char[n];
        for(int i=n-1;i>=0;i--){
            if(k==0){
                System.out.println("no possible string");
                return;
            }
           if(left>=26+ph){//always z will sit
            ans[i]='z';
            left -= 26;
            ph--;
           }else{//the required char will sit
            ans[i]=array[(left-ph)];
            left-=(left-ph);
            ph--;
           }
        }
        for(int i=0;i<n;i++){
            System.out.println(ans[i]);
        }
    }
}
