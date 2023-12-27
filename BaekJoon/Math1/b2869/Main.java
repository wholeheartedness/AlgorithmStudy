/*
🖥️ [일반 수학1] 2869번 문제 : 달팽이는 올라가고싶다
🖥️ https://www.acmicpc.net/problem/2869
문제
땅 위에 달팽이가 있다. 이 달팽이는 높이가 V미터인 나무 막대를 올라갈 것이다.

달팽이는 낮에 A미터 올라갈 수 있다. 하지만, 밤에 잠을 자는 동안 B미터 미끄러진다. 또, 정상에 올라간 후에는 미끄러지지 않는다.

달팽이가 나무 막대를 모두 올라가려면, 며칠이 걸리는지 구하는 프로그램을 작성하시오.

입력
첫째 줄에 세 정수 A, B, V가 공백으로 구분되어서 주어진다. (1 ≤ B < A ≤ V ≤ 1,000,000,000)

출력
첫째 줄에 달팽이가 나무 막대를 모두 올라가는데 며칠이 걸리는지 출력한다.

예제 입력 1
2 1 5
예제 출력 1
4
예제 입력 2
5 1 6
예제 출력 2
2
예제 입력 3
100 99 1000000000
예제 출력 3
999999901
 */
package b2869;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int A = Integer.parseInt(s[0]); // 낮에 A미터 올라가
        int B = Integer.parseInt(s[1]); // 밤에 B미터 떨어져
        int V = Integer.parseInt(s[2]); // 나무 길이 V

        // A - B = 달팽이가 하루동안 올라가는 거리
        int day =  (V - B - 1) / (A - B) + 1;

        System.out.println(day);
    }
}
