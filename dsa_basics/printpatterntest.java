import java.util.*;
public class printpatterntest {
 public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    
    char ch='A';
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(ch);
            ch++;
        }
        System.out.println();
    }
 }
   
 
    
}
