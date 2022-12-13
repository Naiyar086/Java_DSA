import java.util.*;
import java.io.*;

class SlidingWindow {
    public static void maxOfK(int arr[], int k) {
        int s = 0, e = 0;
        Deque<Integer> dq = new ArrayDeque<Integer>();
        while (e < arr.length) {
            // check max
            while (!dq.isEmpty() && dq.peekFirst() < arr[e])
                dq.removeLast();
            dq.addLast(arr[e]);
            // complete current window
            if (e - s + 1 < k) {
                e++;
            } else {
                System.out.print(dq.peekFirst() + " ");
                if (dq.peekFirst() == arr[s])
                    dq.removeFirst();
                s++;
                e++;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        maxOfK(arr, k);
    }
}

/*

*/