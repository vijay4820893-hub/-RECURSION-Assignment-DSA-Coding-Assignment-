package DSA;
import java.util.*;
public class Question25 {
    static int search(int[] arr, int n, int x, int i) {
        if (i == n) {
            return -1;
        }
        if (arr[i] == x) {
            return i;

        }

        return search(arr, n, x, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(search(arr, n, x, 0));
        sc.close();
    }
}

      
  

       