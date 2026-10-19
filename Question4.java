package DSA;
import java.util.Scanner;
public class Question4 {
	static void printOdd(int n) {
        if (n < 1) {
            return;
        }

        printOdd(n - 2);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n % 2 == 0) {
            printOdd(n - 1);
        } else {
            printOdd(n);
        }

        sc.close();
    }
}