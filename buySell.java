import java.util.Scanner;

public class buySell {
    static int solve(int arr[]){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            min = Math.min(min,arr[i]);
            max = Math.max(max,arr[i]-min);
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(solve(arr));
    }
}
