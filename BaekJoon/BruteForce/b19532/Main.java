/*
🖥️ [브루트포스] 19532번 문제 : 수학은 수학은 비대면강의입니다
🖥️️ https://www.acmicpc.net/problem/19532
 */
package b19532;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());

        for (int i = -999; i <= 999; i++) {
            for (int j = -999; j <= 999; j++) {
                if ((a * i + b * j - c == 0) && (d * i + e * j - f == 0)) {
                    System.out.println(i + " " + j);
                }
            }
        }
    }
}
