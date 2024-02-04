package greedyalgo;

public class maximumbalancedstring {
    public static void main(String[] args) {
        String str="LRRRRLLRLLRL";

    int countl=0;
    int countr=0;
    int maxstrings=0;

    for(int i=0;i<str.length();i++){
        if(str.charAt(i)=='L'){
            countl++;
        }
        if(str.charAt(i)=='R'){
            countr++;
        }
        if(countl==countr){
            maxstrings++;
            countr=0;
            countl=0;
        }
    }
    System.out.println(maxstrings);
}
    }
    
