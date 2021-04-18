package greedy;

// 숫자 카드 게임
// 가장 높은 숫자가 쓰인 카드 한장을 뽑는 게임
// N X M의 형태
// N : 행, M : 열


import java.util.Arrays;
import java.util.Scanner;

public class Greedy_3 {
    public int solution(){
        int N, M;
        int[][] ary;
        int temp = 0;
        Scanner scanner = new Scanner(System.in);
        N= scanner.nextInt();
        M=scanner.nextInt();

        ary = new int[N][M];

        for (int i = 0; i < ary.length; i++) {
            for (int j = 0; j < ary[i].length; j++) {
                ary[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < ary.length; i++) {
            Arrays.sort(ary[i]);
            if (ary[i][0]>temp){
                temp = ary[i][0];
            }
        }

        return temp;
    }
}
