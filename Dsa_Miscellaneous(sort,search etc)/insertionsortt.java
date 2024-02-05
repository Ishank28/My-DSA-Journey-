public class insertionsortt {
    public static void insertionsort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int curr=arr[i+1];
            int prev=i;
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
            }
        }
        public static void printarray(int[] arr){
            for(int i : arr){
                System.out.print(i);
            }
         }

        public static void main(String[] args) {
            int arr[]={3,6,2,1,8,7,4,5,3,1};
            insertionsort(arr);
            printarray(arr);
        }
    }

