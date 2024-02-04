public class largeststring {
    
    public static String printlargeststring(String strarr[]){
        String largest=strarr[0];
        for(int i=0;i<strarr.length;i++){
            if(largest.compareToIgnoreCase(strarr[i]) < 0){
                largest=strarr[i];
            }
        }
        return largest;
    }

    public static void main(String Args[]){
        String fruits[]={"apple","banana","mango","orange","litchi"};
        System.out.println(printlargeststring(fruits));
    }
}
