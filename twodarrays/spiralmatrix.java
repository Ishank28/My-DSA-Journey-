package twodarrays;
import java.util.*;
public class spiralmatrix {

    public static void printspiral(int matrix[][]){

        int endrow=matrix.length-1;
        int endcol=matrix[0].length-1;
        int startrow=0;
        int startcol=0;

        while(startrow<=endrow && startcol<=endcol){
        //print top
    for(int i=startcol;i<=endcol;i++){
    System.out.print(matrix[startrow][i]+ " ");
    }
    
    //print right
    for(int i=startrow+1;i<=endrow;i++){
        System.out.print(matrix[i][endcol]+ " ");
    }

    //print bottom
    for(int i=endcol-1;i>0;i--){
        System.out.print(matrix[endrow][i]+ " ");
    }

    //print left 
    for(int i=endrow-1;i>0;i--){
        System.out.print(matrix[i][startcol] +" ");
    }

    startrow++;
    endrow--;
    startcol++;
    endcol--;
        }
        

    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("ENTER THE NO OF ROWS ");
        int n=scn.nextInt();
        System.out.println("ENTER THE NO OF COLUMNS ");
       int m=scn.nextInt();

        int matrix[][]=new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=scn.nextInt();
            }
        }

            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
        }

        printspiral(matrix);
    }
}
