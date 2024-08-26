package ultimate;
import java.util.*;
public class ques1 {
    public static void main(String[] args) {
        // length of last word of an String
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String words[] = str.split(" ");
        String last = words[words.length-1];
        System.out.println(last.length());
    }
}
