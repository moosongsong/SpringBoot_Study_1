// 큰수의 법칙
//

public class Greedy_2 {
    public static void main(String[] args) {
        System.out.println(solution(200));
    }

    public static int solution(int N) {
        int[] coinType = {500, 100, 50, 10};
        int count = 0;


        for (int type : coinType) {
            count += N / type;
            N = N % type;
        }

        return count;
    }
}
