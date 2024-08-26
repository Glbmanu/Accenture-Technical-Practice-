package quesSheet;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ques14 {
    static void charfreq(String str){
        int[] hash = new int[256];
        for(int i = 0; i< str.length(); i++){
            hash[str.charAt(i)]++;
        }
        for (int i = 0; i < str.length(); i++) {
            System.out.print(hash[str.charAt(i)]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        charfreq(str);
    }
}
