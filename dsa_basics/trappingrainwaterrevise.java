public class trappingrainwaterrevise {
    
    public static int trappedwater(int height[]){

        //calculate left max boundary
        int leftmax[]=new int[height.length];
        leftmax[0]=height[0];
        for(int i=1;i<height.length;i++){
            leftmax[i]=Math.max(height[i], leftmax[i-1]);
        } 

        //calculate right max boundary 
        int rightmax[]=new int[height.length];
        rightmax[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            rightmax[i]=Math.max(height[i], rightmax[i+1]);
        } 

        int curwater=0;
        int trappedwater=0;
        for(int i=0;i<height.length;i++){

            int waterlevel=Math.min(leftmax[i], rightmax[i]);

            curwater=waterlevel-height[i];
            trappedwater+=curwater;
    
        }

        return trappedwater;
    }

    public static void main(String[] args) {
        
        int height[]={4,2,0,6,3,2,5};

        int ans=trappedwater(height);

        System.out.println(ans);

    }
}
