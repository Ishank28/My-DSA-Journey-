package divideandconquer;

public class mergesort {

    public static void mergesort1(int[] arr,int si,int ei){

        if(si>=ei){
            return;
        }
        //KAAM
        int mid=si+(ei-si)/2;
        mergesort1(arr,si,mid);//left part sort 
        mergesort1(arr, mid+1, ei);//right part sort 
        merge(arr,si,mid,ei);

    }

    public static void merge(int arr[],int si,int mid,int ei){
        //the function of this merge function is to merge the left sorted part and right sorted part into one and give the resultant
        //array
        int[] temp=new int[(ei-si)+1];
        int i=si;//used to iterate in the left part of the array 
        int j=mid+1;//used to iterate in the Right part of the array
        int k=0;////used to iterate in the temp array
        while(i<=mid && j<=ei){
            if(arr[i]<=arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
        k++;
        }
        //if something is left out in leftpart
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }

            for( k=0,i=si;k<=temp.length;k++,i++){
                arr[i]=temp[k];
            }
    }    

    public static void printarr(int[] arr){
        for(int si=0;si<=arr.length;si++){
            System.out.println(arr[si]);
            }
    }

    public static void main(String[] args) {
        int[] arr={2,6,3,5,1};
        mergesort1(arr, 0, arr.length-1);
        printarr(arr);
    }

}
