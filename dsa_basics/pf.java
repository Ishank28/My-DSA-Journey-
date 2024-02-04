public class pf {
    public static int  printf(int n){
        if(n==1){
            return 1;
        }
        int ans=printf(n-1);
        int fans=n*ans;
        return fans;
    }

    public static void main(String[] args) {
        int n=7;
        System.out.println(printf(n));
    }
    
}
