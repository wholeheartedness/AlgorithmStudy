/*
🖥️ [심화1단계] 25206번 문제 : 너의 평점은
🖥️ https://www.acmicpc.net/problem/25206
문제
인하대학교 컴퓨터공학과를 졸업하기 위해서는, 전공평점이 3.3 이상이거나 졸업고사를 통과해야 한다. 그런데 아뿔싸, 치훈이는 깜빡하고 졸업고사를 응시하지 않았다는 사실을 깨달았다!

치훈이의 전공평점을 계산해주는 프로그램을 작성해보자.

전공평점은 전공과목별 (학점 × 과목평점)의 합을 학점의 총합으로 나눈 값이다.

인하대학교 컴퓨터공학과의 등급에 따른 과목평점은 다음 표와 같다.

A+	4.5
A0	4.0
B+	3.5
B0	3.0
C+	2.5
C0	2.0
D+	1.5
D0	1.0
F	0.0
P/F 과목의 경우 등급이 P또는 F로 표시되는데, 등급이 P인 과목은 계산에서 제외해야 한다.

과연 치훈이는 무사히 졸업할 수 있을까?

입력
20줄에 걸쳐 치훈이가 수강한 전공과목의 과목명, 학점, 등급이 공백으로 구분되어 주어진다.

출력
치훈이의 전공평점을 출력한다.

정답과의 절대오차 또는 상대오차가
\(10^{-4}\) 이하이면 정답으로 인정한다.

제한
1 ≤ 과목명의 길이 ≤ 50
과목명은 알파벳 대소문자 또는 숫자로만 이루어져 있으며, 띄어쓰기 없이 주어진다. 입력으로 주어지는 모든 과목명은 서로 다르다.
학점은 1.0,2.0,3.0,4.0중 하나이다.
등급은 A+,A0,B+,B0,C+,C0,D+,D0,F,P중 하나이다.
적어도 한 과목은 등급이 P가 아님이 보장된다.
예제 입력 1
ObjectOrientedProgramming1 3.0 A+
IntroductiontoComputerEngineering 3.0 A+
ObjectOrientedProgramming2 3.0 A0
CreativeComputerEngineeringDesign 3.0 A+
AssemblyLanguage 3.0 A+
InternetProgramming 3.0 B0
ApplicationProgramminginJava 3.0 A0
SystemProgramming 3.0 B0
OperatingSystem 3.0 B0
WirelessCommunicationsandNetworking 3.0 C+
LogicCircuits 3.0 B0
DataStructure 4.0 A+
MicroprocessorApplication 3.0 B+
EmbeddedSoftware 3.0 C0
ComputerSecurity 3.0 D+
Database 3.0 C+
Algorithm 3.0 B0
CapstoneDesigninCSE 3.0 B+
CompilerDesign 3.0 D0
ProblemSolving 4.0 P
예제 출력 1
3.284483
 */
package b25206;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 배열에 학점과 등급을 넣는다
        double[][] arr = new double[20][2];
        int 신청학점 = 0;
        for (int i = 0; i < 20; i++) {
            String[] line = br.readLine().split(" ");
            arr[i][0] = Double.parseDouble(line[1]); //학점
            double ss = 0;
            switch (line[2]) {
                case "A+" : ss = 4.5d;
                break;
                case "A0" : ss = 4.0d;
                    break;
                case "B+" : ss = 3.5d;
                    break;
                case "B0" : ss = 3.0d;
                    break;
                case "C+" : ss = 2.5d;
                    break;
                case "C0" : ss = 2.0d;
                    break;
                case "D+" : ss = 1.5d;
                    break;
                case "D0" : ss = 1.0d;
                    break;
                case "F" : ss = 0.0d;
                    break;
                case "P" : {
                    arr[i][0] = 0;
                    ss = 0;
                }
            }
            arr[i][1] = ss; //과목평점
            신청학점 += arr[i][0];
        }

        double sum = 0;

        // 전공 과목별 학점 : 학점*과목평점 + .. + 학점*과목평점
        // 전공평점 : (학점*과목평점 + .. + 학점*과목평점) / 학점
        // 배열에 arr[i][1] 이 P인 것은 계산에 넣지 않는다
            //notcnt ++ 한다. 그리고 나눌 때 (20-notcnt)

        for (int i = 0; i < 20; i++) {
            double lecture = arr[i][0]*arr[i][1];
            sum += lecture;

        }

        System.out.println(sum/(신청학점));
    }
}
