import java.util.*;
public class hollowrhombus {
    public static void main(String[] args) {
      Scanner scn=new Scanner(System.in);
      int n=scn.nextInt();
      int count=n-1;
      for(int i=1;i<=n;i++){//row
        for(int space=1;space<=count;space++){
           System.out.print(" ");
            }
            System.out.print("*");
            //stars
            if(i==1 || i==n){
                for(int star=1;star<=n;star++){
                    System.out.print("*");
                }
            }
                else{
                    for(int space=1; space<=n-2; space++){
                        System.out.print(" ");

                    }
                    System.out.print("*");
                }
                count--;
                System.out.println();
            }         
        }
      }  