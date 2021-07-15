import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NUM_18111 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int n = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());
        int b = Integer.parseInt(stringTokenizer.nextToken());

        int[][] map = new int[n][m];
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < n; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(stringTokenizer.nextToken());
                min = Math.min(min, map[i][j]);
                max = Math.max(max, map[i][j]);
            }
        }

        int minTime = Integer.MAX_VALUE;
        int maxHeight = min;

        for (int i = min; i <= max; i++) {
            int time = 0;
            int inventory = b;
            for (int j = 0; j < map.length; j++) {
                for (int k = 0; k < map[j].length; k++) {
                    int gap = i - map[j][k];
                    if (gap > 0) {
                        time += gap;
                    } else if (gap < 0) {
                        time += 2*(-1*gap);
                    }
                    inventory -= gap;
                }
            }
            if (inventory<0){
                break;
            }else{
                if (time<minTime){
                    minTime = time;
                    maxHeight = i;
                }else if(time==minTime){
                    maxHeight = Math.max(maxHeight, i);
                }
            }
        }
        System.out.println(minTime+" "+maxHeight);

    }
}
