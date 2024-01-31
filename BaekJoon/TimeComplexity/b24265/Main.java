/*
🖥️[시간 복잡도] 24265번 문제 : 알고리즘 수업 - 알고리즘의 수행 시간 4
🖥️ https://www.acmicpc.net/problem/24265
문제
오늘도 서준이는 알고리즘의 수행시간 수업 조교를 하고 있다. 아빠가 수업한 내용을 학생들이 잘 이해했는지 문제를 통해서 확인해보자.

입력의 크기 n이 주어지면 MenOfPassion 알고리즘 수행 시간을 예제 출력과 같은 방식으로 출력해보자.

MenOfPassion 알고리즘은 다음과 같다.

MenOfPassion(A[], n) {
    sum <- 0;
    for i <- 1 to n - 1
        for j <- i + 1 to n
            sum <- sum + A[i] × A[j]; # 코드1
    return sum;
}
입력
첫째 줄에 입력의 크기 n(1 ≤ n ≤ 500,000)이 주어진다.

출력
첫째 줄에 코드1 의 수행 횟수를 출력한다.

둘째 줄에 코드1의 수행 횟수를 다항식으로 나타내었을 때, 최고차항의 차수를 출력한다. 단, 다항식으로 나타낼 수 없거나 최고차항의 차수가 3보다 크면 4를 출력한다.

예제 입력 1
7
예제 출력 1
21
2
 */

package b24265;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        long cnt = 0;
        // n이 7이면
        // i : 1 / j : 2~7 (6)
        // i : 1~2 / j : 3~7 (5)
        // i : 1~3 / j : 4~7 (4)
        // 6, 5, 4, 3, 2, 1 이렇게 실행됨
        for (long i = 1; i < n; i++) {
            cnt += i;
        }

        System.out.println(cnt);
        System.out.println(2);
    }
}
