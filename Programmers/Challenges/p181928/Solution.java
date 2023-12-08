/*
🖥️ 프로그래머스 - 181928번 문제 : 이어붙인 수
🖥️ https://school.programmers.co.kr/learn/courses/30/lessons/181928
이어 붙인 수
문제 설명
정수가 담긴 리스트 num_list가 주어집니다.
num_list의 홀수만 순서대로 이어 붙인 수와 짝수만 순서대로 이어 붙인 수의 합을
return하도록 solution 함수를 완성해주세요.

제한사항
2 ≤ num_list의 길이 ≤ 10
1 ≤ num_list의 원소 ≤ 9
num_list에는 적어도 한 개씩의 짝수와 홀수가 있습니다.
입출력 예
num_list	result
[3, 4, 5, 2, 1]	393
[5, 7, 8, 3]	581
 */
package p181928;

class Solution {
    public static int solution(int[] num_list) {
        StringBuilder pair = new StringBuilder();
        StringBuilder odd = new StringBuilder();

        for (int j : num_list) {
            if (j % 2 == 0) pair.append(j);
            else odd.append(j);
        }

        return Integer.parseInt(String.valueOf(pair)) + Integer.parseInt(String.valueOf(odd));
    }

    public static void main(String[] args) {
        int[] num_list = new int[]{3, 4, 5, 2, 1};
        System.out.println(Solution.solution(num_list));
    }
}