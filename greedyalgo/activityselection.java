package greedyalgo;
import java.util.*;

public class activityselection {

    public static void main(String[] args) {
        int[] start={1,3,0,5,8,5};
        int[] end={2,4,6,7,9,9};
        //now I have the end time in a sorted format 
        //set a counter for the count of max activities 
        int maxact=0;
        ArrayList<Integer> ans=new ArrayList<>();
        //we assume that the 1st activity is always chosen.
        ans.add(0);
        maxact=1;
        int lastend=end[0];
        for(int i=1;i<end.length;i++){
            if(start[i]>=lastend){
                maxact++;
                ans.add(i);
                lastend=end[i];
            }
        }
        System.out.println(maxact);

        for(int i=0;i<ans.size();i++){
            System.out.println("A" + ans.get(i));
        }
    }


}
