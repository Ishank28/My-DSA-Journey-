public class xtothepown {
    public static int pow(int x,int n){
        if(n==0){
            return 1;
        }
      int  xnm=pow(x,n-1);
       int  xn=x*xnm;
        return xn;
    }
    public static int optimizedpower(int x,int n){

        if(n==0){
            return 1;
        }

        int halfpower=optimizedpower(x, n/2);
        int halfpowersq=halfpower*halfpower;
        if(n%2 != 0){
            halfpowersq=x*halfpowersq;
        }

        return halfpowersq;

    }
    
    public static void main(String[] args) {
        int x;
        int n;
        System.out.println(optimizedpower(4,8));
    }

}
