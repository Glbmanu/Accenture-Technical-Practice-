import java.util.Scanner;

public class diviOfN {
    static int solve(int n){
        int sum =0;
        for(int i = 1; i<=n; i++){
            if(n%i==0){
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solve(n));
    }
}
