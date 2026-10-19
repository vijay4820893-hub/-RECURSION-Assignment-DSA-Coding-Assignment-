package DSA;
import java.util.Scanner;
public class Question3 {
	static void printEven(int n) {
        if (n < 2) {
            return;
        }

        printEven(n - 2);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n % 2 == 0) {
            printEven(n);
        } else {
            printEven(n - 1);
        }

        sc.close();
    }
}