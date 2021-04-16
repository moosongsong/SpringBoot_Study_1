package start;

import greedy.Greedy_1;
import greedy.Greedy_2;

public class StartMain {
    public static void main(String[] args) {
        Greedy_1 greedy_1 = new Greedy_1();
        System.out.println(greedy_1.solution(200));

        Greedy_2 greedy_2 = new Greedy_2();
        System.out.println(greedy_2.solution(1250));
    }
}
