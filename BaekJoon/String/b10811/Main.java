/*
🖥️[문자열]10811번 문제 : 바구니 뒤집기
🖥️https://www.acmicpc.net/problem/10811
문제
도현이는 바구니를 총 N개 가지고 있고, 각각의 바구니에는 1번부터 N번까지 번호가 순서대로 적혀져 있다.
 ,........바구니는 일렬로 놓여져 있고, 가장 왼쪽 바구니를 1번째 바구니, 그 다음 바구니를 2번째 바구니, ..., 가장 오른쪽 바구니를 N번째 바구니라고 부른다.

도현이는 앞으로 M번 바구니의 순서를 역순으로 만들려고 한다. 도현이는 한 번 순서를 역순으로 바꿀 때, 순서를 역순으로 만들 범위를 정하고, 그 범위에 들어있는 바구니의 순서를 역순으로 만든다.

바구니의 순서를 어떻게 바꿀지 주어졌을 때, M번 바구니의 순서를 역순으로 만든 다음, 바구니에 적혀있는 번호를 가장 왼쪽 바구니부터 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 N (1 ≤ N ≤ 100)과 M (1 ≤ M ≤ 100)이 주어진다.

둘째 줄부터 M개의 줄에는 바구니의 순서를 역순으로 만드는 방법이 주어진다. 방법은 i j로 나타내고, 왼쪽으로부터 i번째 바구니부터 j번째 바구니의 순서를 역순으로 만든다는 뜻이다. (1 ≤ i ≤ j ≤ N)

도현이는 입력으로 주어진 순서대로 바구니의 순서를 바꾼다.

출력
모든 순서를 바꾼 다음에, 가장 왼쪽에 있는 바구니부터 바구니에 적혀있는 순서를 공백으로 구분해 출력한다.
 */
package String.b10811;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //바구니 수 N과 몇번 입력받을지를 선택하는 M을 입력 받는다
        //바구니 수 N 만큼의 (인덱스는 N-1) 배열을 만든다
        //바구니 arrN를 초기화 한다
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        int[] arrN = new int[N];
        for (int i = 0; i < N; i++) {
            arrN[i] = i+1;
        }
        //M번 입력 받는데
        // start부터 last까지의 바구니의 숫자를 바꾼다
        // 만약 1부터 4까지 바꾼다면, arr[0 (i-1) ] = //start = 1, arr[3 (i-1) last = 4
        //
        for (int i = 0; i < M; i++) {
            String[] line = br.readLine().split(" ");
            int start = Integer.parseInt(line[0]);
            int last = Integer.parseInt(line[1]);
            for (int j = last-1; j >= start-1; j--) {
                int save = arrN[j];
                arrN[j] = arrN[start-1];
                arrN[start-1] = save;
                start++;
            }
        }
        for (int j : arrN) {
            System.out.print(j + " ");
        }
    }
}
