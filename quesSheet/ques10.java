package quesSheet;
import java.util.Scanner;
public class ques10 {
    static int firstNonRepeating(int arr[]){
        int ans = 0;
        for(int i = 0; i< arr.length;i++){
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    count += 1;
                }
            }
            if (count == 1){
                ans = arr[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(firstNonRepeating(arr));

    }
}
