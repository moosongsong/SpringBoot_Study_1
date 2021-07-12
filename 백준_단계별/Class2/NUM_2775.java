import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NUM_2775 {
    static class House {
        int k;
        int n;

        House(int k, int n) {
            this.k = k;
            this.n = n;
        }

        public int getNumOfPeople() {
            int[][] ary = new int[k + 1][n + 1];
            for (int i = 0; i < ary[0].length; i++) {
                ary[0][i] = i;
            }
            for (int i = 0; i < ary.length; i++) {
                ary[i][1] = 1;
                ary[i][0] = 1;
            }

            for (int i = 1; i < ary.length; i++) {
                for (int j = 1; j < ary[i].length; j++) {
                    if (j - 1 != 0) {
                        ary[i][j] = ary[i][j - 1] + ary[i - 1][j];
                    }
                }
            }
            return ary[k][n];
        }

        @Override
        public String toString() {
            return String.valueOf(getNumOfPeople());
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numOfTestCase = Integer.parseInt(bufferedReader.readLine());
        House[] tests = new House[numOfTestCase];
        for (int i = 0; i < tests.length; i++) {
            tests[i] = new House(Integer.parseInt(bufferedReader.readLine()), Integer.parseInt(bufferedReader.readLine()));
        }
        for (House test : tests) {
            System.out.println(test);
        }
    }
}
