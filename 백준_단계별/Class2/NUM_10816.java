import java.util.Scanner;

public class NUM_10816 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] n_ary = new int[n];
        for (int i = 0; i < n_ary.length; i++) {
            n_ary[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int [] m_ary = new int[m];
        for (int i = 0; i < m_ary.length; i++) {
            m_ary[i] = scanner.nextInt();
        }
        int [] m_count = new int[m];

        for (int k : n_ary) {
            for (int j = 0; j < m_ary.length; j++) {
                if (k == m_ary[j]) {
                    m_count[j] += 1;
                    break;
                }
            }
        }

        for (int j : m_count) {
            System.out.print(j+" ");
        }

    }
}
