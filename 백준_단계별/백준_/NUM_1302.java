import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class NUM_1302 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        TreeSet<String> set = new TreeSet<>();
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String temp = bufferedReader.readLine();
            if (set.contains(temp)) {
                map.replace(temp, map.get(temp) + 1);
            } else {
                set.add(temp);
                map.put(temp, 0);
            }
        }
        int max = 0;
        String temp = set.first();
        for (String str : set) {
            if (map.get(str) > max) {
                max = map.get(str);
                temp = str;
            }
        }
        System.out.println(temp);
    }
}
