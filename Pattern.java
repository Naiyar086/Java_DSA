
public class Pattern {

    public static void main(String[] args) {
        // enter your code here
        int n = 4;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

/*
 * class Main {
 * public static void main(String[] args) {
 * // Your code here
 * int n = 5000, i;
 * for (i = 0; i <= n; i++) {
 * if (i % 3 == 0 && i % 5 == 0)
 * System.out.println("FizzBuzz");
 * 
 * else if (i % 3 == 0) {
 * System.out.println("Fizz");
 * } else
 * System.out.println("Buzz");
 * 
 * }
 * }
 * }
 * 
 */
// don't change the name of this class
// you can add inner classes if needed
/*
 * class Main {
 * //void main(String[] args) {
 * // Your code here
 * Scanner sc = new Scanner(System.in);
 * char first = sc.next().charAt(0);
 * char sec = sc.next().charAt(0);
 * if (first != 'R' && sec != 'J') {
 * System.out.println('D');
 * }
 * if (first == 'R') {
 * System.out.println('R');
 * } else if (sec == 'J') {
 * System.out.println(first);
 * }
 * }
 * }
 */