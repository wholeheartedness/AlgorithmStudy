/*
🖥️ 백준 - 9498번 문제 : 시험 성적
🖥️ https://www.acmicpc.net/problem/9498
* */


package b9498;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int line = Integer.parseInt(br.readLine());
        if (line < 60) {
            System.out.println("F");
        } else if (line >= 60 && line < 70) {
            System.out.println("D");
        } else if (line >= 70 && line < 80) {
            System.out.println("C");
        } else if (line >= 80 && line < 90) {
            System.out.println("B");
        } else {
            System.out.println("A");
        }
    }
}
