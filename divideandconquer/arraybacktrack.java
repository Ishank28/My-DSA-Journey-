package divideandconquer;

public class arraybacktrack {

    public static void backtrack(int[] arr,int i){

        if(i==arr.length){
            Printarray(arr);
            return;
        }
        //recursive work to be done
        arr[i]=i+1;
        backtrack(arr,i+1);
        arr[i] -= 2;

    }
    public static void Printarray(int[] arr){
       for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
       }
    }
    public static void main(String[] args) {
        int arr[]=new int[5];
        backtrack(arr,0);
        Printarray(arr);

    }
    
}
