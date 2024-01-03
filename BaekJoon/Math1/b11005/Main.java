/*
🖥️[일반 수학1] 11005번 문제 : 진법 변환 2
🖥️https://www.acmicpc.net/problem/11005
문제
10진법 수 N이 주어진다. 이 수를 B진법으로 바꿔 출력하는 프로그램을 작성하시오.

10진법을 넘어가는 진법은 숫자로 표시할 수 없는 자리가 있다. 이런 경우에는 다음과 같이 알파벳 대문자를 사용한다.

A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35

입력
첫째 줄에 N과 B가 주어진다. (2 ≤ B ≤ 36) N은 10억보다 작거나 같은 자연수이다.

출력
첫째 줄에 10진법 수 N을 B진법으로 출력한다.

예제 입력 1
60466175 36
예제 출력 1
ZZZZZ
 */
package b11005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        //10진법 수 N
        int N = Integer.parseInt(s[0]);
        // 변환할 진법 B
        int B = Integer.parseInt(s[1]);
        List<String> 출력 = new ArrayList<>();
        //아스키 A : 65 ~ 아스키 Z : 90
        // 아스키 0 : 48 ~ 아스키 9 : 57

        while(N > 0) {
            int 변환 = N % B;
            int trans;
            if(변환 > 9) trans = 변환 + 55;
            else trans = 변환 + 48;
            출력.add(String.valueOf((char) trans));
            N = N/B;
        }
        Collections.reverse(출력);
        for(String str : 출력) {
            System.out.print(str);
        }
    }
}
