import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class NUM_1822 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int numberOfA = Integer.parseInt(stringTokenizer.nextToken());
        int numberOfB = Integer.parseInt(stringTokenizer.nextToken());
        TreeSet<Integer> setA = new TreeSet<>();
        stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        for (int i = 0; i < numberOfA; i++) {
            setA.add(Integer.parseInt(stringTokenizer.nextToken()));
        }
        stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        for (int i = 0; i < numberOfB; i++) {
            int temp = Integer.parseInt(stringTokenizer.nextToken());
            setA.remove(temp);
        }
        bufferedWriter.write(setA.size()+"\n");
        for(int temp:setA){
            bufferedWriter.write(temp+" ");
        }
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
