import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class NUM_11723 {
    static Set<Integer> mySet = new HashSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        StringTokenizer stringTokenizer;
        int n = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < n; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            String instruction = stringTokenizer.nextToken();
            if (instruction.equals("add")) {
                mySet.add(Integer.parseInt(stringTokenizer.nextToken()));
            } else if (instruction.equals("remove")) {
                mySet.remove(Integer.parseInt(stringTokenizer.nextToken()));
            } else if (instruction.equals("check")) {
                String temp = stringTokenizer.nextToken();
                if (mySet.contains(Integer.parseInt(temp))){
                    stringBuilder.append('1').append('\n');
                }else{
                    stringBuilder.append('0').append('\n');
                }
            } else if (instruction.equals("toggle")) {
                String temp = stringTokenizer.nextToken();
                if (mySet.contains(Integer.parseInt(temp))){
                    mySet.remove(Integer.parseInt(temp));
                }else{
                    mySet.add(Integer.parseInt(temp));
                }
            } else if (instruction.equals("all")) {
                mySet.clear();
                for (int j = 0; j <= 20; j++) {
                    mySet.add(j);
                }
            } else if (instruction.equals("empty")) {
                mySet.clear();
            }
        }

        System.out.println(stringBuilder);
    }
}
