package main.BasicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ProblemCategory {
    public static void main(String[] args) throws IOException {
        int T;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            String result;
            int x = Integer.parseInt(br.readLine());
            if (x < 100) result = "Easy";
            else if (x < 200) result = "Medium";
            else result = "Hard";
            System.out.println(result);
        }
    }
}
