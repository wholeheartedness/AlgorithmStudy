package b2941;

import java.util.Scanner;

public class otherSolution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String cral = sc.next();

        String [] list = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for(String i : list) {
            cral = cral.replaceAll(i,"a");
        }

        System.out.println(cral.length());

    }
}