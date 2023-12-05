/*
🖥️ 프로그래머스 - 181894번 : 2의 영역
🖥️ 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181894
문제 설명
정수 배열 arr가 주어집니다.
배열 안의 2가 모두 포함된 가장 작은 연속된 부분 배열을
return 하는 solution 함수를 완성해 주세요.

단, arr에 2가 없는 경우 [-1]을 return 합니다.

제한사항
1 ≤ arr의 길이 ≤ 100,000
1 ≤ arr의 원소 ≤ 10

입출력 예
arr	result
[1, 2, 1, 4, 5, 2, 9]	[2, 1, 4, 5, 2]
[1, 2, 1]	[2]
[1, 1, 1]	[-1]
[1, 2, 1, 2, 1, 10, 2, 1]	[2, 1, 2, 1, 10, 2]
 */

package p181894;

import java.util.Arrays;
import java.util.List;

class Solution {
    public static int[] solution(int[] arr) {
        // arr에서 2가 있는 인덱스 찾기
        // 찾는거를 변수에 넣는데 (minIdx, maxIdx)
        // minIdx 조건 : 가장 먼저 들어가는 것
        // maxIdx 조건 : 가장 마지막에 들어가는 것
        // 마지막에 minIdx가 -1이면 없는것으로 return 함
        int minIdx = -1;
        int maxIdx = -1;
        for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 2){
                    minIdx = i; // 처음 넣은 순간을 알고
                    break; // break 걸어서 탈출
                }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2){
                maxIdx = i;
            }
        }
        // 2 없으면 -1 return 하면서 함수 종료
        if (minIdx == -1) {
            return new int[]{-1};
        }
        System.out.println(minIdx + " " + maxIdx);
        //Arrays.copyOfRange()로 자르기
        //to에서 앞부분 인덱스 까지 나오므로 maxIdx + 1해주어야 함
        int[] answer = Arrays.copyOfRange(arr, minIdx, maxIdx+1);
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 1, 2, 1, 10, 2, 1};
        System.out.println(Arrays.toString(Solution.solution(arr)));
    }
}
