public class stringcompression {
        public static String compressedstringmam(String str){
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<str.length();i++){
            int count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1){
            sb.append(count);
            }
            
            }
           String ans=sb.toString();
           return ans;
        }
        
    public static void main(String[] Args){
        String str="aabbcccddeefff&&@";
       System.out.println(compressedstringmam(str)); 
    }
}
