package divideandconquer;

public class searchinsortedrotarr {
    
    public static int  search(int arr[],int tar,int si,int ei){

        int mid=(si+ei)/2;

        if(arr[mid]==tar){
            return mid;
        }

        //if the target lies on line 1 
        if( arr[si] < arr[mid] ){
        if(tar>=arr[si] && tar<arr[mid]){
            return search(arr,tar,si,mid-1);
        }else{
            return search(arr,tar,mid+1,ei);
        }
        }
        else{
            if(tar <= arr[ei] && tar >= arr[mid+1]){
             return search(arr,tar,mid+1,ei);
        }
        else{
            return search(arr,tar,si,mid-1);
        }
        }
    }


    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int target=2;
        System.out.print(search(arr,target,0,arr.length-1));
    }
}
