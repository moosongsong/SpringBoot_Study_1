import java.util.Scanner;

public class NUM_2884 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int m = scanner.nextInt();
        if (m - 45 < 0) {
            h -= 1;
            m = m + 60 - 45;
        } else
            m -= 45;
        if (h == -1)
            h = 23;
        System.out.println(h + " " + m);
    }
}
