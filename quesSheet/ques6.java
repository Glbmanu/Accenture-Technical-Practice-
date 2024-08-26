package quesSheet;

import java.util.Arrays;
import java.util.Scanner;

public class ques6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i= 0; i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        Arrays.sort(arr);
        int kSmall = arr[k-1];
        int kLar = arr[n-k];
        System.out.print(kSmall+" "+kLar);
    }
}
