package DSA;
import java.util.Scanner;
public class Question12 {
	static int countDigits(int n) {
        if (n < 10) {
            return 1;
        }

        return 1 + countDigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countDigits(n));
        sc.close();
    }
}