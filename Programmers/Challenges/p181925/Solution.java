/*
🖥️ 프로그래머스 - 181925번 문제 : 수 조작하기2
🖥️ https://school.programmers.co.kr/learn/courses/30/lessons/181925
 */
package p181925;

import java.util.ArrayList;
import java.util.List;
public class Solution {
static List<Integer>list = new ArrayList();
static List<String>tr = new ArrayList();
    public static String solution(int[] numLog) {
        int[] arr = new int[numLog.length];
        for (int i = 1; i < numLog.length; i++) {
            int a = numLog[i] - numLog[i-1];
            list.add(a);
        }
        for(int n : list) {
            switch (n) {
                case 1 : tr.add("w"); break;
                case -1 : tr.add("s"); break;
                case 10 : tr.add("d"); break;
                case -10 : tr.add("a"); break;
            }
        }

        StringBuilder br = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            br.append(tr.get(i));
        }
        return br.toString();
    }
    public static void main(String[] args) {
        int[] numLog= new int[]{0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
        System.out.println(Solution.solution(numLog));
    }
}
