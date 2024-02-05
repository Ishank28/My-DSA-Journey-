public class maxsubarraysumbf {
    
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};

        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                //for loop that calculates sum
                for(int k=i;k<=j;k++){
                  currsum+=arr[k];
                }
                if(currsum>maxsum){
                    maxsum=currsum;
                }
                currsum=0;
            }
        }

        System.out.println(maxsum);

    }
}
