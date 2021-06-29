import java.util.Scanner;

public class NUM_1920 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] n_ary = new int[n];
        for (int i = 0; i < n_ary.length; i++) {
            n_ary[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int[] m_ary = new int[m];
        for (int i = 0; i < m_ary.length; i++) {
            m_ary[i] = scanner.nextInt();
        }

        for (int k : m_ary) {
            int j;
            for (j = 0; j < n_ary.length; j++) {
                if (k == n_ary[j])
                    break;
            }
            if (j == n_ary.length) {
                System.out.println("0");
            } else {
                System.out.println("1");
            }
        }
    }
}
