import java.util.Scanner;

public class NUM_2609 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(gcd(a, b));
        System.out.println(lcm(a, b));

    }

    public static int gcd(int a, int b) {
        int tmp, n;

        if (a < b) {
            tmp = a;
            a = b;
            b = tmp;
        }

        while (b != 0) {
            n = a % b;
            a = b;
            b = n;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}
