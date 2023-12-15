/*
🖥️ [구현, 문자열] 10988번 문제 : 팰린드롬인지 확인하기
🖥️ http://boj.kr/10988


문제
알파벳 소문자로만 이루어진 단어가 주어진다. 이때, 이 단어가 팰린드롬인지 아닌지 확인하는 프로그램을 작성하시오.

팰린드롬이란 앞으로 읽을 때와 거꾸로 읽을 때 똑같은 단어를 말한다.

level, noon은 팰린드롬이고, baekjoon, online, judge는 팰린드롬이 아니다.

입력
첫째 줄에 단어가 주어진다. 단어의 길이는 1보다 크거나 같고, 100보다 작거나 같으며, 알파벳 소문자로만 이루어져 있다.

출력
첫째 줄에 팰린드롬이면 1, 아니면 0을 출력한다.

예제 입력 1
level
예제 출력 1
1
예제 입력 2
baekjoon
예제 출력 2
0
 */
package String.b10988;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        //짝수일때는 센터가  2 : 없음 다 똑같아야 함 4: 1번 2번 / 6 : 2 3
        // 홀수 일때는 센터가 1 : 다 똑같 3 : 1 5: 2 7 -> 3
        int num = -1;
        int length = line.length();
        if (length == 1) num = 1;
        else if (length == 2) num = (length == 2 && line.charAt(0) == line.charAt(1)) ? 1 : 0;
        else if (length > 2 && length % 2 == 1){
            for (int i = 0; i < length / 2; i++) {
                num = (line.charAt(length / 2 + i) == line.charAt(length / 2 - i)) ? 1 : 0 ;
                if (num==0) break;
            }
        } else {
            for (int i = 0; i < length / 2; i++) {
                num = (line.charAt(length / 2 + i)  == line.charAt(length / 2 - i -1)) ? 1 : 0 ;
                if (num==0) break;
            }
        }
        System.out.println(num);
    }
}


