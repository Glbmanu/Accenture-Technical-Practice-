package quesSheet;

import java.util.Scanner;

public class ques11 {
    static String reverseWordInString(String str){
        String[] word = str.split("\\.");
        String revString ="";
        for(int i=word.length-1;i>=0;i--)
        {
            revString = revString + word[i] ;
            if(i>0)
            {
                revString= revString +".";
            }
        }
        return revString;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(reverseWordInString(str));
    }
}
