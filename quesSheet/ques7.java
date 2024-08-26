package quesSheet;
import java.util.Scanner;
public class ques7 {
    static int findOcc(int[] arr, int k){
        int[] temp = new int[1000000];
        for (int i = 0; i < arr.length; i++) {
            temp[arr[i]]++;
        }
        return temp[k];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(findOcc(arr,k));
    }
}
