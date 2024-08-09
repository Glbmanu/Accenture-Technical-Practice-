import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class mergeTwoArr {
    static void merge(int[] arr1, int[] arr2){
        ArrayList<Integer> ar = new ArrayList<>();
        for(int i = 0; i<arr1.length; i++){
            ar.add(arr1[i]);
        }
        for (int i = 0; i<arr2.length; i++){
            ar.add(arr2[i]);
        }
        Collections.sort(ar);
        Integer[] a = new Integer[ar.size()];
        a = ar.toArray(a);
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i = 0; i<arr1.length; i++){
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for(int i = 0; i<arr2.length; i++){
            arr2[i] = sc.nextInt();
        }
        merge(arr1,arr2);
    }
}
