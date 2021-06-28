import java.util.Arrays;
import java.util.Scanner;

public class NUM_10818 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ary = new int[n];

        for (int i = 0; i < ary.length; i++) {
            ary[i] = scanner.nextInt();
        }

        Arrays.sort(ary);

        System.out.println(ary[0] + " " + ary[ary.length-1]);
    }
}
