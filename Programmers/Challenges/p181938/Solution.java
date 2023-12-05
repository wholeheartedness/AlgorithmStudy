/*
🖥️ 프로그래머스 - 181938번 문제 : 두 수의 연산값 비교하기
🖥️ 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181938
두 수의 연산값 비교하기
문제 설명
연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.

12 ⊕ 3 = 123
3 ⊕ 12 = 312
양의 정수 a와 b가 주어졌을 때, a ⊕ b와 2 * a * b 중 더 큰 값을 return하는 solution 함수를 완성해 주세요.

단, a ⊕ b와 2 * a * b가 같으면 a ⊕ b를 return 합니다.
 */

package p181938;

class Solution {
    public int solution(int a, int b) {
        // a&b 계산하기
        String abStr = String.valueOf(a)+String.valueOf(b);
        int ab = Integer.valueOf(abStr);
        // 2*a*b 계산하기
        int sum = 2 * a * b;
        // 1과 2 중 큰 값 return 하기
        if (ab > sum || ab == sum) {
            return ab;
        } else {
            return sum;
        }
    }
}