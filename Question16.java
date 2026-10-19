package DSA;
import java.util.Scanner;
public class Question16 {
	static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        long lcm = (long) a / gcd(a, b) * b;
        System.out.println(lcm);
        sc.close();
    }
}