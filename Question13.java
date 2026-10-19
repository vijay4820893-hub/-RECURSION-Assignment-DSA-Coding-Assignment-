package DSA;
import java.util.Scanner;
public class Question13 {
	static long power(int a, int b) {
        if (b == 0) {
            return 1;
        }

        return a * power(a, b - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(power(a, b));
        sc.close();
    }
}