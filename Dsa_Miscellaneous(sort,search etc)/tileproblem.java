import java.util.Scanner;

public class tileproblem {
    
    public static int tileproblem(int n){// 2xn is the floor size

        //base case
        if(n==0|| n==1){
            return 1;
        }

        //vertical choice 
        int fnm1=tileproblem(n-1);//keeping faith that it will give me the no of ways of vertical placement for floor left
        //horizontal choice
        int fnm2=tileproblem(n-2);//keeping faith that it will give me the no of ways of Horizontal placement for floor left

        int totalways=fnm1+fnm2;

        return totalways;
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        System.out.println(tileproblem(n));
    }
}
