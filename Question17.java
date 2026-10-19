package DSA;
import java.util.Scanner;
public class Question17 {
	static void binary(int n) {
        if (n > 1) {
            binary(n / 2);
        }

        System.out.print(n % 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        binary(n);
        sc.close();
    }
}