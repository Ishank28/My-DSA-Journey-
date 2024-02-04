package recursionpractice;
public class towerofhanoi {

    public static void towerofhanoi(int n,String source,String helper,String dest){

        if(n==1){
            System.out.println( "transfer disk " + n + "from " + source + "to " + dest);
            return;
        }
        //TRANSFER N-1 DISKS FROM SOURCE TO HELPER Using dest as a a helper
        towerofhanoi(n-1, source,dest,helper);
         //TRANSFER NTH DISK FROM SOURCE TO DESTINATION
        System.out.println("transfer disk " + n + "from " + source + "to " + dest);
        towerofhanoi(n-1, helper, source, dest);
        
    }
    public static void main(String[] args) {
        int n=4;
        towerofhanoi(n,"A","B","C");
    }
}
