import java.util.Scanner;

public class NUM_10950 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        int[] a = new int[total];
        int[] b = new int[total];

        for (int i = 0; i < total; i++) {
            a[i] = scanner.nextInt();
            b[i] = scanner.nextInt();
        }

        for (int i = 0; i < total; i++) {
            System.out.println(a[i] + b[i]);
        }
    }
}
