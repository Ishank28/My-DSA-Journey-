import java.util.*;
public class findnoofseven {
    
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
        int key=7;
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
              if(matrix[i][j]==key){
                sum++;
              }
            }
        }
System.out.println(sum);
    }
}
