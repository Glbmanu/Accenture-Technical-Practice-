import java.util.*;
public class Arr_lar_num{
    static  int fin_lar(int arr[]){
   int lar = Integer.MIN_VALUE;
   for(int i  = 0; i<arr.length; i++){
    if(lar<arr[i])
        lar = arr[i];
   }
   return lar;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = fin_lar(arr);
        System.out.println(ans);
    }
}