/*
🖥️ [정렬] 25305번 문제: 커트라인
🖥️ https://www.acmicpc.net/problem/25305
문제
2022 연세대학교 미래캠퍼스 슬기로운 코딩생활에
$N$명의 학생들이 응시했다.

이들 중 점수가 가장 높은
$k$명은 상을 받을 것이다. 이 때, 상을 받는 커트라인이 몇 점인지 구하라.

커트라인이란 상을 받는 사람들 중 점수가 가장 가장 낮은 사람의 점수를 말한다.

입력
첫째 줄에는 응시자의 수
$N$과 상을 받는 사람의 수
$k$가 공백을 사이에 두고 주어진다.

둘째 줄에는 각 학생의 점수
$x$가 공백을 사이에 두고 주어진다.

출력
상을 받는 커트라인을 출력하라.

제한
 
$1 ≤ N ≤ 1\,000$ 
 
$1 ≤ k ≤ N$ 
 
$0 ≤ x ≤ 10\,000$ 
예제 입력 1
5 2
100 76 85 93 98
예제 출력 1
98
 */
package Week12_2_3.b25305;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        List<Integer> list = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(st.nextToken());
            list.add(n);
        }
        list.sort(Comparator.reverseOrder());

        System.out.println(list.get(k-1));
    }
}
