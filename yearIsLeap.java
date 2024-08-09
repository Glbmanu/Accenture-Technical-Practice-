import java.util.Scanner;
public class yearIsLeap {
    static boolean leap(int n){
        if(n%400==0) return true;
        else if (n%4 == 0 && n%100!=0) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(leap(n));
    }
}
