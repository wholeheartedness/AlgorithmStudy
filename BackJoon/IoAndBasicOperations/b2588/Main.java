/*
🖥️ 백준 2588 - 곱셈
🖥️ 링크 : https://www.acmicpc.net/problem/2588

문제
(세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.



(1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에
들어갈 값을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가,
둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.

출력
첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.
 */
package IoAndBasicOperations.b2588;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputA, inputB, a, b, c = 0;


        inputA = sc.nextInt();
        inputB = sc.nextInt();
        if (!(inputA >= 100 && inputA <=999) && (inputB >= 100 && inputB <=999)){
            throw new IllegalArgumentException ("범위를 다시 입력하세요");
        } else {
            a = inputA * (inputB % 10);
            b = inputA * ((inputB / 10) % 10);
            c = inputA * ((inputB / 100) % 10);
        }

        int sum = a + (b*10) + (c*100);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(sum);

    }
}
