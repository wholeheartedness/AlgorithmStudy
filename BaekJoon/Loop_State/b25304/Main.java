/*
🖥️ 백준 25304번 영수증
🖥️ 링크 : https://www.acmicpc.net/problem/25304
문제
영수증에 적힌,

구매한 각 물건의 가격과 개수
구매한 물건들의 총 금액
을 보고, 구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하는지 검사해보자.

입력
첫째 줄에는 영수증에 적힌 총 금액
$X$가 주어진다.

둘째 줄에는 영수증에 적힌 구매한 물건의 종류의 수
$N$이 주어진다.

이후
$N$개의 줄에는 각 물건의 가격
$a$와 개수
$b$가 공백을 사이에 두고 주어진다.

출력
구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하면 Yes를 출력한다.
일치하지 않는다면 No를 출력한다.
 */
package b25304;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 영수증에 적힌 총 금액 X
        int X = Integer.parseInt(br.readLine());
        // 영수증에 적힌 구매한 물건의 종류 수 N
        int N = Integer.parseInt(br.readLine());
        // N개의 줄 입력 받음 -> a(가격) b(개수)

        int[] price = new int[N];
        int[] qty = new int[N];
        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            String[] arrSplit = input.split(" ");
            price[i] = Integer.parseInt(arrSplit[0]);
            qty[i] = Integer.parseInt(arrSplit[1]);
        }

        // 총금액 X와 price * qty 의 총 합 sum 비교
        int[] sumArr = new int[N];
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sumArr[i] = price[i] * qty[i];
        }
        for (int j = 0; j < N; j++) {
            sum += sumArr[j];
        }
        if (sum == X) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
