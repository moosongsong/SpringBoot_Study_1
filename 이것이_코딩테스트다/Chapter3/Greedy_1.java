// 당장 좋은 것만 선택하는 그리디

// 3-1. 거스름돈 500원, 100원 50원, 10원 동전
// 손님에게 거슬러 줘야 할 돈이 N 원일때 동전의 최소개수
// N의 10의 배수

public class Greedy_1 {
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
