package DSA;
import java.util.Scanner;
public class Question19 {
	static int count(String s, char c, int index) {
        if (index == s.length()) {
            return 0;
        }

        int current = 0;
        if (s.charAt(index) == c) {
            current = 1;
        }

        return current + count(s, c, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c = sc.nextLine().charAt(0);
        System.out.println(count(s, c, 0));
        sc.close();
    }
}