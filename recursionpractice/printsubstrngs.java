package recursionpractice;

public class printsubstrngs {
    
   public static void substrings(String str,int idx,String newstring){

        //base case
        if(idx==str.length()){
            System.out.println(newstring);
            return;
        }
        char currchar=str.charAt(idx);

        //add the currchar to new string
        substrings(str, idx+1, newstring+currchar);
        //do not add the curr char
        substrings(str, idx+1, newstring);
   }

   public static void main(String[] args) {
    String str="ABC";
    substrings(str,0,"");
   }
}
