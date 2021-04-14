// 해시에 대한 부족한 공부를 채워야 할 것 같다.

import java.util.Arrays;

class Solution_완주하지못한선수 {
    public String solution(String[] participant, String[] completion) {

        //정렬해서 비교하기
        Arrays.sort(participant);
        Arrays.sort(completion);

        // 서로 다르면 바로 리턴하기
        int i;
        for (i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])){
                return participant[i];
            }
        }

        return participant[i];
    }
}