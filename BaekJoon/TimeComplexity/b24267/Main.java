/*
🖥️[시간 복잡도] 24267번 문제 : 알고리즘 수업 - 알고리즘의 수행 시간 6
🖥️https://www.acmicpc.net/problem/24267
문제
오늘도 서준이는 알고리즘의 수행시간 수업 조교를 하고 있다. 아빠가 수업한 내용을 학생들이 잘 이해했는지 문제를 통해서 확인해보자.

입력의 크기 n이 주어지면 MenOfPassion 알고리즘 수행 시간을 예제 출력과 같은 방식으로 출력해보자.

MenOfPassion 알고리즘은 다음과 같다.

MenOfPassion(A[], n) {
    sum <- 0;
    for i <- 1 to n - 2
        for j <- i + 1 to n - 1
            for k <- j + 1 to n
                sum <- sum + A[i] × A[j] × A[k]; # 코드1
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
35
3
코드1 이 35회 수행되고 알고리즘의 수행 시간이 n3에 비례한다.
 */
package b24267;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        long cnt = 0;
        long sum = 0;
        // i : 1 / j : 2~6 / k : 3~7 (5+4+3+2+1 = 15)
        // i : 1~2 / j : 3~6 / k : 4~7 (4+3+2+1 = 10)
        // i : 1~3 / j : 4~6 / k : 5~7 (3+2+1 = 6)
        // i : 1~4 / j : 5~6 / k : 6~7 (2+1 = 3)
        // i : 1~5 / j : 6 / k : 7 (1)

        for (int i = 1; i < n - 1; i++) {
            cnt += i;
            sum += cnt;
        }
        System.out.println(sum);
        System.out.println(3);
    }
}
