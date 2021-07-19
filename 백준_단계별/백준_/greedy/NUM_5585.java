package greedy;

import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class NUM_5585 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer;

        int num = Integer.parseInt(bufferedReader.readLine());
        int line = Integer.parseInt(bufferedReader.readLine());
        HashSet<Integer> [] people = new HashSet[line];
        for (int i = 0; i < line; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            int count = Integer.parseInt(stringTokenizer.nextToken());
            for (int j = 0; j < count; j++) {
                int person = Integer.parseInt(stringTokenizer.nextToken());
                people[i].add(person);
            }
        }



        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
