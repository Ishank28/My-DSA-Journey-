import java.util.*;
public class checkpalindro{

    public static boolean ispalindrome(String str){
          for(int i=0 ; i<( str.length() / 2 ); i++){
                 if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[]Args){
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
         if (ispalindrome(str)==true){
            System.out.println("String is a palindrome");
         }
         else{
            System.out.println("Not a palindrome");
         }
    }
}
