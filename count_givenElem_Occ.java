import java.util.Scanner;
public class count_givenElem_Occ {
    static int findOcc(int arr[], int element){
        int hash[] = new int[1000000];
        for(int i = 0; i<arr.length; i++){
        hash[arr[i]] += 1;
        }
        return hash[element];
    }
    static int secondSol(int arr[], int element){
        int count = 0;
        for (int num:arr){
            if(num == element) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        for(int i = 0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        int element = sc.nextInt();
        //System.out.println(findOcc(arr,element));
        System.out.println(secondSol(arr,element));
    }
}
