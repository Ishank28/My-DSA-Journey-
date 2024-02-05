package Arraysassignment;

public class bubblesort {
    
    public static void BUBBLESORT(int arr[]){
    
        for(int turn=0;turn<arr.length-2;turn++){
            //swap the numbers
            int swaps=0;
            for(int j=0;j<arr.length-1-turn;j++){
                
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swaps++;
                }
            }
            if (swaps==0){
                System.out.print("array already sorted");
                return;
            }
        }
       
      for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]);
      }
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        BUBBLESORT(arr);
    }
}
