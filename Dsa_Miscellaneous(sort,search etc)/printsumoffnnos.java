public class printsumoffnnos {
    public static int sum(int n){
        if(n==1){
            return n;
        }
        int ans=sum(n-1);
        int fans=n+ans;
        return fans;

    }
    
    public static void main(String[] args) {
        int n=100;
       System.out.println(sum(n)); 
    }
}
