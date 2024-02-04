package greedyalgo;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.Arrays;

public class activityselectionunsorted {
    
    public static void main(String[] args) {
        int[] start={3,1,5,8,0,5};
        int[] end={4,2,7,9,6,9};

        int[][] activities=new int[start.length][3];
        for(int i=0;i<start.length;i++){
            activities[i][0]=i;//it is storing the original index of the activity
            activities[i][1]=start[i];
            activities[i][2]=end[i];
        }
        for(int i=0;i<start.length;i++){
           for(int j=0;j<3;j++){
            System.out.print(activities[i][j]);
           }
           System.out.println();
        }
        System.out.println();
        Arrays.sort(activities,Comparator.comparingDouble(o -> o[2]));
         for(int i=0;i<start.length;i++){
           for(int j=0;j<3;j++){
            System.out.print(activities[i][j]);
           }
           System.out.println();
        }

        //now lets select activities
        int maxact=0;
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(activities[0][0]);
        maxact++;
        int lastend=activities[0][2];
        for(int i=0;i<start.length;i++){
            if(activities[i][1]>lastend){
                maxact++;
                lastend=activities[i][2];
                ans.add(activities[i][0]);
            }
        }
        System.out.println(maxact);
        for(int i=0;i<ans.size();i++){
            System.out.println("A"+ans.get(i));
        }

    }
}

//time complexity of this code is O(N)
