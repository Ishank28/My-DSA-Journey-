import java.util.*;
public class floydstriangle{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        //floydstriangle 
        //1
        //2 3
        //3 4 5
        //6 7 8 9 
        int c =1 ;
        for(int i=0;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print( c + " ");
                c++;
            }
            System.out.println();
        }
    }
}
