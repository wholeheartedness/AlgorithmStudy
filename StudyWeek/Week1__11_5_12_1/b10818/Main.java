/*
🖥️ 백준 10818번 - 최대 최소
🖥️ 링크 : https://www.acmicpc.net/problem/10818

문제
N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.

출력
첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.

예제 입력 1
5
20 10 35 30 7
예제 출력 1
7 35
*/

package Week1__11_5_12_1.b10818;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // scanner로 입력 받을 정수 갯수 받기
        int count = sc.nextInt();
        int[] numArray = new int[count];

        // count 범위 지정하기
        if (count <= 0 || count >= 1000001) {
            throw new ArrayIndexOutOfBoundsException("count 범위 초과");
        } else {
            // scanner로 입력 받아 배열 만들기
            int inputNum;
            for (int i = 0; i < count; i++) {
                numArray[i] = sc.nextInt();
                if (numArray[i] < -1000000 || numArray[i] > 1000000) {
                    throw new ArrayIndexOutOfBoundsException("최소, 최대 범위 초과");
                }
            }
        }

        // 최솟값, 최댓값 초기화
        int max = numArray[0];
        int min = numArray[0];

        // 최솟값, 최댓값 찾기 (비교)
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] > max) {
                max = numArray[i];
            }
        }
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] < min) {
                min = numArray[i];
            }
        }

        //출력
        System.out.println("min : " + min);
        System.out.println("max : " + max);
    }
}




