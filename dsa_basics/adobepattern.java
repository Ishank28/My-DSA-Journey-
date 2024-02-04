package dsa_basics;
import java.util.*;
public class adobepattern {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int count=1;
        int space=0;
        int no=n;
        int rno=6;
        
        //for loop to iterate on total rows 
        for(int i=1;i<=n;i++){ 
            //printing left side of the pattern 
            for(int k=0;k<space;k++){
                System.out.print(" ");
            }
    for(int j=1;j<=no;j++){
        System.out.print(count);
        if(j!=no){
            System.out.print("*");
        }
        count++;
    }
    //printing right side of the pattern 
    for(int l=0;l<=rno;l++){
        System.out.print(" ");
    }

    System.out.println();
    space+=2;        
    no--; 
            }
        }
    }

