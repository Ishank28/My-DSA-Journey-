public class issorted{

    public static boolean issorted(int[] arr,int i){
        if(i==arr.length-1){
            return true;
        }//base case 

        if(arr[i]>arr[i+1]){
            return false;
        }

         return issorted(arr,i+1);
        
    }

    public static void main(String[] args) {
        int arr[]={2,5,6,7,8};
        int i=1;
        System.out.println(issorted(arr,i)); 
    }







}