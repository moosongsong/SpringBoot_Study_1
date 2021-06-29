import java.util.Scanner;

public class NUM_10871 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int[] ary = new int[n];
        for (int i = 0; i < ary.length; i++) {
            ary[i] = scanner.nextInt();
        }
        for (int j : ary) {
            if (j < x) {
                System.out.print(j + " ");
            }
        }
    }
}
