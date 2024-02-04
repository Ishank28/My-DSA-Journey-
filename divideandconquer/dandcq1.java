package divideandconquer;

public class dandcq1{

    public static void msstring(String[] arr,int si,int ei){
        if(si>=ei){
            return;
        }
        
        int mid=si+ei/2;
        //kaam
        msstring(arr, si, mid-1);
        msstring(arr, mid+1, ei);
        merge(arr,si,ei,mid);
    }

    public static void merge(String arr[],int si,int ei,int mid){
        String tarr[]=new String[(ei-si)+1];
        int i=si;
        int j=mid+1;
        int k=0;

        //use comparision of strings
        while(i<=mid && j<=ei){
            if(( arr[i].compareTo(arr[j])) > 0 ){//str in left array is greater tahn str in right array 
            arr[k]=arr[j];
            j++;
        }
        else{
            //str in left array is greater than str in right array 
            arr[k]=arr[i];
            i++;
        }
        k++;
        }
        while(j<=ei){
            tarr[k++]=arr[j++];
        }
        while(i<=mid){
          tarr[k++]=arr[i++];
        }

        for( k=0;k<tarr.length;k++){
            arr[k]=tarr[k];
        }

        }

        public static void printarr(String arr[]){
            for(int i=0;i<arr.length;i++){
           System.out.print(arr[i] + " ");
            }
        }


    

    public static void main(String[] args) {
        
        String arr[]={"sun","moon","mercury","elephant"};
        msstring(arr,0,arr.length-1);
        printarr(arr);
    }
}