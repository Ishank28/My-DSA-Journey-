import java.util.*;
public class palindromenavya {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
    int n =scn.nextInt();
    int count=n-1;
    int count2=2;
for(int i=1;i<=n;i++){
    //left part 
    for(int space=1; space<=count ; space++){
        System.out.print(" ");

}   
    for(int j=i;j>=1;j--) {
     System.out.print(j);   
    }
    count--;
    //right part
     for(int k=count2;k<=i;k++){
        System.out.print(k);
     }
    System.out.println();
}
    }
}


