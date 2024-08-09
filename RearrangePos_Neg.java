import java.util.ArrayList;
import java.util.Scanner;
public class RearrangePos_Neg {
    static void posNeg(int arr[]) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0){
                pos.add(arr[i]);
            }
            else if(arr[i]<0){
                neg.add(arr[i]);
            }
        }
        int temp[] = new int[arr.length];
        int k = 0;
        int c = 0;
        while ( c< pos.size()){
            temp[k] = pos.get(c);
            temp[k+1] = neg.get(c);
            k += 2;
            c++;
        }
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        posNeg(arr);
    }
}
