public class selectionsortt {

    public static void printarray(int[] arr){
        for(int i : arr){
            System.out.print(i);
        }
     }
    
    public static void selectionsort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minposele=arr[i];
            int minpos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<minposele){
               minpos=j;
               minposele=arr[j];
                }
            }
            int temp=arr[i];
            arr[i]=minposele;
            arr[minpos]=temp;
        }
        }

        public static void main(String[] args) {
            int arr[]={3,6,2,1,8,7,4,5,3,1};
            selectionsort(arr);
            printarray(arr);
        }
            
           
    }

