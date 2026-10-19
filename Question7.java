package DSA;
import java.util.Scanner;
public class Question7 {
	static void reverse(String s, int n) {
        if (n < 0) {
            return;
        }

        System.out.print(s.charAt(n));
        reverse(s, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        reverse(s, s.length() - 1);
        sc.close();
    }
}
       
        
    