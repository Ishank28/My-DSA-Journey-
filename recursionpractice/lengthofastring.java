package recursionpractice;

import java.util.Scanner;

public class lengthofastring {
    
    public static int lengthofstr(String str){
    
        if(str.length()==0){
            return 0;
        }
        return  lengthofstr(str.substring(1))+ 1;

    }


    public static void main(String[] args) {
    
        String str="hey my name is ishank";
        System.out.println(lengthofstr( str));
    }
}
