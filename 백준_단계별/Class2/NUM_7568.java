import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NUM_7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;
        StringBuilder stringBuilder = new StringBuilder();
        int n = Integer.parseInt(bufferedReader.readLine());
        int[][] people = new int[n][2];
        for (int i = 0; i < n; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            people[i][0] = Integer.parseInt(stringTokenizer.nextToken());
            people[i][1] = Integer.parseInt(stringTokenizer.nextToken());
        }

        for (int i = 0; i < people.length; i++) {
            int temp = 1;
            for (int j = 0; j < people.length; j++) {
                if (i != j && people[i][0] < people[j][0] && people[i][1] < people[j][1]) {
                    temp++;
                }
            }
            stringBuilder.append(temp).append(' ');
        }

        System.out.println(stringBuilder);
    }
}
