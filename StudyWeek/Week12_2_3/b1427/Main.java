/*
🖥️ [정렬] 1427번 문제 : 소트인사이드
🖥️ https://www.acmicpc.net/problem/1427
문제
배열을 정렬하는 것은 쉽다. 수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬해보자.

입력
첫째 줄에 정렬하려고 하는 수 N이 주어진다. N은 1,000,000,000보다 작거나 같은 자연수이다.

출력
첫째 줄에 자리수를 내림차순으로 정렬한 수를 출력한다.

예제 입력 1
2143
예제 출력 1
4321
예제 입력 2
999998999
예제 출력 2
999999998
예제 입력 3
61423
예제 출력 3
64321
예제 입력 4
500613009
예제 출력 4
965310000
 */
package Week12_2_3.b1427;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st = new StringTokenizer(br.readLine(), "");
        List<String> list = new ArrayList<>();
        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            String num = String.valueOf(str.charAt(i));
            list.add(num);
        }

        list.sort(Comparator.reverseOrder());
        for (String n : list) {
            bw.write(n + ""); // 숫자를 문자열로 변환해서 출력하게되므로 형변환 필요x
//            bw.write( (int) n); // 이렇게 하면 필요??
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
