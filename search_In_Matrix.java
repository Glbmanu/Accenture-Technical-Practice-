import java.util.Scanner;

public class search_In_Matrix {
    static boolean search(int[][] matrix, int target,int n, int m){
        int row = n;
        int col = m;
        int low = 0;
        int high = row*col-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(matrix[mid/col][mid%col]==target){
                return true;
            } else if (matrix[mid/col][mid%col]<target) {
                low = mid+1;
            }
            else {
                high = mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int matrix[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
            }
        int target = sc.nextInt();
        System.out.println(search(matrix,target,n,m));
        }
    }

