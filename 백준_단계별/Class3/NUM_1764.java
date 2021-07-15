import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class NUM_1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        StringBuilder stringBuilder = new StringBuilder();

        int n = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());

        Set<String> didNotSee = new HashSet<>();
        TreeSet<String> didNotHear = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            didNotSee.add(bufferedReader.readLine());
        }
        int count =0;
        for (int i = 0; i < m; i++) {
            String temp = bufferedReader.readLine();
            if (didNotSee.contains(temp)){
                count++;
                didNotHear.add(temp);
            }
        }

        stringBuilder.append(count).append('\n');
        for (String s : didNotHear) {
            stringBuilder.append(s).append('\n');
        }
        System.out.println(stringBuilder);
    }
}
