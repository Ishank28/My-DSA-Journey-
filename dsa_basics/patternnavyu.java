import java.util.*;
public class patternnavyu {
public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    for(int row=1;row<=n;row++){
    for(int col=1;col<=row;col++){
        if((row+col)%2==0){
            System.out.print("1");
        }else{
            System.out.print("0");
        }
    }
    System.out.println();
    }
    System.out.println();
}
}