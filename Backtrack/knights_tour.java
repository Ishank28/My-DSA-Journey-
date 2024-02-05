import java.util.*;
public class knights_tour {
    public static void knightstour(int[][] board,int row,int col,int move){
        if(row>=board.length || col>=board.length ||   row<0 || col<0 || board[row][col]>0){
            return;
        }
        else if(move==board.length*board.length){
            board[row][col]=move;
            displayboard(board);
            board[row][col]=move;
            return;       
        }
        board[row][col]=move;
        knightstour(board,row - 2, col+1 ,move + 1);//1
        knightstour(board,row - 1, col+2  ,move + 1);//2
        knightstour(board,row + 1, col+2  ,move + 1);//3
        knightstour(board,row + 2, col+1  ,move + 1);//4                         
        knightstour(board,row + 2 , col-1  ,move + 1);//5
        knightstour(board,row + 1, col-2  ,move + 1);//6
        knightstour(board,row - 1, col-2  ,move + 1);//7
        knightstour(board,row - 2, col-1  ,move + 1);//8
        board[row][col]=0;
        }

    public static void displayboard(int board[][]){
        for(int i=0;i<board.length;i++){
           for(int j=0;j<board.length;j++){
                if(board[i][j]<10){
                     System.out.print(" " + board[i][j] + "  ");
                }
               else{System.out.print(board[i][j] + "  ");}
           }
           System.out.println();
       }
   }

    public static void main(String[] args){
    Scanner scn=new Scanner(System.in);
    System.out.println("enter the size of the board for ex nxn,so enter n");
    int n=scn.nextInt();
    System.out.println("enter the Starting row index");
    int row=scn.nextInt();
    System.out.println("enter the Starting col index");
    int col=scn.nextInt();
    int[][] chess_board=new int[n][n];
    for(int i=0 ; i<n ; i++){
        for(int j=0; j<n ; j++){
            chess_board[i][j]=0;
        }
    }
    knightstour(chess_board,row,col,1);
    }

    }
