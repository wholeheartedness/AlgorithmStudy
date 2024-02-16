/*
🖥️ [정렬] 2751번 문제 : 수 정렬하기 2
🖥️ https://www.acmicpc.net/problem/2751
문제
N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.

입력
첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수가 주어진다.
이 수는 절댓값이 1,000,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.

출력
첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.

예제 입력 1
5
5
4
3
2
1
예제 출력 1
1
2
3
4
5
 */
package Week12_2_3.b2751;

import java.io.*;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //⚠️BufferedWriter : sout과 유사 => sout보다 훨씬 빠름
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        //시간초과
//        Set<Integer> set = new HashSet<>();
//        for (int i = 0; i < n; i++) {
//            int k = Integer.parseInt(br.readLine());
//            set.add(k);
//        }
//
//        set.stream().sorted().forEach(System.out::println);

        // 입력 받을 때 마다 정렬하기 (TreeSet)
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < n ; i++) {
            int k = Integer.parseInt(br.readLine());
            set.add(k);
        }

        for (int num : set) {
            bw.write(num + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
