import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class NUM_11651 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer;
        int[][] ary = new int[n][2];
        for (int i = 0; i < n; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            ary[i][0] = Integer.parseInt(stringTokenizer.nextToken());
            ary[i][1] = Integer.parseInt(stringTokenizer.nextToken());
        }
        Arrays.sort(ary, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1]==o2[1]){
                    if (o1[0]>o2[0]){
                        return 1;
                    }else if(o1[0]<o2[0]){
                        return -1;
                    }
                    return 0;
                }else{
                    if (o1[1]>o2[1]){
                        return 1;
                    }else{
                        return -1;
                    }
                }
            }
        });
        for (int[] ints : ary) {
            System.out.println(ints[0]+" "+ints[1]);
        }
    }
}
