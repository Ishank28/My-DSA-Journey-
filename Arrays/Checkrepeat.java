 package Arraysassignment;

public class Checkrepeat {
    
    public static boolean check(int arr[]){
        for(int i=0;i<arr.length;i++){
            int key=arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(key==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={0,2,3};
        System.out.println(check(arr));
    }
}
