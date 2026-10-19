package DSA;
import java.util.Scanner;
public class Question26 {
	public static int binarySearch(int[] arr, int left, int right, int target) {
        if (left > right) {
            return -1;
        }
        int mid = left + (right - left) / 2;
        if (arr[mid] == target) {
            int result = binarySearch(arr, left, mid - 1, target);
            if (result != -1) {
                return result;
            }
            return mid;
        }
        if (arr[mid] > target) {
            return binarySearch(arr, left, mid - 1, target);
        }
        return binarySearch(arr, mid + 1, right, target);
    }
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(binarySearch(arr, 0, n - 1, x));
        sc.close();
    }
}