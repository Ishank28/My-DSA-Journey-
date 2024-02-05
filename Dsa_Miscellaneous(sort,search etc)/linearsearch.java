import java.util.*;
public class linearsearch {
  public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=scn.nextInt();
    }
    int key=2;
    for(int i=0;i<n;i++){
      if(arr[i]==key){
        System.out.println("found pyari at" + i);
        break;
      }
    }

  }  
}
