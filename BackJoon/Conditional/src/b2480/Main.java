/*
🖥️ 백준 2480번 주사위 세개
🖥️ 링크 : https://www.acmicpc.net/problem/2480

문제
1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다.

같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
예를 들어, 3개의 눈 3, 3, 6이 주어지면 상금은 1,000+3×100으로 계산되어 1,300원을 받게 된다.
또 3개의 눈이 2, 2, 2로 주어지면 10,000+2×1,000 으로 계산되어 12,000원을 받게 된다. 3개의 눈이 6, 2, 5로 주어지면 그중 가장 큰 값이 6이므로 6×100으로 계산되어 600원을 상금으로 받게 된다.

3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성 하시오.

입력
첫째 줄에 3개의 눈이 빈칸을 사이에 두고 각각 주어진다.

출력
첫째 줄에 게임의 상금을 출력 한다.
 */

package b2480;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        // 입력을 받아 배열로 넣는다
        String[] strSplit = input.split(" ");
        int a = Integer.parseInt(strSplit[0]);
        int b = Integer.parseInt(strSplit[1]);
        int c = Integer.parseInt(strSplit[2]);

        int money;

        // 같은 눈 3개가 나왔을 때
        // 10,000원 * 같은 눈 * 1000원 반환
        if ( a == b && b == c) {
            money = 10000 + a * 1000;
        }
        // 같은눈 2개가 나왔을 때
        // 1000 * 같은 눈 * 100원 반환
        else if ( a == b || b == c) {
            money = 1000 + b * 100;
        }
        else if ( a == c){
            money = 1000 + c * 100;
        }
        // 모두 다른 눈 나왔을 때
        // 가장 큰 눈 * 100원 반환
        else {
            int[] arr = new int[]{a, b, c};
            Arrays.sort(arr);   // 배열을 정렬하고
            int max = arr[arr.length - 1]; //가장 큰수가 마지막 위치에 있으니까 length에서 1을 빼줌 (1번째 : 0이라서)
            money = max * 100;
        }
        System.out.println(money);
    }
}
