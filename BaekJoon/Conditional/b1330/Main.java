/*
🖥️ 백준 1330번 두 수 비교하기
🖥️ 링크 : https://www.acmicpc.net/problem/1330

문제
두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.

입력
첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.

출력
첫째 줄에 다음 세 가지 중 하나를 출력한다.

A가 B보다 큰 경우에는 '>'를 출력한다.
A가 B보다 작은 경우에는 '<'를 출력한다.
A와 B가 같은 경우에는 '=='를 출력한다.
제한
-10,000 ≤ A, B ≤ 10,000
 */
package b1330;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] strSplit = input.split(" ");
        int a = Integer.parseInt(strSplit[0]);
        int b = Integer.parseInt(strSplit[1]);
        if (a > b) {
            System.out.println(">");
        } else if (a < b) {
            System.out.println("<");
        } else
            System.out.println("==");
    }
}
