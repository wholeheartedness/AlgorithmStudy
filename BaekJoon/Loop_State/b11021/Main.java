/*
🖥️ 백준 - 11021번 문제 : A + B - 7
🖥️ 링크 : https://www.acmicpc.net/problem/11021

문제
두 정수 A와 B를 입력받은 다음,
A+B를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 테스트 케이스의 개수 T가 주어진다.
각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

출력
각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력한다. 테스트 케이스 번호는 1부터 시작한다.

예제 입력 1
5
1 1
2 3
3 4
9 8
5 2
예제 출력 1
Case #1: 2
Case #2: 5
Case #3: 7
Case #4: 17
Case #5: 7
 */
package b11021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        // T 동안 반복하여 배열의 요소에 입력을 받고
        // 연산 값을 배열에 저장한다
        int[] sum = new int[T];
        int[] a = new int[T];
        int[] b = new int[T];

        for (int i = 0; i < T; i++) {
            String inputNum = br.readLine();
            String[] inputSplit = inputNum.split(" ");
            a[i] = Integer.parseInt(inputSplit[0]);
            b[i] = Integer.parseInt(inputSplit[1]);
            sum[i] = a[i] + b[i];
        }

        // 배열을 T 동안 반복해서 출력한다.
        // 1부터 시작하므로 T+1까지 반복한다.
        // sum은 배열 요소이므로 0부터 시작하기 때문에 i-1을 index로 둔다.
        for (int i = 1; i < T+1; i++) {
            System.out.println(String.format("Case #%d: %d", i, sum[i-1]));
        }
    }
}
