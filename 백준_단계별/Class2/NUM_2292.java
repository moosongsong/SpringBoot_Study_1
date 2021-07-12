import java.util.Scanner;

public class NUM_2292 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int start = 0;
        int count = 1;
        if (n != 1)
            while (start + 1 < n) {
                start += 6 * count;
                count++;
            }
        System.out.println(count);
    }
}
