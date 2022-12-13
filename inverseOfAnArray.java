import java.util.*;

public class inverseOfAnArray {
    public static void main(String[] args) {
        // Write code for inverse of an array!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res[] = new int[n];
        for (int i = 0; i < n; i++) {
            res[arr[i]] = i;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
