import java.util.ArrayList;
import java.util.Scanner;

public class OccOfEach {
    static void Occ(int arr[]){
        ArrayList<Integer> ar = new ArrayList<>();
        int hash[] = new int[1000000];
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
        }
        int i = 0;
        while (i != arr.length){
            ar.add(hash[arr[i]]);
            i++;
        }
        Integer a[] = new Integer[ar.size()];
        a = ar.toArray(a);
        for (int j = 0; j < a.length; j++) {
            System.out.print(a[j]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Occ(arr);

    }
}
