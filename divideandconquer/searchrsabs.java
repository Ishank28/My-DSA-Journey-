package divideandconquer;

public class searchrsabs {

    public static int binarysearch(int arr[],int tar,int si,int ei){

        while(si<=ei){

        int mid=si+ei/2;

        if(tar==arr[mid]){
            return mid;
        }
            
         if(arr[mid]>si){//mid lies on line 1 and left part is sorted
            int tsi=0;
             int tei=mid;
             while( tsi<= tei){//applying bs in left sorted part
              tsi=0;
              tei=mid;
             int tmid=tsi+tei/2;

            if(tar==arr[tmid]){
            return tmid;
             }
            if(tar>arr[tmid]){
                tsi=tmid+1;
            }
            else{
                tei=tmid-1;
            }
        }
            //if the target is found in left part it is printed if not our si will now be mid+1
            si=mid+1;
            }

            else{//if the target is found on line 2 then right part is sorted and binary search can be applied
                int tsi=mid+1;
                int tei=ei;
             while( tsi<= tei){//applying bs in left sorted part
              tsi=0;
              tei=ei;

             int tmid=tsi+tei/2;

            if(tar==arr[tmid]){
            return tmid;
             }
            if(tar>arr[tmid]){
                tsi=tmid+1;
            }
            else{
                tei=tmid-1;
            }

            }

            ei=mid-1;
        }
    }

    return -1;
    }

    public static void main(String[] args) {
        
        int arr[]={4,5,6,7,0,1,2};
        int target=6;
        System.out.println( "1");
    }
    
}
