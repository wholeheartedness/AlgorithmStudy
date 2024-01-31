/*
🖥️[시간복잡도] 24264번 문제 : 알고리즘 수업 - 알고리즘의 수행 시간 3
🖥️https://www.acmicpc.net/problem/24264
문제
오늘도 서준이는 알고리즘의 수행시간 수업 조교를 하고 있다. 아빠가 수업한 내용을 학생들이 잘 이해했는지 문제를 통해서 확인해보자.

입력의 크기 n이 주어지면 MenOfPassion 알고리즘 수행 시간을 예제 출력과 같은 방식으로 출력해보자.

MenOfPassion 알고리즘은 다음과 같다.

MenOfPassion(A[], n) {
    sum <- 0;
    for i <- 1 to n
        for j <- 1 to n
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
49
2
코드1 이 49회 수행되고 알고리즘의 수행 시간이 n2에 비례한다.

출처
문제를 검수한 사람: heeda0528, jhnah917, jthis, tlsdydaud1
문제를 만든 사람: MenOfPassion
알고리즘 분류
보기

메모
 */
package b24264;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());

        System.out.println(n * n);
        System.out.println(2);

    }

    public static int MenOfPassion(int n) {
        int sum = 0; // <- 0;
        int cnt = 0;
        //for i <- 1 to n
        //for j <- 1 to n
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
//                sum <- sum + A[i] × A[j]; # 코드1
                sum = sum + i * j;
            }
        }
        return sum;
    }
}
