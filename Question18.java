package DSA;
import java.util.Scanner;
public class Question18 {
	static long decimal(String s, int index) {
        if (index == s.length()) {
            return 0;
        }

        return (s.charAt(index) - '0')
                * power(2, s.length() - 1 - index)
                + decimal(s, index + 1);
    }

    static long power(int base, int exp) {
        if (exp == 0) {
            return 1;
        }

        return base * power(base, exp - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(decimal(s, 0));
        sc.close();
    }
}