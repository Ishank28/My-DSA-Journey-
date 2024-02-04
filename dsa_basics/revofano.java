import java.util.Scanner;

public class revofano {
    
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in); 
    int num=scn.nextInt();
    int rev=0;
    for(int i=0;num>0;i++){
        int ld=num%10;
        num=num%10;
        rev=(rev*10)+ld;
    }
    System.out.println(rev);

    }
    
}
