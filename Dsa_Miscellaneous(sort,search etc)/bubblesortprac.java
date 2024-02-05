public class bubblesortprac {
    
    public static void bubblesort(int arr[]){
        //turns 
        for(int turns=0;turns<arr.length-1;turns++){
            
            for(int i=0;i<arr.length-1;i++){

            if(arr[i]>arr[i+1]){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
            }
        }
    }

            for(int j=0;j<arr.length;j++){
                System.out.print(arr[j]);
            }
            
        }

    
    public static void main(String[] args) {
        int arr[]={4,7,6,5,8,1,3,2};
        bubblesort(arr);
        }
    }

