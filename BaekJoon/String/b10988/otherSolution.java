package String.b10988;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class otherSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();

        int check = 1;
        for(int i = 0; i < word.length(); i++){
            if (word.charAt(i) == word.charAt(word.length() - 1 - i)) {
                check = 1;
            }else{
                check = 0;
                break;
            }
        }
        System.out.println(check);


    }
}

