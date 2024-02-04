package divideandconquer;

public class quicksort {

    public static void quicksortfun(int[] arr,int si,int ei){
        if(si>=ei){
            return;
        }
        
        int pidx=partition(arr,si,ei);//this function shall give the correct pivot index and smaller elements on left side 
        quicksortfun(arr,si,pidx-1);
        quicksortfun(arr,pidx+1,ei);

    }

    //the partition function shall return us the correct index of the  pivot
    public static int partition(int arr[],int si,int ei){
        int pivot=arr[ei];
        
        int i=si-1;
        for(int j=si;j<ei;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        //placing the pivot at the right place 
        i++;
         int temp=arr[i];
                arr[i]=pivot;
                arr[ei]=temp;
        return i;
    }
    public static void printarr(int[] arr){
        for(int si=0;si<=arr.length-1;si++){
            System.out.println(arr[si]);
            }
    }
    
        

    public static void main(String[] args) {
        int arr[]={3,1,2,6,5,7};
        quicksortfun(arr, 0, 5);
        printarr(arr);
    }

}

