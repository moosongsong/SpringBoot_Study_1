package greedy;
// 큰수의 법칙
//

public class Greedy_2 {
    public int solution(int N) {
        int[] coinType = {500, 100, 50, 10};
        int count = 0;


        for (int type : coinType) {
            count += N / type;
            N = N % type;
        }

        return count;
    }
}
