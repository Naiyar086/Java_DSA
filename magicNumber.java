import java.util.*;

public class magicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int j = 1;
            for (; j < i; j++) {
                System.out.print(j + " ");
            }

            for (; j > 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        // for (int row = n; row > 0; row--) {
        // for (int col = 1; col <= row; col++) {
        // System.out.print(col + " ");
        // }
        // System.out.println();
        // }5
    }
}