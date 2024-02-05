import java.util.*;
public class hollowpattern {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        for(int i=1;i<=n-1;i++){
            if(i==1 || i==n-1){
                System.out.print("*****");
            }
            else{
                for(int j=1;j<=n;j++){
                    if( j==1 || j==n){
                    System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
            }
            }
            System.out.println();
        }
    }
}
