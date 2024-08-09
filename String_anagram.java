import java.util.Scanner;

public class String_anagram {
    static boolean hasAnagram(String a, String b){
        if(a.length()!=b.length()) return false;
        int map[] = new int[26];
        for(int i = 0; i<a.length(); i++){
            map[a.charAt(i)-'a']++;
            map[b.charAt(i)-'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if(map[i]!=0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.println(hasAnagram(a,b));
    }
}
