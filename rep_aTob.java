import java.util.Scanner;

public class rep_aTob {
    static String replaceAtoB(String str){
        char charArray[]=str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i]=='a'){
                charArray[i]='b';
            }
            else if(charArray[i]=='b'){
                charArray[i]='a';
            }
        }

        return new String(charArray);
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(replaceAtoB(str));
    }
}
