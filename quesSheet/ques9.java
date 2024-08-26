package quesSheet;
import java.util.ArrayList;
import java.util.Scanner;
public class ques9 {
    static void findDuplicate(int [] arr){
        ArrayList<Integer> ar = new ArrayList<>();
        int[] temp = new int[arr.length];
        for(int i = 0; i<temp.length; i++){
            temp[arr[i]]++;
        }
        for (int i = 0; i < temp.length; i++) {
            if(temp[i]>= 2){
                ar.add(i);
            }
        }
        if(ar.size()==0){
            ar.add(-1);
        }
        Integer[] a = ar.toArray(new Integer[ar.size()]);
       for(Integer i : a){
           System.out.print(i+" ");
       }
        //System.out.println(ar);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        findDuplicate(arr);
    }
}
