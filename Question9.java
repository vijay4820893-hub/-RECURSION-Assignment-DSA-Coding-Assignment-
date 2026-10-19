package DSA;
import java.util.Scanner;
public class Question9 {
	static void reverse(int n) {
        if (n == 0) {
            return;
        }

        System.out.print(n % 10);
        reverse(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if (n == 0) {
            System.out.print(0);
        } else {
            reverse(n);
        }

        sc.close();
    }
}