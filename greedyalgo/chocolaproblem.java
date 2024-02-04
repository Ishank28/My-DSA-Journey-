package greedyalgo;
import java.util.Collections;
import java.util.Arrays;

public class chocolaproblem{
    public static void main(String[] args) {
        //Costs of horizontal and vertical Arrays 
        Integer vercost[]={2,1,3,1,4};
        Integer horcost[]={4,2,1};
        //sorting the arrays in descending order 
        Arrays.sort(vercost,Collections.reverseOrder());
        Arrays.sort(horcost,Collections.reverseOrder());
        int h=0;
        int v=0;
        int hp=1;
        int vp=1;
        int cost=0;

        while(h<horcost.length && v<vercost.length){
            if(horcost[h]>vercost[v]){//horizontal cut
                cost += horcost[h] * vp;
                h++;
                hp++;
            }
            else{
                cost +=vercost[v]* hp;
                vp++;
                v++;
            }
        }
        while(h<horcost.length){
              cost += horcost[h] * vp;
                h++;
                hp++;
        }
        while(v<vercost.length){
            cost +=vercost[v]* hp;
                vp++;
                v++;
        }

        System.out.println("the actual min cost of cutting the chocolate is  " + cost);


    }
}




