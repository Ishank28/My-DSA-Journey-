package backtracking;

import java.util.Scanner;

public class nqueens{

    public static void nqueens (char board[][] , int row ) {
        //BASE CASE
        if(row==board.length){
            System.out.println("---------");
            printboard(board);
            return;
        }
        //recursion-Faith 
        for(int j=0;j<board.length;j++){
            if(issafe(board,row,j)==true){
                //place  a queen 
            board[row][j]='Q';  //star 1
            //place a queen on the next row 
            nqueens(board, row+1); //2
            //remove the queen from the place dposition so that we can place in next col
            board[row][j]='X'; // Backtrack step
            }
        }

    }
      public static boolean issafe(char[][] board,int row1,int col1){
        //checking vertically up
        for(int i=row1-1;i>=0;i--){
            if(board[i][col1]=='Q'){
                return false;
            }
        } 
        //checking diagonally left 
         for(int i=row1-1, j=col1-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //checking diagonally right
        for(int i=row1-1,j=col1+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        
        return true;
      }
    public static void printboard(char board[][]){
         for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='X';
            }
        }
        nqueens(board, 0);

    }
}