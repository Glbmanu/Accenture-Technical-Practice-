import java.util.Scanner;
public class diff_sqrt_mAndn {
    static int diff(int n,int m){
        int esum = 0;
        int osum = 0;
        for (int i = n; i <=m ; i++) {
            double squareRoot = Math.sqrt(i);
            if(i%2==0){
                esum += squareRoot;
            }else{
                osum += squareRoot;
            }
        }
        return esum-osum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(diff(n,m));
    }
}
