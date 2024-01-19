/*
🖥️[배수와 약수] 11653번 문제 : 소인수분해
🖥️https://www.acmicpc.net/problem/11653
문제
정수 N이 주어졌을 때, 소인수분해하는 프로그램을 작성하시오.

입력
첫째 줄에 정수 N (1 ≤ N ≤ 10,000,000)이 주어진다.

출력
N의 소인수분해 결과를 한 줄에 하나씩 오름차순으로 출력한다. N이 1인 경우 아무것도 출력하지 않는다.

예제 입력 1
72
예제 출력 1
2
2
2
3
3
예제 입력 2
3
예제 출력 2
3
예제 입력 3
6
예제 출력 3
2
3
예제 입력 4
2
예제 출력 4
2
예제 입력 5
9991
예제 출력 5
97
103

 */
package b11653;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        // i로 N을 나눈다.
        // 나눈 값을 N에 저장한다
        // N을 또 나눈다
        // 나눴는데 나머지가 0이 아니면 i를 추가한다
        // 그리구 출력
        // N이 1 이하이면 반복을 종료한다
        for (int i = 2; N >= 2 ; i++) {
            while (N % i < 1) {
                N = N / i;
                System.out.println(i);
            }
        }

    }
}
