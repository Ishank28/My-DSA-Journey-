package Arraysassignment;
public class triplets {

    public static void Triplets(int arr[]){
   
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
                for(int k=2;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                        if(i!=j && j!=k && i!=k){
                            System.out.println("{" + arr[i] + "," + arr[j] +  "," + arr[k] + "}" );
                        }
                    }
                }
            }
        }

    }
public static void main(String[] args) {
    int arr[]={-1,0,1,2,-1,-4};
    
    Triplets(arr);
}
    
}
