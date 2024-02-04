package backtracking;

public class findpermutation {

    public static void findpermutations(String str,String ans){

        //base case
        if( str.length() == 0){
            System.out.println(ans);
            return; 
        }

        //recursion
        for(int i=0;i<str.length();i++){
            //pick the first character
            char curr=str.charAt(i);
            //remove the char from the string sice it now at the first place 
            String newstr=str.substring(0,i)+ str.substring(i+1,str.length());
            //now call the findpermuation function so that it counts the left out permutations
         findpermutations(newstr,ans + curr); 
        }
        
        
    }

    public static void main(String[] args) {
        String str="abc";
       findpermutations(str,"");
    }
    
}
