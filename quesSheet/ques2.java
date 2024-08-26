package quesSheet;
import java.util.Scanner;
public class ques2 {
    static int peak(int[] arr,int n){
        int peak = 0;
        if(arr.length>1){
            if (arr[0]>=arr[1]) {
                peak = arr[0];
            }
            if(arr[n-1]>= arr[n-2]){
                peak = n-1;
            }
            for (int i = 1; i < arr.length-1; i++) {
                if (arr[i]>=arr[i-1] && arr[i]>=arr[i+1]){
                    peak = arr[i];
                }
            }
        }
        return peak;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(peak(arr,n));
    }
}
