import java.util.*;
public class checkpalindrome {

    public static void palindrome(String str){
        
    int i=0;
    if(str.length()==0){
        System.out.println("Not");
    }
        for( i=0;i<=str.length()/2;i++){
if(str.charAt(i)  != str.charAt(str.length()-1-i)){
break;
}
        }

        if(i < (str.length()/2)){
            System.out.println("Not Palindrome");
        }
        else{
            System.out.println("Palindrome");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();

palindrome(input);
        
    }
}
