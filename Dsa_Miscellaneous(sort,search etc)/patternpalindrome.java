import java.util.*;
public class patternpalindrome {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int spaces=4;
        for(int i=1;i<=n;i++){
            //print spaces
            for(int s=1;s<=spaces;s++){
                System.out.print(" ");
            }
            int start=i;
            //loop to print numbers 
            for(int j=1;j<=i;j++){
            //print increasing numbers
           System.out.print(start);
           start--;
        }

        if(i>1){
            int p=2;
            for(int d=1;d<=i-1;d++){
                System.out.print(p);
                p++;
            }
        }
        
        System.out.println();
        spaces--;
        }
    }
}

