import java.util.Scanner;

public class target_ele_arr {
    static int binSearch(int arr[], int target){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==target) return mid;
            else if (arr[mid]<target) {
                low++;
            }
            else{
                high--;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int ans = binSearch(arr,target);
        System.out.println(ans);

    }
}
