import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class NUM_11650 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[][] ary = new int[num][2];
        for (int i = 0; i < ary.length; i++) {
            ary[i][0] = scanner.nextInt();
            ary[i][1] = scanner.nextInt();
        }

        Arrays.sort(ary, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0]==o2[0]){
                    return o1[1]-o2[1];
                }else{
                    return o1[0]-o2[0];
                }
            }
        });
        for (int[] ints : ary) {
            System.out.println(ints[0] + " " + ints[1]);
        }
    }
}
