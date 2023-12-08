/*
🖥️ 프로그래머스 - 181899번 문제 : 카운트다운 (23.12.08)
🖥️ https://school.programmers.co.kr/learn/courses/30/lessons/181899

문제 설명
정수 start_num와 end_num가 주어질 때,
start_num에서 end_num까지 1씩 감소하는 수들을 차례로 담은 리스트를 return하도록
solution 함수를 완성해주세요.

제한사항
0 ≤ end_num ≤ start_num ≤ 50
입출력 예
start_num	end_num	result
10	3	[10, 9, 8, 7, 6, 5, 4, 3]
 */
package p181899;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static int[] solution(int start, int end_num) {
        List<Integer> list = new ArrayList<>();
        for (int i = start; i > end_num-1; i--) {
            list.add(i);
        }
        int[] arry ;
        arry = list.stream()
                .mapToInt(i -> i)
                .toArray();
        return arry;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution.solution(10, 3)));
    }
}