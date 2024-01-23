/*
🖥️ [배수와 약수 2] 1934번 문제 : 최소공배수
🖥️ https://www.acmicpc.net/problem/1934

문제
두 자연수 A와 B에 대해서, A의 배수이면서 B의 배수인 자연수를 A와 B의 공배수라고 한다. 이런 공배수 중에서 가장 작은 수를 최소공배수라고 한다.
예를 들어, 6과 15의 공배수는 30, 60, 90등이 있으며, 최소 공배수는 30이다.

두 자연수 A와 B가 주어졌을 때, A와 B의 최소공배수를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다. 둘째 줄부터 T개의 줄에 걸쳐서 A와 B가 주어진다. (1 ≤ A, B ≤ 45,000)

출력
첫째 줄부터 T개의 줄에 A와 B의 최소공배수를 입력받은 순서대로 한 줄에 하나씩 출력한다.

예제 입력 1
3
1 45000
6 10
13 17
예제 출력 1
45000
30
221
 */
package b1934;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        List<Integer> lists = new ArrayList<>();
        int A = 0;
        int B = 0;
        int multiple = 1;

        for (int i = 0; i < T; i++) {
            String[] str = br.readLine().split(" ");
            int myA = Integer.parseInt(str[0]);
            int myB = Integer.parseInt(str[1]);
//            System.out.println(myA);
//            System.out.println(myB);
            // divisor가 true면 계속 list에 추가
            if (myA != myB) {
                for (int j = 2; j < Math.max(myA, myB); j++) {
                    while (isDivisor(myA, myB, j)) {
                        lists.add(j);
//                        System.out.println("공약수 :" + j);
                        myA /= j;
//                        System.out.println("공약수 나누 값 A :" + myA);
                        myB /= j;
//                        System.out.println("공약수 나누 값 B : " + myB);
                    }
                }
                for (int list : lists) {
                    multiple *= list;
//                    System.out.println("multiple :" + multiple);
                }
                System.out.println(myA * myB * multiple);
                multiple = 1;
                lists.clear();
            }
            else {
                System.out.println(myA);
            }
        }
    }

    static boolean isDivisor(int a, int b, int j) {
        if (a % j == 0 && b % j == 0) {
            return true;
        } else return false;
    }
}
