import java.util.Scanner;

public class NUM_1978 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ary = new int[n];
        for (int i = 0; i < ary.length; i++) {
            ary[i] = scanner.nextInt();
        }

        int count = 0;
        for (int j : ary) {
            if (isOnly(j)) {
                count++;
            }
        }

        System.out.println(count);
    }

    public static boolean isOnly(int temp) {
        boolean result = true;
        if (temp == 1) {
            return false;
        }
        for (int i = 2; i < temp; i++) {
            if (temp % i == 0) {
                result = false;
                break;
            }
        }

        return result;
    }
}
