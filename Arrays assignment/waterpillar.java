package Arraysassignment;

public class waterpillar {
    
    public static void calculatewater(int arr[]){
        //left max  of each pillar
        int n=arr.length;
        int leftmax[]=new int[arr.length]; 
        leftmax[0]=arr[0];
        for(int i=1;i<n;i++){
        leftmax[i]=Math.max(arr[i],leftmax[i-1]);
        }
        int rightmax[]=new int[n];
        rightmax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(arr[i],rightmax[i+1]);
        }

        //calculate waterlevel of each 
        int ans=0;
        for(int i=0;i<n;i++){
            int waterboundary=Math.min(leftmax[i],rightmax[i]);
            int trappedwater=waterboundary-arr[i];
            ans=ans+trappedwater;
        }

       System.out.println("THE TRAPPED TOTAL WATER IS " + ans);

    }
    public static void main(String[] args) {
        int height[]={4, 2, 0, 3, 2, 5};
        calculatewater(height);
    }
}
