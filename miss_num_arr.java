import java.util.Scanner;

public class miss_num_arr {
    static int missingNumberArray(int arr[],int n){
        int Nsum = n*(n+1)/2;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return Nsum-sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int ans = missingNumberArray(arr,n);
        System.out.println(ans);
    }
}
