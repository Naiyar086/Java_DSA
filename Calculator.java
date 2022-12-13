import java.util.*;

class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String symbol = sc.next();
        int res;
        switch (symbol) {
            case "+":
                res = a + b;
                System.out.println(res);
                break;
            case "-":
                res = a - b;
                System.out.println(res);
                break;
            case "*":
                res = a * b;
                System.out.println(res);
                break;
            case "/":
                res = a / b;
                System.out.println(res);
                break;
            case "%":
                res = a % b;
                System.out.println(res);
                break;
            default:
                System.out.println("Invalid symbol");
        }
    }
}