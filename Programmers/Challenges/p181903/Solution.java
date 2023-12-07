/*
🖥️ 프로그래머스 - 181903번 문제 : qr code
🖥️ https://school.programmers.co.kr/learn/courses/30/lessons/181903
 */
package p181903;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static String solution(int q, int r, String code) {
        // code의 각 글자를 가지는 배열을 만든다
        // code의 글자 수만큼 반복한다
        // code의 각 인덱스를 q로 나눈다
        // 나눈값의 나머지가 r과 일치하는지 확인한다
        // 일치하면 print한다
        String[] arr= code.split("");
        List<String> list = new ArrayList<>();
        for (int i = 0; i < code.length(); i++) {
            int a = i % q;
            if ( a == r) {
                list.add(arr[i]);
                System.out.println(arr[i]);
            }
        }

        StringBuilder br = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            br.append(list.get(i));
        }

        System.out.println(br.toString());
        return br.toString();
    }

    public static void main(String[] args) {
        Solution.solution(1, 0, "programmers");
    }
}