/*
🖥️ [기하: 직사각형과 삼각형] 3009번 문제 : 네번째 점
🖥️ https://www.acmicpc.net/problem/3009
 */
package b3009;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 각 줄마다 한번 나온 애들만 다시 출력
        List<Integer> listW = new ArrayList<>();
        List<Integer> listH = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            String[] str = br.readLine().split(" ");
            int A = Integer.parseInt(str[0]);
            listW.add(A);
            int B = Integer.parseInt(str[1]);
            listH.add(B);
        }

        if (listW.get(0).equals(listW.get(1)))  System.out.print(listW.get(2) + " ");
        else if (listW.get(0).equals(listW.get(2))) System.out.print(listW.get(1) + " ");
        else System.out.print(listW.get(0) + " ");

        if (listH.get(0).equals(listH.get(1)))  System.out.print(listH.get(2));
        else if (listH.get(0).equals(listH.get(2))) System.out.print(listH.get(1));
        else System.out.print(listH.get(0));
    }
}
