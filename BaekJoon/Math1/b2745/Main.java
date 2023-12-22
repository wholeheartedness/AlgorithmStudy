/*
🖥️ [일반 수학 1] 2745번 문제 : 진법 변환
🖥️ https://www.acmicpc.net/problem/2745
B진법 수 N이 주어진다. 이 수를 10진법으로 바꿔 출력하는 프로그램을 작성하시오.

10진법을 넘어가는 진법은 숫자로 표시할 수 없는 자리가 있다. 이런 경우에는 다음과 같이 알파벳 대문자를 사용한다.

A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35

입력
첫째 줄에 N과 B가 주어진다. (2 ≤ B ≤ 36)

B진법 수 N을 10진법으로 바꾸면, 항상 10억보다 작거나 같다.

출력
첫째 줄에 B진법 수 N을 10진법으로 출력한다.

예제 입력 1
ZZZZZ 36
예제 출력 1
60466175
 */
package b2745;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        String N = s[0]; //B진법 수 N
        int B = Integer.parseInt(s[1]); //B진법
        int result = 0;
        int[] ascii = new int[N.length()];

        for (int i = 0; i < N.length(); i++) {
            ascii[i] = N.charAt(N.length()-i-1) - 48;
            if (N.charAt(N.length()-i-1) > 64) {
                ascii[i] = N.charAt(N.length()-i-1) - 55;
            }
        }

        for (int i = 0; i < N.length(); i++) {
            result += (int) (ascii[i] * Math.pow(B, i));
        }
        System.out.println(result);
    }
}
