package greedyalgo;

import java.util.ArrayList;
import java.util.Scanner;

public class indiancoins {
    public static void main(String[] args) {
        int[] value={1,2,5,10,20,50,100,500,2000};
        Scanner scn=new Scanner(System.in);
        int amount=scn.nextInt();
        int count=0;
        ArrayList<Integer> notes=new ArrayList<>();
        for(int i=value.length-1;i>=0;i--){
            if(value[i]<=amount){
                while(value[i]<=amount){
                count++;
                notes.add(value[i]);
                amount=amount-value[i];
            }
        }
        }
        System.out.println(count);
        for(int i=0;i<notes.size();i++){
            if(i==notes.size()-1){
                System.out.print(notes.get(i));
            }else{
                System.out.print(notes.get(i) + " Note's And ");
            }
            
        }
    }
    
}
