package greedyalgo;
import java.util.*;
import java.util.Arrays;

public class fractionalknapsnack {  

    public static void main(String[] args) {
        int[] weight={10,30,20};
        int[] value={60,120,100};
        
        double[] ratio={60/10,120/30,100/20};

        double[][] original=new double[weight.length][2];
        for(int i=0;i<weight.length;i++){
            original[i][0]=i;
            original[i][1]=ratio[i];
        }
        
        Arrays.sort(original,Comparator.comparingDouble(o -> o[1]));//sorting the array on the basis of ratio or the cost per kg(unitary method)
        int W=50;//original capacity so that we can make our code user specific
        int cost=0;//initial cost =0 
        int capacityleft=50;//initially all left
        for(int i=weight.length-1;i>=0;i--){
            if(weight[(int)original[i][0]]<=capacityleft){
                cost=cost+value[(int)original[i][0]];//
                capacityleft=capacityleft-weight[(int)original[i][0]];
            }
            else{
                //use fraction of the original qty
                cost=cost + ( (int)original[i][1] * capacityleft);
            }
        }
        System.out.println("the max cost output is " + cost);
    }
}
