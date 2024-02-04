public class firstoccurence {
    
    public static int firstoccurence(int[] arr,int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }

        return firstoccurence(arr, key, i+1);
    }
    public static int lastoccurence(int arr[],int key,int i){
        if(i==-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
         return lastoccurence(arr,5,i-1);
    }
    public static void main(String[] Args){
        int arr[]={8,3,6,9,5,10,2,5,3};
        int i=arr.length-1;
       // System.out.println(firstoccurence(arr, 5, i));
        System.out.println(lastoccurence(arr, 5,i));

    }
}
