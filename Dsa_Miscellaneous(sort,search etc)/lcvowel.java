public class lcvowel {

    public static void lc(String str){
    int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i'  || ch=='o' || ch=='u'){
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        String str="Hello My NAME is Navya Chawla";
        lc(str);
    }
}
