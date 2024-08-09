import java.util.Scanner;

public class SubArr_LarSum {
    static int subarrLar(int arr[]){
        int maxsum = 0;
        int currsum = 0;
        for (int i = 0; i < arr.length; i++) {
            currsum += arr[i];
            if(currsum < 0){
                currsum = 0;
            }
        //maxsum = Math.max(currsum,maxsum);
            else if (currsum > maxsum){
                maxsum = currsum;
            }
        }
        return maxsum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = subarrLar(arr);
        System.out.println(ans);
    }
}
