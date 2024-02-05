package backtracking;

public class findsubsets {

    public static void findsubsets(String str,String ans,int i){
        //base case 
        if(i==str.length()){
            if(ans==""){
             System.out.println("null");
            }
            else{
                System.out.println(ans);
            }
            
            return;
        }
        //recursion 
        findsubsets(str, ans + str.charAt(i), i+1);//if the char is to be added in the resultant 
        findsubsets(str,ans,i+1);////if the char is not to be added in the resultant  
    }
    public static void main(String[] args) {
        String str="abc";
        findsubsets(str,"",0);
        
    }
}
