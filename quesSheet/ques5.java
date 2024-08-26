package quesSheet;

import java.util.ArrayList;
import java.util.Scanner;

public class ques5 {
    public static ArrayList<Integer> subarraySum(int[] arr, int n, long sum) {
        int last = 0;
        int start = 0;
        long currsum = 0;
        boolean flag = false;
        ArrayList<Integer> res = new ArrayList<>();

        // Iterate over the array
        for (int i = 0; i < n; i++) {
            // Store sum up to current element
            currsum += arr[i];

            // Check if current sum is greater than or equal to given number
            if (currsum >= sum) {
                last = i;

                // Start from starting index till current index
                while (sum < currsum && start < last) {
                    // Subtract the element from left
                    currsum -= arr[start];
                    ++start;
                }

                // If current sum becomes equal to given number
                if (currsum == sum) {
                    res.add(start + 1);
                    res.add(last + 1);
                    flag = true;
                    break;
                }
            }
        }

        // If no subarray is found, store -1 in result
        if (!flag)
            res.add(-1);

        // Return the result
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {15, 2, 4, 8, 9, 5, 10, 23};
        int n = arr.length;
        int sum = 23;
        ArrayList<Integer> res = subarraySum(arr, n, sum);
        for (int i : res)
            System.out.print(i + " ");
    }
}
