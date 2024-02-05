package backtracking;
import java.util.*;

public class telephonecombination {

    public static void createcombination(String[] keypad,String output,int n){
        //base case
        if(n==0 || n==1){
            System.out.println(output);
            return;
        }
        int last=n%10; //taking out the last digit of the the number inputted 
        String s1=keypad[last];
        for(int i=0;i<s1.length();i++){
            createcombination( keypad , s1.charAt(i) + output , n/10 );//now we are adding the desired char into obtained string 
        }
    }
    public static void main(String[] args) {
        
        String[] keypad={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        String ans=new String();
        createcombination(keypad,ans,n);

    }
}
