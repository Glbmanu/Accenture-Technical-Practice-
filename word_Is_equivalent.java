import java.util.Scanner;

public class word_Is_equivalent {
    static boolean equi(String word1[], String word2[]) {
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        for (int i = 0; i < word1.length; i++) {
            str1.append(word1[i]);
        }
        for (int i = 0; i < word2.length; i++) {
            str2.append(word2[i]);
        }
        if (str1.toString().equals(str2.toString())) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String word1[] = new String[n];
        String word2[] = new String[n];
        for (int i = 0; i < n; i++) {
            word1[i]= sc.next();
        }
        for (int i = 0; i < m; i++) {
            word2[i]= sc.next();
        }
        System.out.println(equi(word1,word2));
    }
}
