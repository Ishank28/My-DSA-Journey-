public class stringcomprssion {
    
    public static void main(String[] args) {
        String str="aaaannnnniiiiissssnnnnnniiiiilove";

        int i=0;
        int count=1;
        StringBuilder sb=new StringBuilder(str);
        sb.append(" ");
        while(i<str.length()){
            char ch=sb.charAt(i);
            if( sb.charAt(i+1)== ch &&  i!=(sb.length()-1) ){
                count++;
            }
            else{
                
                System.out.print(ch);
                System.out.print(count);
                count=1;
            }
            i++;
        }
        
       
    }
}
