import java.util.Scanner;

public class sumofn {
    public static void main(String[] args) {
        int sum=0;
        try (Scanner sc = new Scanner(System.in)) {
            int N=sc.nextInt();
            for(int i=1;i<=N;i++){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
