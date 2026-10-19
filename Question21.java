package DSA;
import java.util.Scanner;
public class Question21 {
	static String replace(String s, char c1, char c2, int index) {
        if (index == s.length()) {
            return "";
        }
        char ch = s.charAt(index);
        if (ch == c1) {
            ch = c2;
        }
        return ch + replace(s, c1, c2, index + 1);
    }
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        char c1 = sc.next().charAt(0);
        char c2 = sc.next().charAt(0);
        System.out.println(replace(s, c1, c2, 0));
        sc.close();
    }
}

