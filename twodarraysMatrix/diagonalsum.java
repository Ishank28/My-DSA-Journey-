package twodarrays;
import java.util.*;
public class diagonalsum {
 
    public static void main(String[] args) {
        
        Scanner scn=new Scanner(System.in);
        System.out.println("ENTER THE TOTAL NUMBER OF ROWS");
        int n=scn.nextInt();
        System.out.println("ENTER THE TOTAL NUMBER OF COLUMNS");
        int m=scn.nextInt();
        int matrix[][]=new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
            matrix[i][j]=scn.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<n;i++){
            
            //pd
            sum+=matrix[i][i];
            //sd
            if(i != (n-1-i)){
                sum+=matrix[i][n-1-i];
            }
           
        }

        System.out.println(sum);

    }
    
}
