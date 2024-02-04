package greedyalgo;

import java.util.Arrays;
import java.util.Comparator;

public class maxchainlength {
    public static void main(String[] args) {
    //this is the given set of pairs from which I need to form the chain
        int[][] pairs={{5,24},{39,60},{5,28},{27,40},{50,90}};
    //now i have to sort the given pairs on the basis of the second numbers so that i can use it 
        Arrays.sort(pairs,Comparator.comparingDouble(o -> o[1]));
        int chainlength=1;//choosing the first pair always
        int lastend=pairs[0][1]; 
        //now checking if the start time of next activity is > end time of the previous activity
        for(int i=1;i<pairs.length;i++){//using 1 as the start as 0 is already done 
            if(pairs[i][0]>lastend){
                chainlength++;
                lastend=pairs[i][1];
            }
        }
        System.out.println(chainlength);
    }
}
