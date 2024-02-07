/*
🖥️[브루트포스] 2231번 문제 : 분해합
🖥️https://www.acmicpc.net/problem/2231
문제
어떤 자연수 N이 있을 때, 그 자연수 N의 분해합은 N과 N을 이루는 각 자리수의 합을 의미한다.
어떤 자연수 M의 분해합이 N인 경우, M을 N의 생성자라 한다.
예를 들어, 245의 분해합은 256(=245+2+4+5)이 된다. 따라서 245는 256의 생성자가 된다.
물론, 어떤 자연수의 경우에는 생성자가 없을 수도 있다.
반대로, 생성자가 여러 개인 자연수도 있을 수 있다.

자연수 N이 주어졌을 때, N의 가장 작은 생성자를 구해내는 프로그램을 작성하시오.

입력
첫째 줄에 자연수 N(1 ≤ N ≤ 1,000,000)이 주어진다.

출력
첫째 줄에 답을 출력한다. 생성자가 없는 경우에는 0을 출력한다.

예제 입력 1
216
예제 출력 1
198
 */
package Week11_2_2.b2231;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> same = new ArrayList<>();

        // n까지 반복
        for (int i = 0; i < n; i++) {
            int sum = i;
            for (int num : findNum(i)) {
                sum += num;
            }

            // 생성자면 same에 추가
            if (sum == n) same.add(i);
        }

        if (same.isEmpty()) System.out.println(0);
        else System.out.println(same.get(0));
    }

    //각 자리수를 구하는 함수
    public static List<Integer> findNum(int n) {
        List<Integer> list = new ArrayList<>();
        int quo;
        int div = 100000;
        for (int i = 0; i < 6; i++) {
            quo = n / div;
            if (quo != 0) list.add(quo);
            n %= div;
            div /= 10;
        }
        return list;
    }
}
