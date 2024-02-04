import java.util.*;

public class transposeamatrix {

    public static void main(String[] args) {

        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the no of rows");
        int n=scn.nextInt();
        System.out.println("Enter the no of columns");
        int m=scn.nextInt();
        int matrix[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
              matrix[i][j]=scn.nextInt();
            }
        }
        //transpose a matrix 
        int c=n;
        int d=m;

        int newmatrix[][]=new int[c][d];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
              newmatrix[i][j]=matrix[j][i];
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
             System.out.print(newmatrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
