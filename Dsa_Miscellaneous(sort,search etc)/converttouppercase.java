public class converttouppercase {
    
    public static void main(String[] Args){

        String str="hey my name is ishank";
        StringBuilder sb=new StringBuilder("");


       sb.append(Character.toUpperCase(str.charAt(0))); 
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
            sb.append(str.charAt(i));
            i++;
            sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }

        String strans=sb.toString();
        System.out.println(strans);
         
    
    }
}
