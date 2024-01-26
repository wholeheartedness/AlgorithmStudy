/*
🖥️ [기하: 직사각형과 삼각형] 1085번 문제 : 직사각형에서 탈출
🖥️ https://www.acmicpc.net/problem/1085

한수는 지금 (x, y)에 있다. 직사각형은 각 변이 좌표축에 평행하고, 왼쪽 아래 꼭짓점은 (0, 0), 오른쪽 위 꼭짓점은 (w, h)에 있다.
직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 x, y, w, h가 주어진다.

출력
첫째 줄에 문제의 정답을 출력한다.

제한
1 ≤ w, h ≤ 1,000
1 ≤ x ≤ w-1
1 ≤ y ≤ h-1
x, y, w, h는 정수
예제 입력 1
6 2 10 3
예제 출력 1
1
예제 입력 2
1 1 5 5
예제 출력 2
1
예제 입력 3
653 375 1000 1000
예제 출력 3
347
예제 입력 4
161 181 762 375
예제 출력 4
161
 */
package Week8_1_4.b1085;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int x = Integer.parseInt(str[0]);
        int y = Integer.parseInt(str[1]);
        int w = Integer.parseInt(str[2]);
        int h = Integer.parseInt(str[3]);

        // w에서 x 빼 값 변수 만들어
        // h에서 y 뺀 값 변수 만들어
        // x가 더 작으면 x
        // y가 더 작으면 y
        // 그리고 최종적으로 둘 중 더 작은 값 출력

        int wx = w - x;
        int hy = h - y;
        int xwx = Math.min(x, wx);
        int yhy = Math.min(y, hy);
        System.out.println(Math.min(xwx, yhy));
    }
}
