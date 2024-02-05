public class friendspairingprob {

    public static int friendspairing(int n){
        if(n==1 || n==2){
            return n;
        }

        //if person choses to say single
        int fnm1=friendspairing(n-1);

        //if two friends pair up
        int choices=n-1;
        int fnm2= choices * friendspairing(n-2);

        //total ways 
        int totways=fnm1+fnm2;
        return totways;
        
    }

    public static void main(String[] args) {
        int n=4;
        System.out.println(friendspairing(n));    }
}
