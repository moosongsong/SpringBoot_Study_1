// 1. 배열 [0,0,0,0] 이 입력되었을 때 0으로 출력되어야 한다.
// 2. 정수로 측정할 수 있는 범위를 초과할 수 있다. answer에 대해 Integer 클래스의 parseInt를 사용하면 오류 발생.

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";

        String[] arr = new String[numbers.length];
        int temp = 0;
        for (int i = 0; i < numbers.length; i++) {
            arr[i] = (String.valueOf(numbers[i]));
            temp += numbers[i];
        }
        //모두 0으로 이루어진 배열 예외처리하기
        if (temp == 0) {
            return "0";
        }
        //sort 함수 이용해 배열 정렬하기
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                int a = Integer.parseInt(s1 + s2);
                int b = Integer.parseInt(s2 + s1);
                return -Integer.compare(a, b);
            }
        });

        //정렬된 배열 수로 출력하기
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }

        return answer;
    }
}