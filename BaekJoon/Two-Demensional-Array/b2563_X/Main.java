package b2563_X;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[][] p = new int[t][2];
        int m = 0;

        for (int i = 0; i < t; i++) {
            String[] s = br.readLine().split(" ");
            p[i][0] = Integer.parseInt(s[0]); //가로
            p[i][1] = Integer.parseInt(s[1]); // 세로
        }

        for (int i = 0; i < t; i++) {
            for (int j = 0; j < t; j++) {
                if ( p[i][0] > p[j][0] && p[i][0] - p[j][0] < 10
                ||  p[i][0] < p[j][0] && p[j][0] - p[i][0] < 10) {
                    int x = (Math.min(p[i][0], p[j][0]) + 10) - Math.max(p[i][0], p[j][0]);
                    int y = (Math.min(p[i][1], p[j][1]) + 10) - Math.max(p[i][1], p[j][1]);
                    m += (x*y)/2;
                }
            }
        }
        System.out.println(100*t - m);
    }
}
