/*
🖥️ 프로그래머스 - 181945번 문제 : 문자열 돌리기
🖥️ 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181945

문제 설명
문자열 str이 주어집니다.
문자열을 시계방향으로 90도 돌려서 아래 입출력 예와 같이 출력하는 코드를 작성해 보세요.

제한사항
1 ≤ str의 길이 ≤ 10

입출력 예
입력 #1

abcde
출력 #1

a
b
c
d
e
 */

package p181945;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        //한줄을 입력받았으니
        // 배열을 만들어 str을 하나씩 추출한다
        // str을 출력한다
        String[] arr = new String[a.length()];
        arr = a.split("");

        for (int i = 0; i < a.length(); i++) {
            System.out.println(arr[i]);
        }
    }
}