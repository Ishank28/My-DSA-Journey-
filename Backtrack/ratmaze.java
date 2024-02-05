import java.util.*;

public class ratmaze{
    
    public static void main(String[] args) {

        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[][] arr= { { 1, 0, 1, 0,1 },{ 1, 1, 1, 1, 1 },{ 0, 1, 0, 1,0 },{ 1, 0, 0, 1, 1 },{1,1,1,0,1}};
    
        int[][] arr1=new int[n][n];
        for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
               arr1[i][j]=0;
            }
        }
        //  call the recursive function to solve the problem  //
        if(ratpath(arr, 0, 0,arr1)){
        for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
   };


    }

    public static boolean issafe(int[][] maze,int row,int col){
        //this if condition is applied for the position we are reaching
        if(row<maze.length && col<maze.length && maze[row][col]!=0 ){
            return true;
        } 
        return false;
    }

    //craeting the recursive function 

    public static boolean ratpath(int[][] maze , int row , int col,int[][] sol) {
    
    //base case
        if(row==maze.length-1 && col==maze.length-1){
            sol[row][col]=1;
            return true;
        }
    //recursive work 
    if(issafe(maze,row,col)){
        sol[row][col]=1;
        //down move
        if( ratpath(maze, row+1, col,sol) ) {
            return true;
        }
        //right move
        if(ratpath(maze,row,col+1,sol)){
            return true;
        }
        sol[row][col]=0;
        return false;
        }

        return false;
}

}

//this question ki understanding will help you know the process of backtrack.
