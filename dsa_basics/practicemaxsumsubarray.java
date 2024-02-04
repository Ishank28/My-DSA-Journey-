public class practicemaxsumsubarray {
    public static void sumofsubarray(int[] arr){
        int maxsum=Integer.MIN_VALUE;
        int cursum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<=arr.length;j++){
                cursum=0;
                for(int k=i;k<j;k++){
            cursum+=arr[k]; 
                }
                if(cursum>=maxsum){
                    maxsum=cursum;
                }
            }
        }
        System.out.println(maxsum);
    }

    public static void main(String[] args) {
        int arr[]={1,2,7,4};
        sumofsubarray( arr);

    }
}



